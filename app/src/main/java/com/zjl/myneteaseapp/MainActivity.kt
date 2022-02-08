package com.zjl.myneteaseapp

import com.zjl.myneteaseapp.base.BaseActivity
import com.zjl.myneteaseapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)

}