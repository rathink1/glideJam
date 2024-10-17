package com.example.glidejam

import android.location.Location
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationResult

data class FlightData(
    val altitude: Float,
    val speed: Float,
    val isTurbulent: Boolean
)

class FlightDataManager {

    fun startReceivingData(callback: (FlightData) -> Unit) {
        Thread {
            while (true) {
                val flightData = FlightData(
                    altitude = (1000..10000).random().toFloat(),
                    speed = (100..900).random().toFloat(),
                    isTurbulent = Math.random() < 0.2
                )
                callback(flightData)
                Thread.sleep(5000) // Update every 5 seconds
            }
        }.start()
    }
}

