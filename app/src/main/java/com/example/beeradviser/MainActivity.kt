package com.example.beeradviser

import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.beeradviser.BeerExpert
import com.example.beeradviser.BeerExpert.getBrands

class MainActivity : AppCompatActivity() {
    private val expert: BeerExpert = BeerExpert
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Called when the user clicks the button
    fun onClickFindBeer(view: View?) {
        //Get a reference to the TextView
        val brands = findViewById<TextView>(R.id.brands)

        //Get a reference to the Spinner
        val color = findViewById<Spinner>(R.id.color)

        //Get the selected item in the Spinner
        val beerType = color.selectedItem.toString()

        //Get recommendation form the Beer expert class
        val brandsList = getBrands(beerType)
        val brandsFormatted = StringBuilder()
        for (brand in brandsList) {
            brandsFormatted.append(brand).append('\n')
        }

        //Display the selected item
        brands.text = brandsFormatted
    }
}