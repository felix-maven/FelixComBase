package com.felix.combase

import android.app.Application

/**
 * @Author: Mingfa.Huang
 * @Date: 2020/12/5
 * @Des: IAppInit
 */
interface IAppInit {
    fun initModule(app: Application)
}