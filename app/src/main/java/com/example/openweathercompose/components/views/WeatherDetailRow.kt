package com.example.openweathercompose.components.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.openweather.model.Forecast
import com.example.openweathercompose.R
import com.example.openweathercompose.utils.ExampleWeatherModel

@Preview
@Composable
fun WeatherDetailRow(capeTownWeather: Forecast = ExampleWeatherModel().prePopulatedWeather) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                MaterialTheme.colorScheme.secondaryContainer,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(8.dp),
        horizontalArrangement = Arrangement.Center

    ) {
        WeatherDetail(
            iconRes = R.drawable.ic_launcher_foreground,
            label = "Chill",
            value = "${capeTownWeather.current_observation.wind.chill}°F"
        )
        WeatherDetail(
            iconRes = R.drawable.ic_launcher_foreground,
            label = "Humidity",
            value = "${capeTownWeather.current_observation.atmosphere.humidity}%"
        )
        WeatherDetail(
            iconRes = R.drawable.ic_launcher_foreground,
            label = "Sunset",
            value = capeTownWeather.current_observation.astronomy.sunset
        )
    }
}
