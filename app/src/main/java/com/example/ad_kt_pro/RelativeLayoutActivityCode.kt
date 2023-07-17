package com.example.ad_kt_pro

import android.annotation.SuppressLint //引入后可以使用数值类型 如：  this.id = 1000
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout

class RelativeLayoutActivityCode : AppCompatActivity() {
    @SuppressLint("ResourceType") //引入后可以使用数值类型 如：
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainRelativeLayout = RelativeLayout(this).apply {
            val rLayoutParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT)
            this.setBackgroundColor(Color.BLACK)
            this.id = 1000
            this.layoutParams = rLayoutParams
            setContentView(this)
        }
        val oneRelativeLayout = RelativeLayout(this).apply {
            val rLayoutParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                dpTopx(200))
            rLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT,mainRelativeLayout.id)
            rLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP,mainRelativeLayout.id)

            this.id = 1001
            this.setBackgroundColor(Color.WHITE)
            this.layoutParams = rLayoutParams
        }.also {
            mainRelativeLayout.addView(it)
        }

        val vi1 = View(this).apply {
            val rLayoutParams = RelativeLayout.LayoutParams(
                dpTopx(80),dpTopx(80))
            rLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT,oneRelativeLayout.id)
            rLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, oneRelativeLayout.id);
            this.setBackgroundColor(Color.RED)
            this.id = 1002
            this.layoutParams = rLayoutParams

        }.also {
            oneRelativeLayout.addView(it)
        }
        val vi2 = View(this).apply {
//            val rLayoutParams = RelativeLayout.LayoutParams(100,100)
            val rLayoutParams1 = RelativeLayout.LayoutParams(dpTopx(70),dpTopx(70))
            rLayoutParams1.addRule(RelativeLayout.RIGHT_OF,vi1.id)
            rLayoutParams1.addRule(RelativeLayout.ALIGN_TOP, vi1.id)
            this.id = 1003
            this.setBackgroundColor(Color.GREEN)
            this.layoutParams = rLayoutParams1

        }.also {
            oneRelativeLayout.addView(it)
        }

        val vi3 = View(this).apply {
//            val rLayoutParams = RelativeLayout.LayoutParams(100,100)
            val rLayoutParams = RelativeLayout.LayoutParams(dpTopx(70),dpTopx(70))
            rLayoutParams.addRule(RelativeLayout.BELOW,vi1.id)
            this.id = 1004
            this.setBackgroundColor(Color.YELLOW)
            this.layoutParams = rLayoutParams

        }.also {
            oneRelativeLayout.addView(it)
        }

        val vi4 = View(this)
        val rLayoutParams1 = RelativeLayout.LayoutParams(90,90)
//        val rLayoutParams1 = RelativeLayout.LayoutParams(dpTopx(90),dpTopx(90))
        rLayoutParams1.addRule(RelativeLayout.BELOW,vi2.id)
        rLayoutParams1.addRule(RelativeLayout.RIGHT_OF,vi3.id)
        rLayoutParams1.setMargins(40,40,0,0)
        vi4.id = 1005
        vi4.setBackgroundColor(Color.DKGRAY)
        vi4.layoutParams = rLayoutParams1
        oneRelativeLayout.addView(vi4,rLayoutParams1)


    }

    //    获取屏幕的密度：
//    resources.displayMetrics.density

    fun dpTopx(dp:Int):Int{
        return (resources.displayMetrics.density*dp).toInt()
    }
}