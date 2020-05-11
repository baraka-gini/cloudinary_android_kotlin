package com.cloudinary.android_kotlin.download.fresco

import com.cloudinary.android_kotlin.download.DownloadRequestStrategy

internal class FrescoDownloadRequestStrategy : DownloadRequestStrategy {

    override fun cancel() {
        throw UnsupportedOperationException("Fresco doesn't support cancellation of download requests.")
    }
}