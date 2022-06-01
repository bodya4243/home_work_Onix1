package com.example.home_work_onix.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.ViewCompat.animate
import androidx.fragment.app.Fragment
import com.example.home_work_onix.R
import com.example.home_work_onix.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {
    lateinit var binding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
        ImageView.animate().apply
    }
}