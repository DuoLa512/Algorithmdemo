package com.example.algorithmdemo.design.factory

/**
 * Created by LJH on 2019/11/20
 * Description:法拉利
 */
class Ferrari : Car() {
    override fun produce() {
        println("生产了一辆法拉利")
    }
}