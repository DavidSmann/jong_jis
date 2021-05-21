package com.example.jongjis.request

import android.content.Context
import android.util.Log
import com.android.volley.Request
import java.util.HashMap

class GetStringRequest(
    context: Context?,
    private val functionName : String
):AppStringRequest(context) {
    override fun getFunctionName(): String {
        return functionName
    }


    override fun getMethod(): Int {
        return Request.Method.GET
    }

}