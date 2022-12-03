package com.bignerdranch.android.cs4750finaproject
import kotlinx.coroutines.flow.MutableSharedFlow
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

private const val TAG = "WordleViewModel"
const val EMPTY_STRING = ""
const val NUMBER_OF_ROWS = 6
const val ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
const val ALPHA_LEN = 26

class WordleViewModel(): ViewModel(){
    val currPos = Position (0,0) //the game starts off at the left top corner (0,0)

    /***
     *  How is this used?:
     *      Provides functions to emit values to the flow'
     *      Also provides the abiltites to emit a value
     */
    val signal = MutableSharedFlow<Signal>()

    /**
     * listOfTextViews is a 2d list used to model the grid (6 rows and 5 columns)
     * We initialize each element with the " " to denote the start of the game
     */
    val listOfTextViews = List(NUMBER_OF_ROWS)
    {
        List(WORD_LEN){ MutableStateFlow(Letter(" "))}
    }




    /***
     * Basic function definitions
     */
    fun checkRow (){
        guess = listToWord(listOfTextViews[currPos.row])
            .filter{it.value.letter != " "} // first check that there are no empty spots in the guess
            .map {it.value.lett}).lowecase(Locale.getDefault)
    }
}