package uz.hamroev.tulipsofuzbekistan

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import uz.hamroev.tulipsofuzbekistan.activity.HomeActivity
import uz.hamroev.tulipsofuzbekistan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        supportActionBar?.hide()

        startAnimation()

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }, 2200)

    }

    private fun startAnimation() {
        val animTeam = AnimationUtils.loadAnimation(this, R.anim.anim_intro_team)
        val animVersion = AnimationUtils.loadAnimation(this, R.anim.anim_intro_version)

        binding.teamTv.startAnimation(animTeam)
        binding.versionTv.startAnimation(animVersion)

        binding.introTypeWriter.text = ""
        binding.introTypeWriter.animateText("Tulips of\nUzbekistan")
        binding.introTypeWriter.setCharacterDeley(50)
    }
}