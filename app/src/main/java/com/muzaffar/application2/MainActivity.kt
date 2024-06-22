package com.muzaffar.application2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muzaffar.application2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding;

    val requestCodeIntent = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.button.setOnClickListener {

            val intent = Intent()

            // Masukkan nama yang diletak di <intent></intent> name SecondActivity
            intent.action = "com.muzaffar.application1.SecondActivity"
            intent.addCategory("android.intent.category.DEFAULT")

            try {
                startActivityForResult(intent, requestCodeIntent)

            }
            catch(e:Exception){
                Toast.makeText(this,"Permission not granted",Toast.LENGTH_LONG).show()
            }

        }
    }
}