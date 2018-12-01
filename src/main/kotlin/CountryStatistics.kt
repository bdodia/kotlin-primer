package com.edgehoop

class CountryStatistics {

    //Setup sample country data
    val countries = mutableListOf<Country>()

    fun addCountry(country: Country) {
        countries.add(country)
    }

    //Country with Max population (maxBy)
    fun countryWithHighestPopulation(): String? {
        val countryWithHighestPopulation = countries.maxBy { it.population }
        println("Country with highest population is ${countryWithHighestPopulation?.name}")
        return countryWithHighestPopulation?.name
    }

    fun something() {
        //filter -> map
        val countriesInEurope = countries.filter { it -> it.continent === Continent.EUROPE }.map { it.name }

        println("Countries in Europe are $countriesInEurope")

        //
        val countriesByContinent = countries.groupBy { it.continent }.mapValues { it.value.map { it.name } }
        println("Countries by continent $countriesByContinent")

        //
        val countByContinent = countries.groupBy { it.continent }.mapValues { it.value.count() }
        println("Count by continent $countByContinent")

        //filter -> map -> take
        val populationFilter = countries.filter { it -> it.population > 40000000 }.map { it.name }.take(3)

        println("3 countries with populations exceeding 40000000 $populationFilter")
        println(populationFilter.size)
    }
}