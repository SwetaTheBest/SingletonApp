package com.swetajain.singletonapp

import com.swetajain.singletonapp.models.Users

object MySingleton {

    val SingletonUser: Users by lazy {
        Users("sweta_jain@live.com", "Sweta", "swetaSmall.png")
    }
}