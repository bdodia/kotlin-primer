package com.edgehoop

import java.util.*


    fun main(args: Array<String>) {

        //Setup sample country data
        val countries = Arrays.asList(
                Country("AUT", "Austria", Continent.EUROPE, 8600000.0),
                Country("DEU", "Germany", Continent.EUROPE, 81700000.0),
                Country("BRA", "Brazil", Continent.SOUTH_AMERICA, 207000000.0),
                Country("GBR", "United Kingdom", Continent.EUROPE, 65100000.0),
                Country("KEN", "Kenya", Continent.AFRICA, 46000000.0),
                Country("MUS", "Mauritius", Continent.AFRICA, 1260000.0),
                Country("AUS", "Australia", Continent.AUSTRALIA, 24770000.0)
        )

        println(countries)
        println(countries.size)

        //Country with Max population (maxBy)
        val countryWithHighestPopulation = countries.maxBy { it.population }
        println("Country with highest population is ${countryWithHighestPopulation?.name}")

        //filter -> map
        val countriesInEurope = countries.filter {it -> it.continent === Continent.EUROPE }.map { it.name }

        println("Countries in Europe are $countriesInEurope")

        //filter -> map -> take
        val populationFilter = countries.filter { it -> it.population > 40000000 }.map { it.name }.take(3)

        println("3 countries with populations exceeding 40000000 $populationFilter")
        println(populationFilter.size)

        //



    }


