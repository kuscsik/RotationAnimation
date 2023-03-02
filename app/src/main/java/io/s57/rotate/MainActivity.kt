package io.s57.rotate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloWorld = findViewById<TextView>(R.id.hello)
        val rotation = AnimationUtils.loadAnimation(this, R.anim.rotate)
        helloWorld.startAnimation(rotation)
    }
}