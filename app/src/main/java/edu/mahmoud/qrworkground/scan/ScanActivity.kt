package edu.mahmoud.qrworkground.scan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.mahmoud.qrworkground.R
import edu.mahmoud.qrworkground.openFragment

class ScanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)
        openFragment(supportFragmentManager , R.id.scanListContainer , ScanListFragment())
    }
}