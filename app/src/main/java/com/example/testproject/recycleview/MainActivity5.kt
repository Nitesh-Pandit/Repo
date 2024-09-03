package com.example.testproject.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity5 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var parentList= ArrayList<parent1Modal>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)

        recyclerView=findViewById(R.id.recycl)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)
        addDataList()
        val adapter=parent1Adapter(parentList)
        recyclerView.adapter=adapter
    }

    private fun addDataList() {
        var childItem1=ArrayList<child1Modal>()
        childItem1.add(child1Modal("C",R.drawable.a))
        childItem1.add(child1Modal("C+",R.drawable.b))
        childItem1.add(child1Modal("C++",R.drawable.c))
        childItem1.add(child1Modal("C#",R.drawable.d))

        parentList.add(parent1Modal("Game Development",R.drawable.modi,childItem1))

        var childItem2=ArrayList<child1Modal>()
        childItem1.add(child1Modal("java",R.drawable.e))
        childItem1.add(child1Modal("python",R.drawable.f))
        childItem1.add(child1Modal("PHP",R.drawable.g))

        parentList.add(parent1Modal("Java Development",R.drawable.other1,childItem2))

        var childItem3=ArrayList<child1Modal>()
        childItem1.add(child1Modal("modi1",R.drawable.h))
        childItem1.add(child1Modal("modi2",R.drawable.modi))
        childItem1.add(child1Modal("modi3",R.drawable.other))
        childItem1.add(child1Modal("modi4",R.drawable.other1))

        parentList.add(parent1Modal("Presendent of India",R.drawable.g,childItem3))


        var childItem4=ArrayList<child1Modal>()
        childItem1.add(child1Modal("C",R.drawable.other5))
        childItem1.add(child1Modal("C+",R.drawable.other2))
        childItem1.add(child1Modal("C++",R.drawable.other3))
        childItem1.add(child1Modal("C#",R.drawable.other))

        parentList.add(parent1Modal("Precedent of America",R.drawable.a,childItem4))

        var childItem5=ArrayList<child1Modal>()
        childItem1.add(child1Modal("AI",R.drawable.k))
        childItem1.add(child1Modal("Django",R.drawable.l))
        childItem1.add(child1Modal("Sql",R.drawable.ww))
        childItem1.add(child1Modal("Webdevelopment",R.drawable.e))

        parentList.add(parent1Modal("Game Development",R.drawable.f,childItem5))


    }
}