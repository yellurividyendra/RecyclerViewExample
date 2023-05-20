package com.example.recyclerviewexample

import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val songsObjects= mutableListOf<Song>()
        val songList = findViewById<RecyclerView>(R.id.songList)
        songsObjects.add(Song("Hello","Just the description"))
        songsObjects.add(Song("ABCD","John Lennon"))
        songsObjects.add(Song("Dance","The Rolling Stones"))
        songsObjects.add(Song("Chill","The Beatles"))
        songsObjects.add(Song("Coders LIfe","Just the description"))
        songsObjects.add(Song("Adayein Bhi Main Mohabbat Bhi Mai","Ok Jaanu"))
        songsObjects.add(Song("Aye Udi Udi ","Saathiya"))
        songsObjects.add(Song("Enna Sona","Random Data"))
        songsObjects.add(Song("IT IT IT","Hello"))
        songsObjects.add(Song("Agar Tum Mil Jao","Ok Jaanu"))
        songsObjects.add(Song("Ban Ja Rani","Sulu"))
        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)
    }
}