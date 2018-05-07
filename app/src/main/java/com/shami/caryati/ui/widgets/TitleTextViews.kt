package com.shami.caryati.ui.widgets

import android.content.Context
import android.graphics.Canvas
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.widget.TextView
import com.shami.caryati.R


/**
 * Created by Shami on 5/6/2018.
 */
class TitleTextViews : TextView {



    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        this.setTextSize(android.util.TypedValue.COMPLEX_UNIT_SP,28f)
        this.setTextColor(ContextCompat.getColor(context, R.color.titleColors))
       // this.setTypeface(null,android.graphics.Typeface.BOLD)
        this.setPadding(4,4,4,4)
    }



    override protected fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)


    }

}