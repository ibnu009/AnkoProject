package com.example.submissionanko

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.submissionanko.adapters.LeagueAdapter
import com.example.submissionanko.data.LeagueData
import com.example.submissionanko.models.League
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivity : AppCompatActivity() {

    private var list : ArrayList<League> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.addAll(LeagueData.leagueListData)
        initLeagueAdapter()
    }

    private fun initLeagueAdapter(){
        println("Debug: Adapter terpanggil")
        rvLeague.layoutManager = LinearLayoutManager(this)
        rvLeague.adapter = LeagueAdapter(list)
    }

}