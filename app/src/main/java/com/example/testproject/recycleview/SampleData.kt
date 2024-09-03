package com.example.testproject.recycleview

object SampleData {
    private val childAdapter= listOf(
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
    val collection= listOf(
        ParentModal("All Movies", childAdapter),
        ParentModal("Want to See",childAdapter.reversed()),
        ParentModal("Popular Movies",childAdapter.shuffled()),
        ParentModal("Top rated Movies",childAdapter),
    )
}