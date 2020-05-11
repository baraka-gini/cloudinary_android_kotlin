package com.cloudinary.android_kotlin.download.fresco

import android.content.Context
import com.cloudinary.Cloudinary
import com.cloudinary.android_kotlin.core.download.DownloadRequestBuilder
import com.cloudinary.android_kotlin.core.download.DownloadRequestBuilderFactory
import com.cloudinary.android_kotlin.download.DownloadRequestBuilderImpl

class FrescoDownloadRequestBuilderFactory : DownloadRequestBuilderFactory {

    override fun createDownloadRequestBuilder(context: Context, cloudinary: Cloudinary): DownloadRequestBuilder {
        return DownloadRequestBuilderImpl(context, cloudinary, FrescoDownloadRequestBuilderStrategy(context))
    }
}