package com.android.t4tek.app.main

import androidx.lifecycle.ViewModel
import com.android.t4tek.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {
    fun showLog(){
        userRepository.showLog()
    }
}