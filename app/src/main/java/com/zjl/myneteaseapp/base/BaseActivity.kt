package com.zjl.myneteaseapp.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

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
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
    }

    /**
     * 获取layout Id
     *
     * @return
     */
    abstract fun getLayout(): Int

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
}