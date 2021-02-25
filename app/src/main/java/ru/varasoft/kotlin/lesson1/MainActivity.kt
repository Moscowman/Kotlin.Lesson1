package ru.varasoft.kotlin.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import ru.varasoft.kotlin.lesson1.R

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
    }
}