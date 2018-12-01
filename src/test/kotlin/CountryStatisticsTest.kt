import com.edgehoop.Continent
import com.edgehoop.Country
import com.edgehoop.CountryStatistics
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalToIgnoringCase
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class CountryStatisticsTest {


    private val austria = Country("AUT", "Austria", Continent.EUROPE, 8600000.0)
    private val germany = Country("DEU", "Germany", Continent.EUROPE, 81700000.0)
    private val brazil = Country("BRA", "Brazil", Continent.SOUTH_AMERICA, 207000000.0)
    private val unitedKingdom = Country("GBR", "United Kingdom", Continent.EUROPE, 65100000.0)
    private val kenya = Country("KEN", "Kenya", Continent.AFRICA, 46000000.0)
    private val mauritius = Country("MUS", "Mauritius", Continent.AFRICA, 1260000.0)
    private val australia = Country("AUS", "Australia", Continent.AUSTRALIA, 24770000.0)

    val countryStatistics = CountryStatistics()

    @BeforeEach
    fun setUp() {
        countryStatistics.addCountry(austria)
        countryStatistics.addCountry(germany)
        countryStatistics.addCountry(brazil)
        countryStatistics.addCountry(unitedKingdom)
        countryStatistics.addCountry(kenya)
        countryStatistics.addCountry(mauritius)
        countryStatistics.addCountry(australia)
    }

    @Test
    fun getCountryWithHighestPopulation() {
        val result = countryStatistics.countryWithHighestPopulation()
        assertThat(result,equalToIgnoringCase("brazil"))
    }

    @Test
    fun getCountriesInEurope() {
    }

    @Test
    fun getCountriesByContinent() {
    }

    @Test
    fun getCountByContinent() {
    }

    @Test
    fun getPopulationFilter() {
    }
}