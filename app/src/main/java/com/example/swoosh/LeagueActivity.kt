package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""

    fun onMensClicked(view: View) {
        selectedLeague = "mens"
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

    }

    fun onWomensClicked(view: View) {
        selectedLeague = "womens"
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

    }

    fun onCoedClicked(view: View) {
        selectedLeague = "coed"
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.",Toast.LENGTH_SHORT).show()
        }
    }
}