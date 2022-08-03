package com.example.pagingcourse.viewmodel

import com.example.pagingcourse.api.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel()
class RickMortyViewModel {
    @Inject constructor(private val apiService: ApiService):ViewModel(){

    }
}