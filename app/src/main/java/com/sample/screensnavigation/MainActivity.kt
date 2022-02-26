package com.sample.screensnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // will change action bar as fragment show
        setupActionBarWithNavController(findNavigationController())
    }

    // handle click navigation up
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavigationController()
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    // in NavHostFragment has a navigation controller
    private fun findNavigationController(): NavController {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        return navHostFragment.navController
    }
}