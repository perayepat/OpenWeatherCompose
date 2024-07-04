package com.example.openweathercompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.openweather.model.Forecasts
import com.example.openweathercompose.utils.ExampleWeatherModel


@Preview
@Composable
fun ForecastCard(forecast: Forecasts = ExampleWeatherModel().prePopulatedWeather.forecasts.first()) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .background(
                MaterialTheme.colorScheme.secondaryContainer,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(16.dp)
    ) {
        Text(text = forecast.day, fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black, modifier = Modifier.padding(19.dp))
        Text(text = "High: ${forecast.high}°F", fontSize = 16.sp, color = Color.Black)
        Text(text = "Low: ${forecast.low}°F", fontSize = 16.sp, color = Color.Black)
        Text(text = forecast.text, fontSize = 16.sp, color = Color.Black)
    }
}