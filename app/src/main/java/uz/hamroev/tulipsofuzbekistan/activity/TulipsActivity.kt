package uz.hamroev.tulipsofuzbekistan.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.hamroev.tulipsofuzbekistan.cache.Cache
import uz.hamroev.tulipsofuzbekistan.databinding.ActivityTulipsBinding

class TulipsActivity : AppCompatActivity() {
    lateinit var binding: ActivityTulipsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTulipsBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}