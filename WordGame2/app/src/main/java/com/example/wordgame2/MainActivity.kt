package com.example.wordgame2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val txtName = findViewById<EditText>(R.id.txtName)
        val btnView = findViewById<Button>(R.id.btnView)


        btnSubmit.setOnClickListener() {
            Toast.makeText(this, "Hello " + txtName.text, Toast.LENGTH_LONG).show()

            val intent = Intent(this, WordScreen::class.java)
            startActivity(intent)
        }


        btnView.setOnClickListener(){
           val intent2 = Intent(this, Recyclerview::class.java)
            startActivity(intent2)
        }

    }
}