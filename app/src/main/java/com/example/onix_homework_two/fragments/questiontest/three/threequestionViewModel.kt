package com.example.onix_homework_two.fragments.questiontest.three

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.navigation.NavDirections

class threequestionViewModel {
    private val _navigate = SingleLiveEvent<NavDirections>()
    private val _backNavigate = SingleLiveEvent<Boolean>()
    val navigate: LiveData<NavDirections> = _navigate
    val backNavigate: LiveData<Boolean> = _backNavigate
    val Viewmodel: threequestionModel = threequestionViewModel()
    var scoreOne = 0
    var scoreTwo = 0
    fun onNextClick() {
        if (Viewmodel.touchQuestionOne && Viewmodel.touchQuestionTwo && Viewmodel.touchQuestionThree) {
            Viewmodel.touchQuestionOne = false
            Viewmodel.touchQuestionTwo = false
            Viewmodel.touchQuestionThree = false
            Viewmodel.scoreThree =
                Viewmodel.scoreTwoQuestionThree + Viewmodel.scoreThreeQuestionThree + Viewmodel.scoreOneQuestionThree
            _navigate.value =
                threequestionDirections.actionQuestionThreeTestFragmentToSplashResultFragment(
                    scoreOne,
                    scoreTwo,
                    Viewmodel.scoreThree
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
        viewModel.touchQuestionTwo = true
        viewModel.scoreOneQuestionTwo = 1
        Log.d("TwoLogScore", "${viewModel.scoreOneQuestionTwo}")
    }

    fun onAnswerFalseRadioTwo() {
        viewModel.touchQuestionTwo = true
        viewModel.scoreOneQuestionTwo = 0
        Log.d("TwoLogScore", "${viewModel.scoreOneQuestionTwo}")

    }





}