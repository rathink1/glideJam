package com.example.glidejam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.SeekBar
import android.widget.Switch

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // Volume control
        findViewById<SeekBar>(R.id.volumeSeekBar).setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    // Update volume
                }
                override fun onStartTrackingTouch(seekBar: SeekBar?) {}
                override fun onStopTrackingTouch(seekBar: SeekBar?) {}
            }
        )

        // Enable/disable turbulence detection
        findViewById<Switch>(R.id.turbulenceSwitch).setOnCheckedChangeListener { _, isChecked ->
            // Enable or disable turbulence detection
        }

    }
}

