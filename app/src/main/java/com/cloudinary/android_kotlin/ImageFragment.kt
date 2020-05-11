package com.cloudinary.android_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cloudinary.android_kotlin.core.download
import com.cloudinary.transformation.Rotate
import com.cloudinary.transformation.transformation
import kotlinx.android.synthetic.main.fragment_image.view.*

class ImageFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = ImageFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_image, container, false)

        MainApplication.cloudinary.download(view.context)
            .load("sample")
            .transformation(transformation { rotate(Rotate.angle(78)) })
            .into(view.imageView)

        return view
    }

}
