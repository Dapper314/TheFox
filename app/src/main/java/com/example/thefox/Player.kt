package com.example.thefox

import android.graphics.RectF
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.PointF
import android.graphics.Color

class Player {
    var color: Char = 'o'
    var SpeedX = 0F
    var SpeedY = 0F
    var CaseWidth = 0F
    var CaseHeight = 0F
    var Life: Int = 10
    var position = 0F
    val playerColor = Paint()
    init {
        playerColor.color = Color.RED
    }
    fun draw(canvas: Canvas){
        canvas.drawCircle(500f, 1000f, 100f, playerColor)
    }
}
