package com.bignerdranch.android.cs4750finaproject

/***
 * class to provide basic methods to be able to move left or right in the row
 */
class Position (var row:Int, var col:Int) {
    fun nextCol (){
        col +=1
    }
    fun prevCol (){
        col -=1
    }

}