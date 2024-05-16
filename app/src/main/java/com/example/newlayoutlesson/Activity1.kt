package com.example.newlayoutlesson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.newlayoutlesson.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {
    private lateinit var bindingClass1 : Activity1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingClass1 = Activity1Binding.inflate(layoutInflater)
        setContentView(bindingClass1.root)
    }


    fun onClicClose (view: View){
        finish()
    }


}