package com.example.compose2.data

import java.io.Serializable

data class FoodModel(
    val foodName: String,
    val foodDescription: String,
    val foodPrice: String,
    val foodImage: String,
):Serializable
