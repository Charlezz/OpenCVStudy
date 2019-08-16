package com.charlezz.opencvstudy.ui

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.charlezz.opencvstudy.databinding.ActivityMainBinding
import com.charlezz.opencvstudy.ui.merge.MergeActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), OnItemClickHandler<MainMenu> {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var adapter:MainAdapter

    val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        adapter.viewModels = viewModel.items
    }

    override fun onClick(viewModel: MainMenu) {
        when(viewModel){
            MainMenu.MERGE->startActivity(Intent(this,MergeActivity::class.java))
        }
    }
}
