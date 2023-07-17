package com.example.ad_kt_pro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.bt_1)
        /**
         * 第一种实现方式
         */
        button.setOnClickListener {
            println("按钮触发类")
            val intent=Intent(this,LinearLayoutActivity::class.java)
            startActivity(intent)
        }

        val buttoncode_1 = findViewById<Button>(R.id.bt_code_1)
        /**
         * 第一种实现方式
         */
        buttoncode_1.setOnClickListener {
            println("按钮触发类")
            val intent=Intent(this,LinearLayoutActivityCode::class.java)
            startActivity(intent)
        }

        val button_2 = findViewById<Button>(R.id.bt_2)
        /**
         * 第一种实现方式
         */
        button_2.setOnClickListener {
            println("按钮触发类")
            val intent=Intent(this,RelativeLayoutActivity::class.java)
            startActivity(intent)
        }

        val buttoncode_2 = findViewById<Button>(R.id.bt_code_2)
        /**
         * 第一种实现方式
         */
        buttoncode_2.setOnClickListener {
            println("按钮触发类")
            val intent=Intent(this,RelativeLayoutActivityCode::class.java)
            startActivity(intent)
        }

        val button_3 = findViewById<Button>(R.id.bt_3)
        /**
         * 第一种实现方式
         */
        button_3.setOnClickListener {
            println("按钮触发类")
            val intent=Intent(this,TextViewActivity::class.java)
            startActivity(intent)
        }

        val buttoncode_3 = findViewById<Button>(R.id.bt_code_3)
        /**
         * 第一种实现方式
         */
        buttoncode_3.setOnClickListener {
            println("按钮触发类")
            val intent=Intent(this,TextViewActivityCode::class.java)
            startActivity(intent)
        }

        val button_4 = findViewById<Button>(R.id.bt_4)
        /**
         * 第一种实现方式
         */
        button_4.setOnClickListener {
            println("按钮触发类")
            val intent=Intent(this,ListViewActivity::class.java)
            startActivity(intent)
        }

        val buttoncode_4 = findViewById<Button>(R.id.bt_code_4)
        /**
         * 第一种实现方式
         */
        buttoncode_4.setOnClickListener {
            println("按钮触发类")
            val intent=Intent(this,ListViewActivity::class.java)
            startActivity(intent)
        }
    }
}