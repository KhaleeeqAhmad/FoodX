package com.khaleeq.ahmad.foodx.data

import com.khaleeq.ahmad.foodx.models.FoodRecipe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody.Companion.toResponseBody
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource
) {
    private val remote = remoteDataSource


    suspend fun getRecipes(
        hasNetwork: Boolean,
        queries: Map<String, String>
    ): Response<FoodRecipe> {


        return if (hasNetwork) {
            withContext(Dispatchers.IO){
                remote.getRecipes(queries)
            }

        } else {
            Response.error(404, "No Internet Connection".toResponseBody(null))
        }
    }
}