package com.zjl.myneteaseapp.base

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.gyf.immersionbar.ImmersionBar
import com.zjl.myneteaseapp.R

/**
 * Project Name: MyNetEaseApp
 * ClassName:    BaseActivity
 *
 * Description: activity基类
 *
 * @author  zjl
 * @date    2022年01月29日 10:50
 *
 * Copyright (c) 2022年, 4399 Network CO.ltd. All Rights Reserved.
 */
abstract class BaseActivity <T: ViewBinding> : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getViewBinding().root)
        initStatusBar()

    }

    private fun initStatusBar() {
        if (shouldApplyStatusBar()) {
            supportActionBar?.hide()
            ImmersionBar.with(this)
                .statusBarDarkFont(isStatusBarDarkFont())
                .navigationBarColor(R.color.white)
                .autoDarkModeEnable(true)
                .supportActionBar(false)
                .init()
        }
    }

    /**
     * 获取layout Id
     *
     * @return
     */
    abstract fun getViewBinding(): T

    /**
     * 初始化数据
     */
    open fun initData() {

    }

    /**
     * 初始化view
     */
    open fun initView() {

    }

    /**
     * 是否黑色主题
     */
    open fun isStatusBarDarkFont(): Boolean = true

    /**
     * 是否需要启用透明状态栏
     */
    open fun shouldApplyStatusBar(): Boolean = true
}