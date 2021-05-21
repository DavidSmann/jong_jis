package com.example.jongjis.request

import android.content.Context
import android.util.Log
import com.android.volley.Request
import java.util.*

class GetJSONObjectRequest(
    context: Context?,
    private val functionName: String
) : AppJSONObjectRequest(context) {

    override fun getFunctionName(): String {
        return functionName
    }

    override fun getMethod(): Int {
        return Request.Method.GET
    }

//    override fun getHeader(): MutableMap<String, String> {
//        val params: MutableMap<String, String> = HashMap()
//        params["Authorization"] = "Bearer "+ token
//        Log.d("Authorization=======", params.toString())
//        return params
//    }

    override fun getHeader(): MutableMap<String, String> {
        return super.getHeader()
    }
}