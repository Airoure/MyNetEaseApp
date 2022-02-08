package com.zjl.myneteaseapp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

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
abstract class BaseFragment <T: ViewBinding> : Fragment() {

    var rootView: View? = null

    lateinit var binding: T

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getViewBinding()
        rootView = binding.root
        return rootView
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
    abstract fun getViewBinding(): T

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