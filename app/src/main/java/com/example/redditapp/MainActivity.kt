package com.example.redditapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnredditPostClicked {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val redditData = ArrayList<ModelReddit>()
        redditData.add(
            ModelReddit(
                "10000",
                "Marvin Albazi",
                "r/FootBall",
                "Welcome to the end of the world!",
                "gjhgfhkgj ghjhfjhgjfhg jgjhggjhgjdkfhgfjkh gfjkghjhfgjdh",
                "500"
            )
        )
        redditData.add(
            ModelReddit(
                "10000",
                "Marvin Albazi",
                "r/FootBall",
                "Welcome to the end of the world!",
                "gjhgfhkgj ghjhfjhgjfhg jgjhggjhgjdkfhgfjkh gfjkghjhfgjdh",
                "500"
            )
        )
        redditData.add(
            ModelReddit(
                "10000",
                "Marvin Albazi",
                "r/FootBall",
                "Welcome to the end of the world!",
                "gjhgfhkgj ghjhfjhgjfhg jgjhggjhgjdkfhgfjkh gfjkghjhfgjdh",
                "500"
            )
        )
        redditData.add(
            ModelReddit(
                "10000",
                "Marvin Albazi",
                "r/FootBall",
                "Welcome to the end of the world!",
                "gjhgfhkgj ghjhfjhgjfhg jgjhggjhgjdkfhgfjkh gfjkghjhfgjdh",
                "500"
            )
        )
        redditData.add(
            ModelReddit(
                "10000",
                "Marvin Albazi",
                "r/FootBall",
                "Welcome to the end of the world!",
                "gjhgfhkgj ghjhfjhgjfhg jgjhggjhgjdkfhgfjkh gfjkghjhfgjdh",
                "500"
            )
        )
        redditData.add(
            ModelReddit(
                "10000",
                "Marvin Albazi",
                "r/FootBall",
                "Welcome to the end of the world!",
                "gjhgfhkgj ghjhfjhgjfhg jgjhggjhgjdkfhgfjkh gfjkghjhfgjdh",
                "500"
            )
        )

        val adapter = RecyclerViewAdapter(redditData, this)
        recyclerView.adapter = adapter


    }

    override fun onRedditClicked(reddit: ModelReddit) {
        Log.i("Marvin", "Is bare gay")
    }


}


