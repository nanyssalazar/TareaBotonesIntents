package edu.iest.tareabotones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class Activity_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var bnEnviar = findViewById<Button>(R.id.bnEnviar)
        var etCalificacion = findViewById<EditText>(R.id.etCalificacion)

        bnEnviar.setOnClickListener{
            val calificacion = Integer.valueOf(etCalificacion.text.toString())
            Snackbar.make(etCalificacion, "Su frase fue $calificacion", Snackbar.LENGTH_LONG).show()

            val i = Intent(this,MainActivity::class.java)
            i.putExtra("calificacion",etCalificacion.text.toString())
            startActivity(i)

        }
    }
}