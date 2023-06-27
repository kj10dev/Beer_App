package com.example.beeradviser

object BeerExpert {
    @JvmStatic
    fun getBrands(color: String): List<String> {
        val brands: MutableList<String> = ArrayList()
        if (color == "amber") {
            brands.add("Jack Amber")
            brands.add("Red Mooose")
        } else {
            brands.add("Jail Pale Ale")
            brands.add("Gout Stout")
        }
        return brands
    }
}