package com.example.home_work_onix.fragments

import android.animation.Animator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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
    }

    override fun onResume() {
        super.onResume()

        binding.ImageView.animate().apply {
            duration = 5000
            rotationYBy(2880f)
        }.setListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationRepeat(animation: Animator?) {

            }
        }).start()
    }
}