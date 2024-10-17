package com.example.glidejam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private lateinit var flightDataManager: FlightDataManager
    private lateinit var musicGenerator: MusicGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        flightDataManager = FlightDataManager()
        musicGenerator = MusicGenerator(this)

        // Start button
        findViewById<Button>(R.id.startButton).setOnClickListener {
            startGlideJam()
        }

        // Settings button
        findViewById<Button>(R.id.settingsButton).setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }

    private fun startGlideJam() {
        // Start receiving flight data and generating music
        flightDataManager.startReceivingData { flightData ->
            musicGenerator.updateMusic(flightData)
        }
    }

}

