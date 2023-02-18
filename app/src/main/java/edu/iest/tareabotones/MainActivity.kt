package edu.iest.tareabotones

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calificacionRecibida = Integer.valueOf(intent.getStringExtra("calificacion"))

        var tvFrase = findViewById<TextView>(R.id.tvFrase)
        var tvSubfrase = findViewById<TextView>(R.id.tvSubfrase)
        var bnRegresar = findViewById<Button>(R.id.bnRegresar)

        if (calificacionRecibida >=7){
            tvFrase.text = "Felicidades! Aprobaste la materia con $calificacionRecibida"
            tvFrase.setTextColor(Color.parseColor("#008000"))
        } else {
            tvFrase.text = "Obtuviste un $calificacionRecibida :("
            tvSubfrase.text = "Sigue participando"
            tvFrase.setTextColor(Color.parseColor("#FF0000"))
        }
        bnRegresar.setOnClickListener{
            val i = Intent(this, Activity_2::class.java)
            startActivity(i)
        }
    }
}