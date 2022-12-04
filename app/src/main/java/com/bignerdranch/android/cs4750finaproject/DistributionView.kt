package com.bignerdranch.android.cs4750finaproject

/***
 *  This file is for the statistics at the end of playing
 */
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class DistributionView(val context: Context, attributes: AttributeSet): View(context,attributes)
{
    var title = "0"
    val titleRectangle = Rect()
    var countText = "0" // used to count how may letters in guess are correct?
    private val countRect = Rect()
    var percentage = 0.0f
    private var titleX = 0f
    private var titleu = 0f
    private var barRect = Rect()
    private var countX = 0f
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply{
        textSize = 24f
    }
    /***
     *  used to create own custom user interface
     *  Canvas is an object that the view can use to draw itself
     *  The Canvas class defines methods for drawing different things
     */
    override fun onDraw (canvas: Canvas){
        super.onDraw(canvas)
        paint.apply{
            color = if(countText = "0")context.getColor(R.color.dark_gray)
            else context.getColor(R.color.green)
        }
    }
}