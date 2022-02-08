package com.zjl.myneteaseapp.utils

import android.util.Log
import com.zjl.myneteaseapp.BuildConfig

/**
 * Project Name: MyNetEaseApp
 * ClassName:    EasyLogger
 *
 * Description:
 *
 * @author  zjl
 * @date    2022年02月08日 14:53
 *
 * Copyright (c) 2022年, 4399 Network CO.ltd. All Rights Reserved.
 */
//TODO 输出调用类相关的
object EasyLogger {

    private const val TAG = "EASY_LOGGER"

    fun v(message: String) {
        if (BuildConfig.DEBUG) {
            createLog(message).let {
                Log.v(TAG, it)
            }
        }
    }

    fun d(message: String) {
        if (BuildConfig.DEBUG) {
            createLog(message).let {
                Log.d(TAG, it)
            }
        }
    }

    fun i(message: String) {
        if (BuildConfig.DEBUG) {
            createLog(message).let {
                Log.i(TAG, it)
            }
        }
    }

    fun w(message: String) {
        if (BuildConfig.DEBUG) {
            createLog(message).let {
                Log.w(TAG, it)
            }
        }
    }

    fun e(message: String) {
        if (BuildConfig.DEBUG) {
            createLog(message).let {
                Log.e(TAG, it)
            }
        }
    }

    private fun createLog(content: String): String {
        val elements = Throwable().stackTrace
        val className = elements[1].fileName
        val methodName = elements[1].methodName
        val lineNumber = elements[1].lineNumber

        return StringBuffer().apply {
            append(className)
            append(":")
            append(methodName)
            append("():")
            append(lineNumber)
            append(":")
            append(content)
        }.toString()
    }
}