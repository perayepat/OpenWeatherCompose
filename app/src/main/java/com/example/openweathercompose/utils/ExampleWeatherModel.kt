package com.example.openweathercompose.utils

import com.example.openweather.model.Astronomy
import com.example.openweather.model.Atmosphere
import com.example.openweather.model.Condition
import com.example.openweather.model.CurrentObservation
import com.example.openweather.model.Forecast
import com.example.openweather.model.Forecasts
import com.example.openweather.model.Location
import com.example.openweather.model.Wind

class ExampleWeatherModel {
    val prePopulatedWeather = Forecast(
        location = Location(
            city = "Cape Town",
            country = "South Africa",
            lat = -33.91906,
            long = 18.421961,
            timezone_id = "Africa/Johannesburg",
            woeid = 1591691,
        ),
        current_observation = CurrentObservation(
            pubDate = 1719989791,
            wind = Wind(
                chill = 41,
                direction = "North",
                speed = 12
            ),
            atmosphere = Atmosphere(
                humidity = 91,
                visibility = 10,
                pressure = 1014.2
            ),
            astronomy = Astronomy(
                sunrise = "7:52 AM",
                sunset = "5:49 PM"
            ),
            condition = Condition(
                temperature = 52,
                text = "Showers",
                code = 11
            )
        ),
        forecasts = listOf(
            Forecasts(
                day = "Wed",
                date = 1720022400,
                high = 59,
                low = 49,
                text = "Mostly Clear",
                code = 33
            ),
            Forecasts(
                day = "Thu",
                date = 1720108800,
                high = 61,
                low = 49,
                text = "Partly Cloudy",
                code = 30
            ),
            Forecasts(
                day = "Fri",
                date = 1720195200,
                high = 62,
                low = 45,
                text = "Mostly Sunny",
                code = 34
            ),
            Forecasts(
                day = "Sat",
                date = 1720281600,
                high = 70,
                low = 50,
                text = "Partly Cloudy",
                code = 30
            ),
            Forecasts(
                day = "Sun",
                date = 1720368000,
                high = 54,
                low = 46,
                text = "Mostly Cloudy",
                code = 28
            ),
            Forecasts(
                day = "Mon",
                date = 1720454400,
                high = 53,
                low = 51,
                text = "Rain",
                code = 12
            ),
            Forecasts(
                day = "Tue",
                date = 1720540800,
                high = 56,
                low = 55,
                text = "Showers",
                code = 11
            ),
            Forecasts(
                day = "Wed",
                date = 1720627200,
                high = 57,
                low = 49,
                text = "Rain",
                code = 12
            ),
            Forecasts(
                day = "Thu",
                date = 1720713600,
                high = 52,
                low = 48,
                text = "Showers",
                code = 11
            ),
            Forecasts(
                day = "Fri",
                date = 1720800000,
                high = 55,
                low = 44,
                text = "Cloudy",
                code = 26
            ),
            Forecasts(
                day = "Sat",
                date = 1720886400,
                high = 59,
                low = 45,
                text = "Showers",
                code = 11
            )
        )
    )

}