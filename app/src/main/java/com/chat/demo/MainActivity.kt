package com.chat.demo

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.chat.sdk.ProProfsChat

class MainActivity : AppCompatActivity() {
    private var liveSiteId: String = "MXd4bDEwYzFRbW5oNVpBaDI4WUQ1QT09"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ll = findViewById<LinearLayout>(R.id.ll)
        val bubble = ProProfsChat(this, liveSiteId).init()
        ll.addView(bubble)
    }

}