package com.example.onix_homework_two.fragments.questiontest.two

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.navigation.NavDirections

class TwoquestionViewModel {
    private val _navigate = SingleLiveEvent<NavDirections>()
    private val _backNavigate = SingleLiveEvent<Boolean>()
    val navigate: LiveData<NavDirections> = _navigate
    val backNavigate: LiveData<Boolean> = _backNavigate
    val viewModel: TwoquestionViewModel = TwoquestionViewModel()
    var scoreOnes = 0
    fun onNextClick() {
        if (viewModel.touchQuestionOne && viewModel.touchQuestionTwo && viewModel.touchQuestionThree) {
            viewModel.touchQuestionOne = false
            viewModel.touchQuestionTwo = false
            viewModel.touchQuestionThree = false
            viewModel.scoreTwo =
                viewModel.scoreOneQuestionTwo + viewModel.scoreTwoQuestionTwo + viewModel.scoreThreeQuestionTwo
            _navigate.value =
                QuestionTwoTestFragmentDirections.actionQuestionTwoTestFragmentToQuestionThreeTestFragment(
                    viewModel.scoreTwo,
                    scoreOnes
                )
        }
    }

    fun onBackClick() {
        _backNavigate.value = true
    }
    fun onAnswerTrueRadioOne() {
        viewModel.touchQuestionOne = true
        viewModel.scoreOneQuestionTwo = 1
        Log.d("TwoLogScore", "${viewModel.scoreOneQuestionTwo}")
    }

    fun onAnswerFalseRadioOne() {
        viewModel.touchQuestionOne = true
        viewModel.scoreOneQuestionTwo = 0
        Log.d("TwoLogScore", "${viewModel.scoreOneQuestionTwo}")

    }

    fun onAnswerTrueRadioTwo() {
        viewModel.touchQuestionOne = true
        viewModel.scoreOneQuestionTwo = 1
        Log.d("TwoLogScore", "${viewModel.scoreOneQuestionTwo}")
    }

    fun onAnswerFalseRadioTwo() {
        viewModel.touchQuestionOne = true
        viewModel.scoreOneQuestionTwo = 0
        Log.d("TwoLogScore", "${viewModel.scoreOneQuestionTwo}")

    }

    fun onAnswerTrueRadioThree() {
        viewModel.touchQuestionOne = true
        viewModel.scoreOneQuestionTwo = 1
        Log.d("TwoLogScore", "${viewModel.scoreOneQuestionTwo}")
    }

    fun onAnswerFalseRadioThree() {
        viewModel.touchQuestionOne = true
        viewModel.scoreOneQuestionTwo = 0
        Log.d("TwoLogScore", "${viewModel.scoreOneQuestionTwo}")

    }

}