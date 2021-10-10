package com.example.kalkulatorbentuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun buttonClick(view: View){
        when(view.id){
            R.id.buttonBukaSegitiga ->{
                with(Intent(this, MainActivity::class.java)){
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(this)
                }
            }
            R.id.buttonBukaTrapesium ->{

            }
            R.id.buttonJajarGenjang ->{

            }
        }
    }
}