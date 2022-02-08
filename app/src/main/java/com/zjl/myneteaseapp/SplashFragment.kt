package com.zjl.myneteaseapp

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import com.zjl.myneteaseapp.base.BaseFragment
import com.zjl.myneteaseapp.databinding.FragmentSplashBinding

/**
 * Project Name: MyNetEaseApp
 * ClassName:    SplashFragment
 *
 * Description: 启动页
 *
 * @author  zjl
 * @date    2022年01月29日 14:19
 *
 * Copyright (c) 2022年, 4399 Network CO.ltd. All Rights Reserved.
 */
class SplashFragment : BaseFragment(){
    override fun getLayout() = R.layout.fragment_splash

    private val binding: FragmentSplashBinding by lazy { FragmentSplashBinding.inflate(layoutInflater) }

    override fun initView() {
        binding.lottieViewSplash.addAnimatorListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator?) {

            }
        })
    }
}