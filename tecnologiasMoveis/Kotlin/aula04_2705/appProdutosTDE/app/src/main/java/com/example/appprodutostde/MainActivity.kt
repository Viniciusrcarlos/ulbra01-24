package com.example.appprodutostde

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val menuBottom = findViewById<BottomNavigationMenuView>(R.id.menu_bottom)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        setSupportActionBar(toolbar)

        supportActionBar?.apply {
            title = "home"
            setDisplayHomeAsUpEnabled(true)
        }

        NavigationUI.setupWithNavController(menuBottom, navController)


//        val recycler = findViewById<RecyclerView>(R.id.recycler)

        val listOfProducts = mainViewModel.getProducts()
        val adapter = ProductAdapter(listOfProducts, ::goToDetail)

//        recycler.adapter = adapter
        }

    private fun goToDetail(item: Product) {
        Intent(this, ProductDetailActivity::class.java).apply {
            putExtra("data", item)
            startActivity(this)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

}
