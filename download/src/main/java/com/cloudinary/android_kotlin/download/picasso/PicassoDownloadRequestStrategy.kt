package com.cloudinary.android_kotlin.download.picasso

import android.widget.ImageView
import com.cloudinary.android_kotlin.download.DownloadRequestStrategy
import com.squareup.picasso.Picasso

internal class PicassoDownloadRequestStrategy(
    private val picasso: Picasso,
    private val imageView: ImageView
) : DownloadRequestStrategy {

    override fun cancel() {
        picasso.cancelRequest(imageView)
    }
}