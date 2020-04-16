package com.example.recyclerviewtypesample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtypesample.data.Model
import com.example.recyclerviewtypesample.R
import com.example.recyclerviewtypesample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var adapter: ItemsAdatper? = null
    var model: Model? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        init()
    }

    fun init() {
        model = Model() // 데이터를 핸들링 하기 위한 Model Init
        setRecyclerView() //리사이클러뷰 Init
    }

    fun setRecyclerView() {
        adapter =
            ItemsAdatper(model?.makeTestEntities())
        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = RecyclerView.VERTICAL
        binding.recyclerview.layoutManager = layoutManager
        binding.recyclerview.adapter = adapter
    }
}