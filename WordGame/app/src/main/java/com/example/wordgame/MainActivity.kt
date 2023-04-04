package com.example.wordgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.BtnSubmit)
        val txtName = findViewById<EditText>(R.id.txtName)
        var output = "Hello " + txtName.text
        btnSubmit.setOnClickListener() {
        Toast.makeText(this, txtName.text, Toast.LENGTH_LONG).show()

}







}
}