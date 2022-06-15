package com.example.onix_homework_two.fragments.questiontest.one


import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.example.onix_homework_two.R
import com.example.onix_homework_two.databinding.FragmentQuestionOneBinding
import com.example.onix_homework_two.fragments.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class QuestionOneTestFragment :
    BaseFragment<FragmentQuestionOneBinding>(contentLayoutID = R.layout.fragment_question_one) {
    private val viewModel: onequestionModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.viewModel = viewModel
        super.onViewCreated(view, savedInstanceState)

    }

    override fun setObservers() {
        super.setObservers()
        viewModel.navigate.observe(viewLifecycleOwner, ::navigate)
        viewModel.backNavigate.observe(viewLifecycleOwner) {
            back()

        }
    }
}