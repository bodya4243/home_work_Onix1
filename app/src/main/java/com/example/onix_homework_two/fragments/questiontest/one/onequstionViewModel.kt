package com.example.onix_homework_two.fragments.questiontest.one

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections

class OnequestionViewModel : ViewModel() {
    private val _navigate = SingleLiveEvent<NavDirections>()
    private val _backNavigate = SingleLiveEvent<Boolean>()
    val navigate: LiveData<NavDirections> = _navigate
    val backNavigate: LiveData<Boolean> = _backNavigate
    val viewModel: onequestionModel = onequestionModel()
    fun onNextClick() {
        if (viewModel.touchQuestionOne && viewModel.touchQuestionTwo && viewModel.touchQuestionThree) {
            viewModel.touchQuestionOne = false
            viewModel.touchQuestionTwo = false
            viewModel.touchQuestionThree = false
            viewModel.scoreOne =
                viewModel.scoreOneQuestionOne + viewModel.scoreTwoQuestionOne + viewModel.scoreThreeQuestionOne
            _navigate.value =
                QuestionOneTestFragment.actionOnequestionToTwoquestion(
                    viewModel.scoreOne
                )
        }
    }

    fun onAnswerTrueRadio() {
        viewModel.scoreOneQuestionOne = 1
        viewModel.touchQuestionOne = true

    }

    fun onAnswerFalseRadio() {
        viewModel.scoreOneQuestionOne = 0
        Log.d("myLog", "${viewModel.scoreOneQuestionOne}")
        viewModel.touchQuestionOne = true
    }

    fun onAnswertwoTrueRadio() {
        viewModel.scoreOneQuestionOne = 1
        viewModel.touchQuestionOne = true

    }

    fun onAnswertwoFalseRadio() {
        viewModel.scoreOneQuestionOne = 0
        Log.d("myLog", "${viewModel.scoreOneQuestionOne}")
        viewModel.touchQuestionOne = true
    }

    fun onAnswerthreeTrueRadio() {
        viewModel.scoreOneQuestionOne = 1
        viewModel.touchQuestionOne = true

    }

    fun onAnswerthreeFalseRadio() {
        viewModel.scoreOneQuestionOne = 0
        Log.d("myLog", "${viewModel.scoreOneQuestionOne}")
        viewModel.touchQuestionOne = true
    }

    fun onAnswerCheckOne(isChecked: Boolean) {
        viewModel.checkOne = isChecked
        viewModel.touchQuestionTwo = true
        Log.d("myLog", "${viewModel.checkOne}")
        if (viewModel.checkOne && viewModel.checkTwo && !viewModel.checkThree && !viewModel.checkFour) {
            viewModel.scoreTwoQuestionOne = 1
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        } else {
            viewModel.scoreTwoQuestionOne = 0
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        }
    }

    fun onAnswerCheckTwo(isChecked: Boolean) {
        viewModel.checkTwo = isChecked
        viewModel.touchQuestionTwo = true
        Log.d("myLog", "${viewModel.checkTwo}")
        if (viewModel.checkOne && viewModel.checkTwo && !viewModel.checkThree && !viewModel.checkFour) {
            viewModel.scoreTwoQuestionOne = 1
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        } else {
            viewModel.scoreTwoQuestionOne = 0
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        }
    }

    fun onAnswerCheckThree(isChecked: Boolean) {
        viewModel.checkThree = isChecked
        viewModel.touchQuestionTwo = true
        Log.d("myLog", "${viewModel.checkThree}")
        if (viewModel.checkOne && viewModel.checkTwo && !viewModel.checkThree && !viewModel.checkFour) {
            viewModel.scoreTwoQuestionOne = 1
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        } else {
            viewModel.scoreTwoQuestionOne = 0
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        }
    }

    fun onAnswerCheckFour(isChecked: Boolean) {
        viewModel.checkFour = isChecked
        viewModel.touchQuestionTwo = true
        Log.d("myLog", "${viewModel.checkFour}")
        if (viewModel.checkOne && viewModel.checkTwo && !viewModel.checkThree && !viewModel.checkFour) {
            viewModel.scoreTwoQuestionOne = 1
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        } else {
            viewModel.scoreTwoQuestionOne = 0
            Log.d("LogScore", "${viewModel.scoreTwoQuestionOne}")
        }
    }




}
