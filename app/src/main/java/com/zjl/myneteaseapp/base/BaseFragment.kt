package com.zjl.myneteaseapp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Project Name: MyNetEaseApp
 * ClassName:    BaseFragment
 *
 * Description:
 *
 * @author  zjl
 * @date    2022年01月29日 14:12
 *
 * Copyright (c) 2022年, 4399 Network CO.ltd. All Rights Reserved.
 */
abstract class BaseFragment : Fragment() {

    var rootView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inflater.inflate(getLayout(), container, false).let {
            rootView = it
            return it
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initView()
    }

    /**
     * 获取布局id
     *
     * @return
     */
    abstract fun getLayout(): Int

    /**
     * 初始化数据
     *
     */
    open fun initData() {}


    /**
     * 初始化view
     *
     */
    open fun initView() {}
}