package com.example.openweathercompose.components.views

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.openweather.model.Forecast
import com.example.openweathercompose.components.ForecastCard
import com.example.openweathercompose.utils.ExampleWeatherModel

@Preview
@Composable
fun ForecastScrollView(capeTownWeather: Forecast = ExampleWeatherModel().prePopulatedWeather) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
    ) {
        capeTownWeather.forecasts.forEach { forecast ->
            ForecastCard(forecast = forecast)
        }
    }
}
