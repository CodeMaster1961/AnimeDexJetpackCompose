package com.example.animedexjetpackcompose.ui.theme.screens


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.animedexjetpackcompose.repository.AnimeRepository
import com.example.animedexjetpackcompose.util.Resource
import kotlinx.coroutines.launch
import javax.inject.Inject

class AnimeViewModel @Inject constructor(
    private val repository: AnimeRepository
) : ViewModel() {


    init {
        getAnimePhotos()
    }

    private fun getAnimePhotos() {
        viewModelScope.launch {
            try {
                val result = repository.getAnimeList()
                Resource.Success("Images loaded: $result")
            } catch (error: Exception) {
                Resource.Error("Something went wrong")
            }
        }
    }


}