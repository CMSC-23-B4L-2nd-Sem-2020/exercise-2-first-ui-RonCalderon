package com.example.newproj29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.newproj29.R.string.toast_message

class MainActivity : AppCompatActivity() {
    private var mCount:Int = 0
    private lateinit var mViewCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        val toast:Toast = Toast.makeText(this, toast_message, Toast.LENGTH_SHORT)
        toast.show()
    }
    fun countUp(view: View) {
        mCount++
        if(mViewCount!== null) {
            mViewCount.text = mCount.toString()
        }
    }
}
