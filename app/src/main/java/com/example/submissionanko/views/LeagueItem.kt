package com.example.submissionanko.views

import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.submissionanko.R
import org.jetbrains.anko.*

class LeagueItem : AnkoComponent<ViewGroup> {

    companion object {
//        Id
        val tvLeagueNameId = 1
        val leagueImageId = 2
        val tvClubCountId = 3
//        Colors
        val titleColor = R.color.colorTitle
        val descColor = R.color.colorDetail

    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui){
        verticalLayout{
            lparams(matchParent, wrapContent)
            padding = dip(10)

            textView {
                id = tvLeagueNameId
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "League 1"
                textSize = 16f
                textColor = titleColor
            }

            textView{
                id = tvClubCountId
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "21 Clubs"
                textSize = 14f
            }
        }
    }
}