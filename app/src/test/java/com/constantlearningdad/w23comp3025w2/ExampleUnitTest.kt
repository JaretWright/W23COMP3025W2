package com.constantlearningdad.w23comp3025w2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun readOnly()
    {
        //val in Kotlin is equivalent to saying a variable is final in Java
        //val is immutable
        //in Java ->  final String pizzaTopping = "pineapple";
        val pizzaTopping = "pineapple"
//        pizzaTopping = "olives"
        println("One of the best pizza toppings according to Aleks: $pizzaTopping")
    }

    //to have a maluable variable, use var
    @Test
    fun changeVar(){
        var pizzaPlace = "Little Caesars"
        pizzaPlace = "Pie"
        println("A great place for pizza is $pizzaPlace")
    }

    @Test
    fun allowForNull()
    {
        //in Java String flavour;
        //the ? denotes that it can be null
        var flavour : String?

        flavour = null

        if (flavour.equals("Barbq"))
            println("Nothing like chicken, red onion, oregano, barbq sauce on a pizza")
        else
            println(flavour)
    }

    @Test
    fun elvisOperator(){
        var flavour : String? = null

        println(flavour ?: "something else")

        flavour = "Hawaiian"
        println(flavour ?: "something else")
    }

    //In Java ->  public int multiply(int left, int right){...}
    fun multiply(left : Int, right : Int = 10) : Int{
        println("left: $left * right: $right = " +left*right)
        return left*right
    }

    @Test
    fun testMultiply()
    {
        assertEquals(12, multiply(6,2))
        assertEquals(60, multiply(6))  //uses the default value of 10
        assertEquals(15, multiply(right=5,left=3))
    }
}