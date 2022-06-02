package com.example.home_work_onix.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

        binding.button.setOnClickListener() {
            val login: String = binding.editlogin.text.toString()
            val password1: String = binding.editText1.text.toString()
            val password2: String = binding.editText2.text.toString()

            if (password1.isEmpty() || password2.isEmpty()) {
                binding.PasswordCorrect.text = "the field must not be empty"
            }
            else
            {
                if (password1.length < 8)
                    binding.PasswordCorrect.text = "Minimum 8 characters"
                else {
                    if (!login.matches(".[A-z].".toRegex())) {

                        if (password2 != password1)
                            binding.PasswordCorrect.text = "password mismatch"
                        else
                            binding.PasswordCorrect.text = "Registration successful"
                    }
                    else
                        binding.PasswordCorrect.text = "enter at least one Latin character"
                }
            }
        }
    }
}






