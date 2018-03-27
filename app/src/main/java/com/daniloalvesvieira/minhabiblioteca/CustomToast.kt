package com.daniloalvesvieira.minhabiblioteca

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast.view.*


/**
 * Created by logonrm on 26/03/2018.
 */

object CustomToast {

    fun showToast(context: Context, message: String) {

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val customToastView = inflater.inflate(R.layout.custom_toast, null)

        val customToast = Toast(context)

        customToast.view = customToastView

        val textView = customToastView.tvMessage

        textView.text = message

        customToast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customToast.duration = Toast.LENGTH_LONG * 10
        customToast.show()
    }
}