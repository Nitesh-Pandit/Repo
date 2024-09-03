package com.example.testproject.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity4 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var arrayList: ArrayList<DataClass>
    private lateinit var imageId:Array<Int>
    private lateinit var tittle:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        recyclerView=findViewById(R.id.rectangles)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        imageId= arrayOf(
            R.drawable.modi,
            R.drawable.other,
            R.drawable.other1,
            R.drawable.other2,
            R.drawable.other3,
            R.drawable.other5,
            R.drawable.ww
        )
        tittle= arrayOf(
            "Evaluating Global Leadership: Why Many Consider Modi the Best Prime Minister in the World",
            "Let’s face it, writing doesn’t come easy to everyone. Most businesses can produce some short, SEO-optimized blogs that get the job done.",
            "they post consistently? That’s the key to boosting your traffic and then maintaining it.",
            "Headlines are especially important because they’re the first thing visitors will see on",
            "your site and they play a role in the ranking done by Google",
            "There’s a lot of pressure behind crafting a good ",
            "headline and it’s not uncommon for people to experience writer’s block. "
        )
        arrayList= arrayListOf()
        getuserdata()
    }
    private fun getuserdata() {
        for (i in imageId.indices){
            val news=DataClass(imageId[i],tittle[i])
            arrayList.add(news)
        }
        recyclerView.adapter=DataAdapter(arrayList)
    }
}