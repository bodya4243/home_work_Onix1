package com.example.onix_homework_two.fragments.questiontest.three

import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide

class threequestion {
    import android.os.Bundle
    import android.view.View
    import androidx.navigation.fragment.navArgs
    import com.bumptech.glide.Glide
    import com.example.onixloginhomework.R
    import com.example.onixloginhomework.databinding.FragmentThreeQuestionBinding
    import com.example.onixloginhomework.fragments.base.BaseFragment

    import org.koin.androidx.viewmodel.ext.android.viewModel

    class QuestionThreeTestFragment :
        BaseFragment<FragmentThreeQuestionBinding>(contentLayoutID = R.layout.fragment_three_question) {
        private val viewModel: QuestionThreeTestViewModel by viewModel()
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            binding.viewModel = viewModel
            binding.model = viewModel.model
            val scoreOnes : QuestionThreeTestFragmentArgs by navArgs()
            viewModel.scoreOne = scoreOnes.scoreOnes
            viewModel.scoreTwo = scoreOnes.kverty
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
}