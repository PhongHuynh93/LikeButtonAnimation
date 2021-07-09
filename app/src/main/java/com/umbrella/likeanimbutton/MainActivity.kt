package com.umbrella.likeanimbutton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.umbrella.likeanimbutton.view.LikeAnimFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                add(R.id.root, LikeAnimFragment())
                commitAllowingStateLoss()
            }
        }
    }
}