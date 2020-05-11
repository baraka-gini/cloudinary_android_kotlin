package com.cloudinary.android_kotlin

import android.app.Application
import android.net.Uri
import com.cloudinary.Cloudinary
import com.cloudinary.android_kotlin.core.cloudinaryUrlFromContext
import com.cloudinary.android_kotlin.core.setDownloadRequestBuilderFactory
import com.cloudinary.android_kotlin.download.picasso.PicassoDownloadRequestBuilderFactory
import com.cloudinary.config.AccountConfig
import com.cloudinary.config.ApiConfig
import com.cloudinary.config.Configuration
import com.cloudinary.config.UrlConfig

class MainApplication : Application() {

    companion object {
        lateinit var cloudinary: Cloudinary
    }

    override fun onCreate() {
        super.onCreate()

        val uri = Uri.parse(cloudinaryUrlFromContext(this))
        val configuration = Configuration(AccountConfig(cloudName = uri.host!!), UrlConfig(secure = true), ApiConfig())
        cloudinary = Cloudinary(configuration).apply {
            setDownloadRequestBuilderFactory(PicassoDownloadRequestBuilderFactory())
        }
    }
}