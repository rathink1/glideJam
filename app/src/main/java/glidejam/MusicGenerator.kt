package com.example.glidejam

import android.content.Context
import android.media.MediaPlayer

class MusicGenerator(private val context: Context) {
    private var mediaPlayer: MediaPlayer? = null

    fun updateMusic(flightData: FlightData) {

        val musicResId = when {
            flightData.isTurbulent -> R.raw.calming_music
            flightData.speed > 500 -> R.raw.hyper_music
            else -> R.raw.normal_music
        }

        playMusic(musicResId)
    }

    private fun playMusic(resId: Int) {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = MediaPlayer.create(context, resId)
        mediaPlayer?.isLooping = true
        mediaPlayer?.start()
    }

}
