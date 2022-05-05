package edu.mahmoud.qrworkground.generate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import edu.mahmoud.qrworkground.R
import com.google.zxing.BarcodeFormat
import android.widget.ImageView

import com.journeyapps.barcodescanner.BarcodeEncoder
import java.lang.Exception


class GenerateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generate)

        val edText = findViewById<EditText>(R.id.edQRTex)
        val imageViewQrCode = findViewById<ImageView>(R.id.imQR)
        findViewById<Button>(R.id.btnGnerateQR).setOnClickListener {
            val text = edText.text.toString()
            if (text.isNotBlank()) {
                generateQr(imageViewQrCode,text)
            }
        }
    }

    fun generateQr(imageViewQrCode: ImageView, text:String) {
        try {
            val barcodeEncoder = BarcodeEncoder()
            val bitmap = barcodeEncoder.encodeBitmap(
                text,
                BarcodeFormat.QR_CODE,
                imageViewQrCode.width,
                imageViewQrCode.height
            )
            imageViewQrCode.setImageBitmap(bitmap)
        } catch (e: Exception) {
        }
    }

}