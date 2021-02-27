package ru.varasoft.kotlin.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import ru.varasoft.kotlin.lesson1.R

enum class WeatherType {
    SUNNY,
    RAINY,
    CLOUDY,
    MISTY,
    SNOWY,
    HAILY
}

class Weather (val town: String, val temperature: Int) {

    companion object : Comparator<Weather> {
        override fun compare(o1: Weather, o2: Weather): Int {
            if (o1.temperature > o2.temperature) {
                return 1
            } else if (o1.temperature == o2.temperature) {
                return 0
            } else {
                return -1
            }
        }
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(applicationContext, "Button pressed", Toast.LENGTH_SHORT).show()
            }
        }

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(buttonOnClickListener)

        val dataClass = DataClass(5, "fff")

        val textView : TextView = findViewById(R.id.textView)
        textView.setText("${dataClass.int} + ${dataClass.string}")
        object {
            val string: String = "Object"
        }

        val weatherList= mutableListOf<Weather>(Weather("Moscow", 3),
                Weather("Khimki", -5))


        for(weather in weatherList) {
            print(weather.town)
        }

        for(i in 1..10) {
            print("Hello Kotlin!")
        }





    }
}