package com.example.pays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pays.model.Country
import com.example.pays.ui.theme.PaysTheme
import com.example.pays.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PaysTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()

                ) {

                    CountryList(countries = getCountries())
                }
            }
        }
    }
}




@Composable
fun CountryItem(country: Country) {
    Row(modifier = Modifier.padding(16.dp)) {
        Image(
            painter = painterResource(id = country.drapeauResId),
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )
        Column(modifier = Modifier.padding(start = 16.dp)) {

            Text(text = stringResource(id = country.nomResId))

            Text(text = "Capitale: " + stringResource(id = country.capitaleResId))
        }
    }
}
fun getCountries(): List<Country> {
    return listOf(

        Country(R.string.country_congo, R.string.capitale_kinshasa, "CD", R.drawable.flag1),
        Country(R.string.country_bresil, R.string.capitale_bresil, "JP", R.drawable.flag2),
        Country(R.string.country_belgique, R.string.capitale_bruxelles, "BE", R.drawable.flag3),
        Country(R.string.country_france, R.string.capitale_paris, "FR", R.drawable.flag4),
        Country(R.string.country_norvege, R.string.capitale_oslo, "PL", R.drawable.flag5),
        Country(R.string.country_chine, R.string.capitale_pekin, "BR", R.drawable.flag6),
        Country(R.string.country_usa, R.string.capitale_wash, "SN", R.drawable.flag7),
        Country(R.string.country_egypte, R.string.capitale_caire, "CA", R.drawable.flag8),
        Country(R.string.country_algerie, R.string.capitale_alger, "CA", R.drawable.flag9),
        Country(R.string.country_UK, R.string.capitale_kiev, "CA", R.drawable.flag10)
    )
}

@Composable
fun CountryList(countries: List<Country>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(countries) { country ->
            CountryItem(country = country)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCountryList() {
    PaysTheme {

        CountryList(countries = getCountries())
    }
}