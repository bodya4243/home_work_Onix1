package com.example.home_work_onix.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.home_work_onix.R
import com.example.home_work_onix.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {
    lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        val passwordCorrect : String = binding.PasswordCorrect.text.toString()
        val login: String = binding.editlogin.text.toString()
        val password1: String = binding.editText1.text.toString()
        val password2: String = binding.editText2.text.toString()


        if (login.matches(".[A-z].".toRegex()))
        {
            if (password1.length < 8)
                binding.PasswordCorrect.text = "Minimum 8 characters"
            else if (password2 != password1)
                binding.PasswordCorrect.text = "password mismatch"
            else
                binding.PasswordCorrect.text = "Registration successful"
        }
        else
            binding.PasswordCorrect.text = "Input must contain 1 uppercase or lowercase character"
    }
}






