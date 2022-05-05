package edu.mahmoud.qrworkground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import edu.mahmoud.qrworkground.generate.GenerateActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnGnerate).setOnClickListener {
            startActivity(Intent(this, GenerateActivity::class.java))
        }
        

    }
}