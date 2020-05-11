package com.cloudinary.android_kotlin.download.glide

import android.content.Context
import com.cloudinary.Cloudinary
import com.cloudinary.android_kotlin.core.download.DownloadRequestBuilderFactory
import com.cloudinary.android_kotlin.download.DownloadRequestBuilderImpl

class GlideDownloadRequestBuilderFactory : DownloadRequestBuilderFactory {

    override fun createDownloadRequestBuilder(context: Context, cloudinary: Cloudinary): DownloadRequestBuilderImpl {
        return DownloadRequestBuilderImpl(context, cloudinary, GlideDownloadRequestBuilderStrategy(context))
    }
}