package com.example.newsapp.repository

import com.example.newsapp.api.RetrofitInstance

class NewsRepository {
    suspend fun getTopHeadlines(countryCode:String) =
        RetrofitInstance.api.getTopHeadlines(countryCode)



}