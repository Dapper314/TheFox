package com.example.thefox

import android.graphics.RectF
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.PointF
import android.graphics.Color

class Player {
    val playerpaint = Paint()
    var PositionX = 0F
    var PositionY = 0.0

    fun draw(canvas: Canvas) {
        playerpaint.color = Color.RED
        canvas.drawCircle(500f, 1000f, 100f, playerpaint)
    }
    fun update(interval:Double){
        PositionY += interval * 1.5
    }

}
