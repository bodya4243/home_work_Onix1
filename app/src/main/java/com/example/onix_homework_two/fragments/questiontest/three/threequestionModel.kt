package com.example.onix_homework_two.fragments.questiontest.three

import androidx.databinding.ObservableField

class threequestionModel {
    var scoreTwoQuestionThree: Int = 0
    var scoreOneQuestionThree: Int = 0
    var scoreThreeQuestionThree: Int = 0
    var touchQuestionOne : Boolean = false
    var touchQuestionTwo : Boolean = false
    var touchQuestionThree : Boolean = false
    var scoreThree : Int = 0
    val editTextOneTestViewModel : ObservableField<String> = ObservableField()
    val editTextTwoTestViewModel : ObservableField<String> = ObservableField()
}