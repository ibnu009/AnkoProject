package com.example.submissionanko.adapters

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.submissionanko.models.League
import com.example.submissionanko.views.LeagueItem
import org.jetbrains.anko.AnkoContext

class LeagueAdapter(var list: ArrayList<League>) :
    RecyclerView.Adapter<LeagueAdapter.LeagueViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueViewHolder {
        println("Debug: onCreateViewHolder Terpanggil")
        return LeagueViewHolder(LeagueItem().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: LeagueViewHolder, position: Int) {
        println("Debug: onBindViewHolder Terpanggil")
        val league = list[position]
        holder.tvLeagueName.text = league.leagueName
        holder.tvClubCount.text = "${league.clubCount} Clubs"
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class LeagueViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvLeagueName: TextView
        var tvClubCount: TextView
        init {
            tvLeagueName = itemView.findViewById(LeagueItem.tvLeagueNameId)
            tvClubCount = itemView.findViewById(LeagueItem.tvClubCountId)
        }

    }

}