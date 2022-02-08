package com.zjl.myneteaseapp

import com.zjl.myneteaseapp.base.BaseFragment
import com.zjl.myneteaseapp.databinding.FragmentMainBinding

/**
 * Project Name: MyNetEaseApp
 * ClassName:    MainFragment
 *
 * Description:
 *
 * @author  zjl
 * @date    2022年02月08日 14:48
 *
 * Copyright (c) 2022年, 4399 Network CO.ltd. All Rights Reserved.
 */
class MainFragment : BaseFragment<FragmentMainBinding>() {
    override fun getViewBinding() = FragmentMainBinding.inflate(layoutInflater)
}