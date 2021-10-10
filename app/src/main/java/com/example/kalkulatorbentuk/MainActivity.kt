package com.example.kalkulatorbentuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var panjangAlas: EditText;
    lateinit var tinggi: EditText;
    lateinit var textOutput: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        panjangAlas = findViewById(R.id.panjangAlasEdit)
        tinggi = findViewById(R.id.tinggiEdit)
        textOutput = findViewById(R.id.textViewOutput)
    }

    fun luasSegitiga(alas: Float, tinggi: Float) = alas*tinggi/2f

    fun buttonClick(view: View){
        when(view.id){
            R.id.buttonKembali -> {
                finish()
            }
            R.id.buttonHitung -> {
                try {
                    val alas = panjangAlas.text.toString().toFloat()
                    val tinggi = tinggi.text.toString().toFloat()
                    val luas = luasSegitiga(alas, tinggi)
                    textOutput.text = "Luas segitiga adalah $luas"
                }catch (e: Exception){
                    AlertDialog.Builder(this)
                        .setTitle(R.string.error_title)
                        .setMessage(R.string.error_belum_lengkap)
                        .show()
                }
            }
        }
    }
}