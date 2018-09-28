package com.shuyu.github.kotlin.model

import com.google.gson.annotations.SerializedName
import com.shuyu.github.kotlin.BuildConfig

import java.util.Arrays

/**
 * Created on 2017/8/1.
 *
 * @author ThirtyDegreesRay
 */

class LoginRequestModel {

    var scopes: List<String>? = null
        private set
    var note: String? = null
        private set
    @SerializedName("client_id")
    var clientId: String? = null
        private set
    @SerializedName("client_secret")
    var clientSecret: String? = null
        private set

    companion object {
        fun generate(): LoginRequestModel {
            val model = LoginRequestModel()
            model.scopes = Arrays.asList("user", "repo", "gist", "notifications")
            model.note = BuildConfig.APPLICATION_ID
            model.clientId = BuildConfig.CLIENT_ID
            model.clientSecret = BuildConfig.CLIENT_SECRET
            return model
        }
    }
}