package com.example.a2022_02_04

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.a2022_02_04.model.BasicModel
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    val middleText: TextView
        get() = findViewById<TextView>(R.id.middle)
    val incrementButton: Button
        get() = findViewById<Button>(R.id.increment_button)

    var basicModel: BasicModel = BasicModel(1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incrementButton.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                basicModel.incrementCount(7)

                middleText.setText("MARS: "+ basicModel.getCount().toString())

                Log.i("PGB", "OnClick")
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("PGB", "onDestroy")
    }

    override fun onStop() {
        super.onStop()

        Log.i("PGB", "onStop")
    }

    override fun onPause() {
        super.onPause()

        Log.i("PGB", "onPause")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        Log.i("PGB", "onConfigurationChanged")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.i("PGB", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.i("PGB", "onRestoreInstanceState")
    }

}