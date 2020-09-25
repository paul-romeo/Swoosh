package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
//import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
//import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*
import com.example.swoosh.Utilities.EXTRA_PLAYER

class SkillActivity : BaseActivity() {
//    var league = ""
//    var skill = ""
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

//        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!

    }

    fun onSkillFinishClicked(view: View) {
        val finishActivity = Intent(this, FinishActivity::class.java)

        if (player.skill != "") {
//            finishActivity.putExtra(EXTRA_LEAGUE, league)
//            finishActivity.putExtra(EXTRA_SKILL, skill)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }


}