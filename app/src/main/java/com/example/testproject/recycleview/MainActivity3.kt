package com.example.testproject.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.testproject.recycleview.databinding.ActivityMain3Binding
import com.example.testproject.recycleview.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.apply {
            mainRecycle.adapter=ParentAdapter(SampleData.collection)
        }
    }
}