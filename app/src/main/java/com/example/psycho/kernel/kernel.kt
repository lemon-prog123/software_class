package com.example.psycho.kernel

import com.example.psycho.R
import com.example.psycho.resource.CanteenAdapter
import java.util.function.Predicate
import kotlin.random.Random

object Kernel {
    class Food {
        private var canteen: Int = 0//食堂
        private var carolie: Int = 0//卡路里
        private var window: Int = 0//窗口号
        private var price: Int = 0//价格
    }
    //    var food = arrayOfNulls<Array<kernel.Food?> >(4)
    private var CanteenList: List<String> = listOf(
        "农园一层", "农园二层", "燕南一层", "家园一层",
        "家园二层", "家园三层", "家园四层", "松林包子",
        "学一食堂", "学五食堂", "勺园一层", "勺园二层",
        "佟园餐厅", "勺西餐厅", "勺中餐厅")
    private var PreferCanteen: String = "随机食堂"//想去的食堂
    private var Avoidance: Int = 0//忌口
    private var Budget: Int = 0//预算，愿意为一顿饭花多少钱
    private var CarolieLimit: Int = 1000//一顿饭应该摄入多少卡路里
    var Canteen:String = ""//推荐该食堂的菜品
    val mealMap= mapOf("辣子鸡" to R.drawable.chicken,"油麦菜" to R.drawable.vagetable,
        "一两米饭" to R.drawable.rice,"红豆粥" to R.drawable.redbean,"奥尔良鸡腿" to R.drawable.chickenleg,
        "土豆丝" to R.drawable.potato,"枣糕" to R.drawable.cake,"煎饼果子" to R.drawable.pancake,"真tm的好" to R.drawable.pkueater)
    /*
        PreferCanteen = "农园一层"等
                      = “随机食堂”
                      = "换个推荐"
                      = “换个食堂”
     */
    fun setPrefer(string: String): Boolean{
        PreferCanteen = string
        return true
    }
    fun getPictureId(dish:String):Int?
    {
        if (dish in mealMap.keys)
        {
            return mealMap.get(dish)
        }
        return R.drawable.pkueater
    }
    fun getPrefer(): String{
        return PreferCanteen
    }
    fun getAllCanteen(): List<String>{
        return CanteenList
    }
    fun getFoodList(canteen: String): List<String>{
        //获得指定食堂的菜品推荐
        if(canteen == "家园一层") return listOf("辣子鸡","兔头","什么？")
        if(canteen == "家园三层") return listOf("辣椒炒肉","烤盘饭","真能吃")
        return listOf("包子","亲自指挥，亲自部署","民心所盼，众望所归","真不错")
    }
    //所有食物&在本次推荐中可以推荐的食物
    var food = Array(3) {Array<Kernel.Food>(10, {i: Int -> Kernel.Food()})}
    var nwfood = Array(3) {Array<Kernel.Food>(10, {i: Int -> Kernel.Food()})}

    fun getResult():List<String> {
        //Step1 计算去哪个食堂

        if(PreferCanteen == "随机食堂"){
            //默认情况
            Canteen = Kernel.CanteenList[(0..10).random()]
        }
        else if(PreferCanteen == "换个推荐"){
            Canteen = Canteen//不变
        }
        else if(PreferCanteen == "换个食堂"){
            var lastCanteen:String = Canteen
            while(Canteen == lastCanteen)
                Canteen = Kernel.CanteenList[(0..10).random()]
        }
        else
        //有指定的食堂
            Canteen = PreferCanteen

        //Step2 获得推荐菜品
        var recommend = Array<Kernel.Food>(10, {i: Int -> Kernel.Food()})

        //假装可以切换功能
        if(PreferCanteen == "随机食堂")
            return listOf(Canteen,"一两米饭","辣子鸡","油麦菜")
        else if(PreferCanteen == "农园一层")
            return listOf(Canteen,"红豆粥","奥尔良鸡腿","土豆丝")
        else if(PreferCanteen == "农园二层")
            return listOf(Canteen,"枣糕","煎饼果子","真tm的好")
        else return listOf(Canteen,"白面馒头","青椒炒肉","豆芽")
    }
}

fun main(){
    var xzy = Kernel
    xzy.setPrefer("随机食堂")
    print(xzy.getResult())
    xzy.setPrefer("换个食堂")
    print(xzy.getResult())
}
/*
README:
    实现功能按照规定所说的三个接口：
        get/setPrefer
        getAllCanteen
        getResult
    对getResult做如下说明：
    1、返回推荐只和PreferCanteen的取值有关:
        PreferCanteen = "农园一层"等
                      = “随机食堂”
                      = "换个推荐"
                      = “换个食堂”
       根据指定的取值获得推荐
    2、在此次demo展示中，由于未获得菜品的信息，故先根据PreferCanteen的值输出一些指定的样例
       具体代码段如下：
        //假装可以切换功能
        if(PreferCanteen == "随机食堂")
            return listOf(Canteen,"一两米饭","辣子鸡","油麦菜")
        else if(PreferCanteen == "换个食堂")
            return listOf(Canteen,"红豆粥","奥尔良鸡腿","土豆丝")
        else if(PreferCanteen == "换个推荐")
            return listOf(Canteen,"枣糕","煎饼果子")
        else return listOf(Canteen,"白面馒头","青椒炒肉","豆芽")


    另外实现了getFoodList(Canteen:String):List<String>功能
        获得该食堂的所有菜品名。同样，因为暂未实现菜品信息的获取，也只实现了输出指定样例
 */