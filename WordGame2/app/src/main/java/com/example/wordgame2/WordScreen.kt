package com.example.wordgame2



import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class WordScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_screen)

        val array = arrayOf<String>("London", "Paris", "Music", "Guitar", "Drums")
        val randomIndex = array.random()
        val randArray = arrayOf(randomIndex)
        val txtWord = findViewById<EditText>(R.id.txtWord)
        val btnGuess = findViewById<Button>(R.id.btnGuess)

        btnGuess.setOnClickListener(){

            if (randArray.contains(txtWord.text.toString())){
                Toast.makeText(this, "Correct Guess ", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Incorrect Guess ", Toast.LENGTH_LONG).show()
                val matchingLetters = mutableSetOf<Char>()
                val len = txtWord.text.toString()

                for (word in randArray){
                    for (char in len){
                        if (word.contains(char, ignoreCase = true)){
                            matchingLetters.add(char)
                        }
                    }
                }
                val message = "The string you have entered has matching letters (${matchingLetters.joinToString()}) with one or more strings in the array"

                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                Toast.makeText(this, randomIndex.toString(), Toast.LENGTH_LONG).show()
            }
        }

    }
}