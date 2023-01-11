package com.khaleeq.ahmad.foodx.data

import com.khaleeq.ahmad.foodx.data.network.FoodRecipesApi
import com.khaleeq.ahmad.foodx.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> =
        foodRecipesApi.getRecipes(queries)
}