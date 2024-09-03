package com.example.testproject.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var arrayList: ArrayList<new>
    private lateinit var imageId:Array<Int>
    private lateinit var content:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        imageId= arrayOf(
            R.drawable.g,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.k,
            R.drawable.l,
            R.drawable.modi,
            R.drawable.other,
            R.drawable.other1,
            R.drawable.other2,
            R.drawable.other3,
            R.drawable.other5,
            R.drawable.ww
        )
        content= arrayOf(
            "Evaluating Global Leadership: Why Many Consider Modi the Best Prime Minister in the World",
            "Let’s face it, writing doesn’t come easy to everyone. Most businesses can produce some short, SEO-optimized blogs that get the job done.",
            "they post consistently? That’s the key to boosting your traffic and then maintaining it.",
            "Headlines are especially important because they’re the first thing visitors will see on",
            "your site and they play a role in the ranking done by Google",
            "There’s a lot of pressure behind crafting a good ",
            "headline and it’s not uncommon for people to experience writer’s block. ",
            "This free tool can help alleviate your stress in seconds.\n" +
                    "\n" +
                    "Check out this video walkthrough of how it works:",
            "Did you know The HOTH offers a bunch of free tools to help you with keyword research, ",
            "domain authority, or backlinks? You can watch how-to videos for all of our free tools. They’re posted on the same YouTube page.",
            "If you like this tool, create a HOTH account to quickly and easily access all of our free tools.",
            "If you like this tool, create a HOTH account to quickly and easily access all of our free tools.",
            "If you like this tool, create a HOTH account to quickly and easily access all of our free tools.",
            "If you like this tool, create a HOTH account to quickly and easily access all of our free tools.",
            "If you like this tool, create a HOTH account to quickly and easily access all of our free tools.",
            "If you like this tool, create a HOTH account to quickly and easily access all of our free tools.",
            "If you like this tool, create a HOTH account to quickly and easily access all of our free tools.",
            "If you like this tool, create a HOTH account to quickly and easily access all of our free tools.",

            )

        recyclerView=findViewById(R.id.recyclee)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        arrayList= arrayListOf()
        getuserData()
    }

    private fun getuserData() {
        for (i in imageId.indices){
            val news=new(imageId[i],content[i])
            arrayList.add(news)
        }

        recyclerView.adapter=My1Adapter(arrayList)
    }
}