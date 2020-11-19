package com.fiuady.pruebas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Preguntas : AppCompatActivity() {

    private lateinit var txtQuestion: TextView
    private lateinit var txtQuestionNumber: TextView
    private lateinit var txtCheatCount: TextView
    private lateinit var btnPrev: Button
    private lateinit var btnNext: Button
    private lateinit var btnAnsw2: Button
    private lateinit var btnAnsw1: Button
    private lateinit var btnAnsw3: Button
    private lateinit var btnAnsw4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preguntas)


    }




}