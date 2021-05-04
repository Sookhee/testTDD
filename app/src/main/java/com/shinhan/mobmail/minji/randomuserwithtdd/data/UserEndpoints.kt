package com.shinhan.mobmail.minji.randomuserwithtdd.data

import com.shinhan.mobmail.minji.randomuserwithtdd.domain.entity.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UserEndpoints {

    @GET("/api")
    fun getUsers(@Query("results") key: Int): Call<ArrayList<User>>

}