package com.example.pays.data

import com.example.pays.R
import com.example.pays.model.Country

object DataSource {
    val countries = listOf(
        Country(R.string.country_congo, R.string.capitale_kinshasa, "CD", R.drawable.flag1),
        Country(R.string.country_bresil, R.string.capitale_bresil, "BR", R.drawable.flag2),
        Country(R.string.country_belgique, R.string.capitale_bruxelles, "BE", R.drawable.flag3),
        Country(R.string.country_france, R.string.capitale_paris, "FR", R.drawable.flag4),
        Country(R.string.country_norvege, R.string.capitale_oslo, "NO", R.drawable.flag5),
        Country(R.string.country_chine, R.string.capitale_pekin, "CN", R.drawable.flag6),
        Country(R.string.country_usa, R.string.capitale_wash, "US", R.drawable.flag7),
        Country(R.string.country_egypte, R.string.capitale_caire, "EG", R.drawable.flag8),
        Country(R.string.country_algerie, R.string.capitale_alger, "DZ", R.drawable.flag9),
        Country(R.string.country_UK, R.string.capitale_kiev, "UA", R.drawable.flag10)
    )
}