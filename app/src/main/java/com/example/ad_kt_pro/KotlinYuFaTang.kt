package com.example.ad_kt_pro

class KotlinYuFaTang {
    val name = "zuozuomu"  //val 声明属性初始化一次，不允许更改
    var name2 = "zuozuomu2"  //var 声明属性初始化一次，允许更改 默认是public公有属性
    private val name3 = "zuozuomu3" //private val 声明属性初始化一次，不允许更改； 私有属性，其他类无法访问
    protected var name4 = "zuozuomu4"//protected var 声明属性初始化一次，不允许更改； 私有属性，其他类无法访问
    public val name5 = "zuozuomu5"//public val 声明属性初始化一次，不允许更改； 公有属性，其他类可以访问
    public var name6 = "zuozuomu6"//public var 声明属性初始化一次，允许更改； 公有属性，其他类可以访问

    fun yuFaTangTest(){
        println("打印KotlinYuFaTang.name======$name")

        difineAttribute("这是一个有参无返回值方法")
        difineAttribute2("这是一个有参有返回值方法")
        val s = sum(1,2)
        val s2 = sum2(3,4)
        val s3 = sum3(5,6)
        println("打印s======$s;s2=====$s2;s3=====$s3")

        vars(1,2,3,4)

        difineConstantAndVariable()

        stringMoban()
    }

    //定义类的方法属性
    fun difineAttribute(name:String){
        println("打印KotlinYuFaTang.name======$name")
    }
    private fun difineAttribute2(name:String):String{
        println("打印KotlinYuFaTang.name======$name")
        return "有参有返回值类型方法 声明"
    }
//    函数定义使用关键字 fun，参数格式为：参数 : 类型  标准定义
    fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
        return a + b
    }
//    表达式作为函数体，返回类型自动推断：    简写定义
    fun sum2(a: Int, b: Int) = a + b
//    public 方法则必须明确写出返回类型
    public fun sum3(a: Int, b: Int): Int = a + b

//    函数的变长参数可以用 vararg 关键字进行标识：
    fun vars(vararg v:Int){
        for(vt in v){
            println("vt====$vt")
        }
    }
/*   定义常量与变量
    可变变量定义：var 关键字
    不可变变量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)
*/
  fun difineConstantAndVariable(){
    val a: Int = 1
    val b = 1       // 系统自动推断变量类型为Int
    val c: Int      // 如果不在声明时初始化则必须提供变量类型
    c = 1           // 明确赋值


    var x = 5        // 系统自动推断变量类型为Int
    x += 1           // 变量可修改
    println("方法：difineConstantAndVariable======a:$a,b:$b,c:$c,x:$x")
  }
/*   字符串模板
 $ 表示一个变量名或者变量值

 $varName 表示变量值

 ${varName.fun()} 表示变量的方法返回值:
*/
fun  stringMoban(){
    var a = 1
// 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
// 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println("方法：stringMoban======s1:$s1  s2:$s2")
}




}