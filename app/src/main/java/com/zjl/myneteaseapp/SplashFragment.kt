package com.zjl.myneteaseapp

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import androidx.navigation.Navigation
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
class SplashFragment : BaseFragment<FragmentSplashBinding>(){

    override fun getViewBinding() = FragmentSplashBinding.inflate(layoutInflater)

    override fun initView() {
        binding.lottieViewSplash.speed = 3.0f
        binding.lottieViewSplash.addAnimatorListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator?) {
                activity?.let {
                    Navigation.findNavController(it, R.id.nav_host_fragment).navigate(R.id.action_splashFragment_to_mainFragment)

                }
            }
        })
    }
}