package com.charlezz.opencvstudy.ui.filter

import android.app.Activity
import android.arch.lifecycle.Observer
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.charlezz.opencvstudy.R
import com.charlezz.opencvstudy.databinding.ActivityFilterBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
class FilterActivity : DaggerAppCompatActivity() {

    companion object {
        init {
            System.loadLibrary("opencv_java4")
        }
    }

    @Inject
    lateinit var binding: ActivityFilterBinding

    @Inject
    lateinit var viewModel : FilterViewModel

    private val REQ_CODE_LOAD_IMAGE = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        viewModel.startImagePicker.observe(this, Observer{ startActivityForResult(Intent(Intent.ACTION_PICK).apply {
            type = "image/*"
            putExtra(Intent.EXTRA_MIME_TYPES, arrayOf("image/jpeg", "image/png"))
        }, REQ_CODE_LOAD_IMAGE) })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            when(requestCode){
                REQ_CODE_LOAD_IMAGE->{
                    viewModel.imageUri.value = data?.data
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(com.charlezz.opencvstudy.R.menu.menu_filter, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.gaussian->{}
        }
        return super.onOptionsItemSelected(item)
    }
}
