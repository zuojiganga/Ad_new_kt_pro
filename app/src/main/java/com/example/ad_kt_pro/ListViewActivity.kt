package com.example.ad_kt_pro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.SimpleAdapter

class ListViewActivity : AppCompatActivity() {

    val data = arrayListOf(mapOf("001" to "Kotlin语法糖"), mapOf("002" to  "www.aikeji.com"),
        mapOf("003" to  "兰州市软件园二期"), mapOf("004" to  "研发一部"),mapOf("005" to  "软件项目组"))
    lateinit var listView : ListView
    var  list = arrayListOf<Map<String, String>>()
    var simpleAdapter: SimpleAdapter? = null
//    private String data[][] = { { "001", "爱科技有限公司" },
//        { "002", "www.aikeji.com" }, { "003", "兰州市软件园二期" },
//        { "004", "研发一部" }, { "005", "软件项目组" },
//        { "006", "Android应用开发" }, { "007", "初级工程师" }, { "008", "双软认定企业" },
//        { "009", "高科技企业" }, { "010", "服务外包示范企业" } };


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        println(this.data)
        for (item in this.data){
            println("this.data ==== {${item}}")
        }

        listView = findViewById<ListView>(R.id.mylist)
        // 准备List集合，里面放的是Map
        for (i in data.indices) {
            val map = HashMap<String, String>();
            for (k in data[i].keys){
                map["num"] = k
            }
            for (v in data[i].values){
                map["info"] = v
            }
            list.add(map);// 将Map加入到List集合中

        }
//        for (item in list){
            println("list======$list")
//        }
        val  arr = arrayListOf<String>("num","info")
        val inarr = arrayListOf<Int>(R.id.num,R.id.info)
        println("this======$this")
//        println("R.layout.activity_list_view======{$R.layout.activity_list_view}")
        println("arrayOf(\"num\",\"info\")======$arr")
        println("intArrayOf(R.id.num,R.id.info)======$inarr")
         simpleAdapter = SimpleAdapter(
            /* context = */ this,
            /* data = */list,
            /* resource = */R.layout.list_view_iterm,
            /* from = */arrayOf("num","info"),
            /* to = */intArrayOf(R.id.num,R.id.info))
        listView.adapter = simpleAdapter ////设置ListView显示的数据。
        //进行事件监听

        listView.setOnItemClickListener { parent, view, i, l ->

            if (i=== 0){
                println("触发$i==== 0")
                val  yft = KotlinYuFaTang()
                println("yft.name==== ${yft.name}")
                println("yft.name2==== ${yft.name2}")
//                yft.name = "更改name属性值" //错误代码：val 声明属性初始化一次，不允许更改
                yft.name2 = "更改name属性值2"//错误代码：var 声明属性初始化后，允许更改
                println("yft.name2==== ${yft.name2}")
//                yft.name3 = "更改name属性值3"//错误代码：private 声明私有属性，其他类不允许访问
//                yft.name4 = "更改name属性值4"//错误代码：protected 修饰属性，其他类不允许访问
//                yft.name5 = "更改name属性值5"//错误代码：public 修饰公有属性，其他类允许访问
                println("yft.name5==== ${yft.name5}")
//                yft.name6 = "更改name属性值6"//错误代码：public val 修饰声明公有属性，其他类不允许访问
                yft.difineAttribute("我是传参数据name")
//                yft.difineAttribute2("我是传参数据name 私有方法")//错误代码：private 修饰私有属性，其他类不允许访问


                yft.yuFaTangTest()

            }else if (i ===1 ){
                println("触发$i==== 1")

            }else if (i ===2 ){
                println("触发$i==== 2")

            }


        }

    }

}

