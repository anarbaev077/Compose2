package com.example.compose2

import  android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.compose2.data.foodFakeDatas
import com.example.compose2.navigation.Screens

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background,
                ),
                title = {
                    Text(text = stringResource(id = R.string.food_menu_title))
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = null,
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = null,
                        )
                    }
                },
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding)
            ) {
                LazyRow(
                    modifier = Modifier
                ) {
                    items(foodFakeDatas()) { item ->
                        FoodItem(foodModel = item) {
                            navController.navigate(
                                Screens.DetailsScreen.routeName
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                LazyRow(
                    modifier = Modifier
                ) {
                    items(foodFakeDatas()) { item ->
                        FoodItem(foodModel = item) {
                            navController.navigate(
                                Screens.DetailsScreen.routeName
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                LazyColumn(
                    modifier = Modifier
                ) {
                    items(foodFakeDatas()) { item ->
                        FoodItem(foodModel = item) {
                            navController.navigate(
                                Screens.DetailsScreen.routeName
                            )
                        }
                    }
                }
            }
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    modifier = Modifier
                        .fillMaxWidth(),
                    selected = true,
                    onClick = {},
                    alwaysShowLabel = true,
                    label = {
                        Text(text = stringResource(id = R.string.food_menu_home))
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = null,
                        )
                    },
                )
                NavigationBarItem(
                    modifier = Modifier
                        .fillMaxWidth(),
                    selected = true,
                    onClick = {},
                    alwaysShowLabel = true,
                    label = {
                        Text(text = stringResource(id = R.string.food_menu_search))
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                        )
                    },
                )
                NavigationBarItem(
                    modifier = Modifier
                        .fillMaxWidth(),
                    selected = true,
                    onClick = {},
                    alwaysShowLabel = true,
                    label = {
                        Text(text = stringResource(id = R.string.food_menu_favourite))
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = null,
                        )
                    },
                )
                NavigationBarItem(
                    modifier = Modifier
                        .fillMaxWidth(),
                    selected = true,
                    onClick = {},
                    alwaysShowLabel = true,
                    label = {
                        Text(text = stringResource(id = R.string.food_menu_user))
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = null,
                        )
                    },
                )
            }
        },
    )
}
