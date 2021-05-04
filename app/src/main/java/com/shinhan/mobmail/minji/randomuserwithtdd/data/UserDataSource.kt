package com.shinhan.mobmail.minji.randomuserwithtdd.data

import com.shinhan.mobmail.minji.randomuserwithtdd.domain.entity.User

interface UserDataSource {
    fun getUserList(): ArrayList<User>
}