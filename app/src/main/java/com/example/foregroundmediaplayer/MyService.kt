package com.example.foregroundmediaplayer

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate() {
        super.onCreate()
        mediaPlayer = MediaPlayer.create(this, R.raw.music)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        when (intent?.getIntExtra("CODE", 0)) {
            1 -> {
                mediaPlayer.start()
            }
            2 -> {
                if (mediaPlayer.isPlaying){
                    mediaPlayer.pause()
                }else{
                    mediaPlayer.start()
                }
            }
            3 -> {
                mediaPlayer.stop()
            }
            }

        return super.onStartCommand(intent, flags, startId)
    }
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}