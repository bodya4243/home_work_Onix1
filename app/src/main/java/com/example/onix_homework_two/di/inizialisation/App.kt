package com.example.onix_homework_two.di.inizialisation


import com.example.onix_homework_two.fragments.questiontest.one.onequestionModel
import com.example.onix_homework_two.fragments.questiontest.three.threequestionViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val app = module {

    viewModel<onequestionViewModel>{onequestionViewModel()}
    viewModel<twoquestionViewModel>{twoquestionViewModel()}
    viewModel<threequestionViewModel>{threequestionViewModel()}


}