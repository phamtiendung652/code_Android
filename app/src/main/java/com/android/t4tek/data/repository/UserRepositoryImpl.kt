package com.android.t4tek.data.repository

import android.util.Log
import com.android.t4tek.domain.repository.UserRepository

class UserRepositoryImpl : UserRepository {
    override fun showLog() {
        Log.i("hanhmh1203", "showLog")
    }
}