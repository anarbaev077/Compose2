package com.example.compose2

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.compose2.data.FoodModel

@Composable
fun FoodItem(
    foodModel: FoodModel,
    navigateToDetailsScreenCallBack:() -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(22.dp))
            .background(Color.Transparent)
            .padding(8.dp)
            .clickable {
                       navigateToDetailsScreenCallBack.invoke()
            },
    ) {
        AsyncImage(
            model = foodModel.foodImage,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview
@Composable
fun FoodItemPreview() {
    FoodItem(
        foodModel = FoodModel(
            foodName = String(),
            foodDescription = String(),
            foodPrice = "0",
            foodImage = "https://static.tildacdn.com/tild6235-6262-4364-a164-323431646133/3e49578f1345b253558c.jpg"
        ),
    ){}
}