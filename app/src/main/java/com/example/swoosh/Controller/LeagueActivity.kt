package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
//import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
//    var selectedLeague = ""
    var player = Player("", "")

    fun onMensClicked(view: View) {
        player.league = "mens"
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

    }

    fun onWomensClicked(view: View) {
        player.league = "womens"
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

    }

    fun onCoedClicked(view: View) {
        player.league = "coed"
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
//            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.",Toast.LENGTH_SHORT).show()
        }
    }
}