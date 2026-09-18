package com.example.movieapp.navigation

enum class MovieScreens {
    HomeScreens,
    DetailsScreen;
    companion object{
        fun fromRoute(route: String?): MovieScreens
        = when (route?.substringBefore("/")) {
            HomeScreens.name -> HomeScreens
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreens
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}