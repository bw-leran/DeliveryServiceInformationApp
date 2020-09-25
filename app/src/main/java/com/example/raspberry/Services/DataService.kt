package com.example.raspberry.Services

import com.example.raspberry.Model.Category
import com.example.raspberry.Model.Menu

object DataService {

    val categoryMililani = listOf(
        Category("Five Guys", "img_five_guys"),
        Category("Taco Bell", "img_taco_bell"),
        Category("Chilli's", "img_chillis"),
        Category("McDonalds", "img_mcdonalds"),
        Category("Blazin Steaks", "img_blazin_steaks")
    )

    val menuFiveGuys = listOf(
        Menu("Hamburger","12.00"),
        Menu("Cheeseburger","14.00"),
        Menu("Bacon Cheeseburger","16.00")
    )

    val menuTacoBell = listOf(
        Menu("Taco","6.00"),
        Menu("Burrito","8.00"),
        Menu("Nachos","5.00")
    )

}