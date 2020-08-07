package com.anvesh.bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fxn.BubbleTabBar
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.chip.Chip
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class MainActivity : AppCompatActivity() {

    lateinit var chipNB: ChipNavigationBar
    lateinit var chipNS: ChipNavigationBar
    lateinit var bottomNavigation: BottomNavigationView
    lateinit var bubbleTabBar: BubbleTabBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chipNB = findViewById(R.id.chipNavigationBarBig)
        chipNS = findViewById(R.id.chipNavigationBarSmall)
        bottomNavigation = findViewById(R.id.bottom_navigation)
        bubbleTabBar = findViewById(R.id.bubbleBar)


        chipNB.setItemSelected(R.id.demo1)
        chipNS.setItemSelected(R.id.demo1)

    }
}