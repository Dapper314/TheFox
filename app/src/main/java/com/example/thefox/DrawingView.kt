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

class DrawingView @JvmOverloads constructor (context: Context, attributes: AttributeSet? = null, defStyleAttr: Int = 0): SurfaceView(context, attributes,defStyleAttr) {
    lateinit var canvas: Canvas
    val player = Player()
    val platform = Platform()
    val decor = Decor()
    val obstacle = Obstacle()
    val bonus = GameObject()
    val thread = Thread()
    val finishpoint = FinishPoint()

    val backgroundPaint = Paint()
    init {
        backgroundPaint.color = Color.WHITE
    }
    fun draw() {
        if (holder.surface.isValid) {
            canvas = holder.lockCanvas()
            canvas.drawRect(0f, 0f, 1000f,
                2000f, backgroundPaint)
            player.draw(canvas)
            //obstacle.draw(canvas)
            holder.unlockCanvasAndPost(canvas)
        }
    }

}
