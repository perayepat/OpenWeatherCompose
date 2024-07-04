package com.example.openweathercompose.components.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.openweather.model.Forecast
import com.example.openweathercompose.utils.ExampleWeatherModel

@Preview
@Composable
fun ConditionRow(capeTownWeather: Forecast = ExampleWeatherModel().prePopulatedWeather) {
    Text(
        text = capeTownWeather.current_observation.condition.text,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
    Text(
        text = "Temp: ${capeTownWeather.current_observation.condition.temperature}°F",
        fontSize = 18.sp,
        color = Color.Black
    )
    Text(
        text = "Text: ${capeTownWeather.current_observation.condition.text}",
        fontSize = 18.sp,
        color = Color.Black
    )
}