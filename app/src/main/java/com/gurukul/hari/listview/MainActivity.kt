package com.gurukul.hari.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val values = resources.getStringArray(R.array.states)

        lView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity,values[position],Toast.LENGTH_LONG).show()
        }
    }
}
