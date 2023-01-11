package com.khaleeq.ahmad.foodx

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.khaleeq.ahmad.foodx.models.FoodRecipe
import com.khaleeq.ahmad.foodx.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {

    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}