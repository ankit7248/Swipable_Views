package com.example.swipable_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.yusuf,
            R.drawable.yusuf1,
            R.drawable.yusuf2,
            R.drawable.yusuf3,
            R.drawable.yusuf4,
            R.drawable.yusuf5,
            R.drawable.yusuf7
        )
        val adapter = Viewpageadapter(images)
        viewPager.adapter = adapter

        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

//        viewPager.beginFakeDrag()
//        viewPager.fakeDragBy(-3f)
//        viewPager.endFakeDrag()
    }
}