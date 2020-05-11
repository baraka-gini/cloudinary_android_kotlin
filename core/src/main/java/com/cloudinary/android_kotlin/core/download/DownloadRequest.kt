package com.cloudinary.android_kotlin.core.download

/**
 * Represents an active download request (in progress).
 */
interface DownloadRequest {
    /**
     * Cancel the download request.
     */
    fun cancel()
}