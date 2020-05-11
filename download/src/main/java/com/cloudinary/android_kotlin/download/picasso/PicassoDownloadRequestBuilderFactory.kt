package com.cloudinary.android_kotlin.download.picasso

import android.content.Context
import com.cloudinary.Cloudinary
import com.cloudinary.android_kotlin.core.download.DownloadRequestBuilder
import com.cloudinary.android_kotlin.core.download.DownloadRequestBuilderFactory
import com.cloudinary.android_kotlin.download.DownloadRequestBuilderImpl

class PicassoDownloadRequestBuilderFactory : DownloadRequestBuilderFactory {

    override fun createDownloadRequestBuilder(context: Context, cloudinary: Cloudinary): DownloadRequestBuilder {
        return DownloadRequestBuilderImpl(context, cloudinary, PicassoDownloadRequestBuilderStrategy(context))
    }
}