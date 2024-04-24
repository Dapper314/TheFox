package com.example.thefox

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.SurfaceView

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Point
import android.os.Bundle
import android.view.SurfaceHolder
import android.view.MotionEvent
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity
import java.util.*

class DrawingView @JvmOverloads constructor (context: Context, attributes: AttributeSet? = null, defStyleAttr: Int = 0): SurfaceView(context, attributes,defStyleAttr) {
    lateinit var canvas: Canvas

    val backgroundPaint = Paint()
    val player = Player()
    var drawing = false

    override fun draw(canvas: Canvas) {
        super.draw(canvas)
        backgroundPaint.color = Color.WHITE
        canvas.drawRect(0F, 0F, width.toFloat(), height.toFloat(),
            backgroundPaint)
        player.draw(canvas)
    }
    fun pause() {
        drawing = false
    }

    fun resume() {
        drawing = true
    }
    fun run() {
        var previousFrameTime = System.currentTimeMillis()

        var currentTime = System.currentTimeMillis()
        var elapsedTimeMS:Double=(currentTime-previousFrameTime).toDouble()
        while (drawing) {
            val currentTime = System.currentTimeMillis()
            val elapsedTimeMS = (currentTime-previousFrameTime).toDouble()
            updatePositions(elapsedTimeMS)
            draw(canvas)
            previousFrameTime = currentTime
        }
    }
    fun updatePositions(elapsedTimeMS: Double) {
        val interval = elapsedTimeMS / 1000.0
        player.update(interval)
        }
}

