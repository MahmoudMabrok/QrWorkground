package edu.mahmoud.qrworkground.scan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import edu.mahmoud.qrworkground.R
import edu.mahmoud.qrworkground.generate.GenerateActivity
import com.journeyapps.barcodescanner.ScanOptions

import android.widget.Toast
import androidx.activity.result.ActivityResultCallback

import com.journeyapps.barcodescanner.ScanContract

import androidx.activity.result.ActivityResultLauncher
import com.journeyapps.barcodescanner.ScanIntentResult


class ScanListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scan_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.openScanWithIntent).setOnClickListener {
            onButtonClick()
        }
    }

    // Register the launcher and result handler
    private val barcodeLauncher = registerForActivityResult(
        ScanContract()
    ) { result: ScanIntentResult ->
        if (result.contents == null) {
            Toast.makeText(requireContext(), "Cancelled", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(
                requireContext(),
                "Scanned: " + result.contents,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    // Launch
    fun onButtonClick() {
        barcodeLauncher.launch(ScanOptions())
    }

}