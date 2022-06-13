/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
//learning some basic kotlin
fun main() {
    println("learning android dev with")
    println("this is fun") // println prints in a new line 
    print("for the app")
    print(" chat app \n") // not in a new line
   	
    //VARIABLES 
    //var are mutable and they can have multiple values 
    //val is immutable and can only have on value
    var num1 = 12
    val num2:Int = 8
    printValues(num1,num2)
    println("the output of $num1 + $num2 is ${num1+num2}")
    val x = getsub(2,1)
    println("$x")
    println("sub = ${getsub(22,12)}") 
    println("short sub = ${shortsub(22,13)}") 

}
fun printValues(f1 : Int ,f2 : Int)
{
    println("\n\nfunction called\n\n")
    println("the values of variables are : $f1 and $f2")
}
fun getsub(a : Int, b:Int):Int
{
    return a-b
}
//short hand functions 
fun shortsub(a : Int, b:Int)=return a-b
