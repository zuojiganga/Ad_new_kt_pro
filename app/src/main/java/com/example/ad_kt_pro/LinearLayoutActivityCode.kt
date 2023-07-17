package com.example.ad_kt_pro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.core.view.setPadding

class LinearLayoutActivityCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //创建LinearLayout
        val containerLinearLayout = LinearLayout(this).apply {
            //设置大小
            val  layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)
            layoutParams.setMargins(20,20,20,20)
            //设置方向
            orientation = LinearLayout.VERTICAL
            //改变背景颜色用于测试
            background = getDrawable(R.color.black)
            this.layoutParams = layoutParams
            //添加到屏幕上去
            setContentView(this)
        }

        val onelinearLayout = LinearLayout(this).apply {
            //设置大小
           val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT ,dpTopx(200),
                )
            layoutParams.setMargins(10,10,10,10)
            //设置方向
            orientation = LinearLayout.VERTICAL
            //改变背景颜色用于测试
            background = getDrawable(R.color.white)
            this.layoutParams = layoutParams
        }.also {
            it.setPadding(20)
            containerLinearLayout.addView(it)
        }

        val vi = View(this)
        val layoutParams = LinearLayout.LayoutParams(dpTopx(180),
            dpTopx(180))
        vi.background = getDrawable(R.color.red)
//        vi.setBackgroundColor(Color.parseColor("#ff0033"))
        //改变背景颜色用于测试
        onelinearLayout.addView(vi,layoutParams)


        val twolinearLayout = LinearLayout(this).apply {
            //设置大小
            val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                dpTopx(200))
            layoutParams.setMargins(10,10,10,10)
            //设置方向
            orientation = LinearLayout.VERTICAL
            //改变背景颜色用于测试
            background = getDrawable(R.color.purple_200)
            this.layoutParams = layoutParams
        }.also {
            it.setPadding(20)
            containerLinearLayout.addView(it)
        }

         View(this).apply {
            //设置大小
           val layoutParams = LinearLayout.LayoutParams(dpTopx(180),
               dpTopx(180))
            //设置方向
            //改变背景颜色用于测试
            background = getDrawable(R.color.red)
             this.layoutParams = layoutParams
        }.also {
             twolinearLayout.addView(it)
        }

    }

//    获取屏幕的密度：
//    resources.displayMetrics.density

    fun dpTopx(dp:Int):Int{
        return (resources.displayMetrics.density*dp).toInt()
    }
}