package com.example.jongjis.request

import android.content.Context
import com.android.volley.Request

class GetJSONArrayRequest(
    context : Context?,
    private val functionName : String
):AppJSONArrayRequest(context) {

    override fun getFunctionName(): String {
        return functionName
    }

    override fun getMethod(): Int {
        return Request.Method.GET
    }

}