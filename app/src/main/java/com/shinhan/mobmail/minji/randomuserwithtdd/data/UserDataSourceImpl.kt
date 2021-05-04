package com.shinhan.mobmail.minji.randomuserwithtdd.data

import com.shinhan.mobmail.minji.randomuserwithtdd.domain.entity.User

class UserDataSourceImpl(): UserDataSource {
    override fun getUserList(length: Int): ArrayList<User> {

        return arrayListOf<User>()
    }
}