package com.laukhin.kmm_test_app.service

import com.laukhin.kmm_test_app.data.NewsList
import com.laukhin.kmm_test_app.network.config.NetworkConfig
import com.laukhin.kmm_test_app.network.http.NetworkClient
import io.ktor.client.*

class NewsService(private val httpClient: NetworkClient) {

    suspend fun loadNews(): Result<NewsList> {
        return httpClient.request(URL)
    }

    companion object {
         val URL =
            "https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=${NetworkConfig.apiKey}"
    }


}