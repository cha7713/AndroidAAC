package com.awesomebly.androidaac

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import com.awesomebly.androidaac.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val model = ViewModelProvider(this, AndroidViewModelFactory(application))
            .get<CounterViewModel>(CounterViewModel::class.java)
        binding.setLifecycleOwner(this) // livedata가 변하는걸 감지해서 리프레시 해준다
        binding.viewModel = model

        count_text.setOnClickListener(View.OnClickListener {
            intent = Intent(this, VmShareActivity::class.java)
            startActivity(intent)
        })



//        f_plus.setOnClickListener(View.OnClickListener {
//            model.counterPlus()
//            //count_text.setText("${model.counter.value}")
//        })
//        f_minus.setOnClickListener(View.OnClickListener {
//            model.counterMinus()
//            //count_text.setText("${model.counter.value}")
//        })

//        model.counter.observe(this, Observer {
//            count_text.setText("${it}")
//        })





    }
}
