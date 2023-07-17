package com.example.ad_kt_pro

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.TextUtils
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding

class TextViewActivityCode : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //创建LinearLayout
        val containerLinearLayout = LinearLayout(this).apply {
            //设置大小
            val  layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
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
            val layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT ,dpTopx(200),
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

        val tv = TextView(this).apply {
            val rLayoutParams = RelativeLayout.LayoutParams(
                dpTopx(200),LinearLayout.LayoutParams.WRAP_CONTENT)
            rLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT,onelinearLayout.id)
            rLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, onelinearLayout.id);
           //设置背景颜色，你可以像下面这样
//            this.setBackgroundColor(Color.RED) //设置背景颜色
            //设置背景颜色，或者可以像下面这样
            this.background=ContextCompat.getDrawable(context,R.color.red)
            //设置背景颜色，或者可以像下面这样
            this.background=getDrawable(R.color.red) //设置背景颜色

//           设置显示文本内容
            this.text = "hello world hello world hello world hello world hello world"

//           设置单行显示 可以这样
//            this.isSingleLine = true //单行显示
//           设置单行显示 或者可以这样
//            this.setSingleLine()//单行显示
//           设置单行显示 或者可以这样
            this.maxLines = 1//单行显示

            //      设置显示不全 结尾省略号 可以这样
            this.ellipsize = TextUtils.TruncateAt.END //显示不全 结尾省略号 TruncateAt枚举类型

            // 设置TextView文字大小
            this.textSize = 25.0f

//            设置TextView文字颜色
            this.setTextColor(Color.WHITE )
//            设置TextView文字颜色  或者可以这样
//            this.setTextColor(Color.parseColor("#0000ff"))
//            设置TextView文字颜色  或者可以这样
            this.setTextColor(R.color.blue)
//            设置TextView秘文 脱敏
            this.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
//            设置TextView秘文 脱敏 或者可以这样
//            this.transformationMethod = HideReturnsTransformationMethod.getInstance()
//            this.setTransformationMethod(PasswordTransformationMethod.getInstance())
//            设置TextView文字加粗
//            this.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD))
//            设置TextView文字加粗 或者可以这样
            this.setTypeface(Typeface.DEFAULT_BOLD)
//            设置TextView文字正常
//            this.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL))
//            this.setTypeface(Typeface.DEFAULT)


            //点击事件
            this.setOnClickListener({
                println("=====我是点击事件啊=======")
            })

            this.layoutParams = rLayoutParams


        }.also {
            onelinearLayout.addView(it)
        }
    }


//    获取屏幕的密度：
//    resources.displayMetrics.density

    fun dpTopx(dp:Int):Int{
        return (resources.displayMetrics.density*dp).toInt()
    }
}