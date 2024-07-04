import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.openweather.model.Forecast
import com.example.openweathercompose.components.views.ConditionRow
import com.example.openweathercompose.components.views.WeatherDetailRow
import com.example.openweathercompose.components.views.ForecastScrollView
import com.example.openweathercompose.utils.JsonReader


@Preview
@Composable
fun WeatherApp(modifier: Modifier = Modifier) {
    val jsonString = JsonReader().readJsonFromAssets(LocalContext.current, "capeTownResponse.json")
    val capeTownWeather = JsonReader().parseJsonToModel(jsonString)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
    ) {
        Text(
            text = capeTownWeather.location.city,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(text = capeTownWeather.location.country, fontSize = 18.sp, color = Color.Black)

        Spacer(modifier = Modifier.height(8.dp))

        ConditionRow(capeTownWeather)

        Spacer(modifier = Modifier.height(16.dp))


        WeatherDetailRow(capeTownWeather)

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Forecasts",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        ForecastScrollView(capeTownWeather)
    }
}

