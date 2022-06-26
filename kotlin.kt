
fun main() {
    println("learning android dev with")
    println("this is fun") // println prints in a new line 
    print("for the app")
    print(" chat app \n") // not in a new line
   	
    //VARIABLES 
    //var are mutable and they can have multiple values -- var name : type
    //val is immutable and can only have one value, cannot be reassigned -- val name:type
    var num1 = 12
    val num2:Int = 8
    printValues(num1,num2)
    println("the output of $num1 + $num2 is ${num1+num2}")
    val x = getsub(2,1)
    println("$x")
    println("sub = ${getsub(22,12)}") 
    println("short sub = ${shortsub(22,13)}") 

	//collections (arrays)
	val names = ListOf("aayush","dubey") // by default immutable
    
    //mutable collection 
    val names2 = mutableListOf("a","b","c")
    
    
    //loops 
    for (name in names) 
    {
        print(name)
    }
    
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
//fun shortsub(a : Int, b:Int) = return a-b

/*
var greeting = null
fun main()
{
    println(greeting)
    
    greeting = "hi"
    
    println(greeting)
	
    if(greeting != null)
    	println(greeting)
    else 
    {
        println("default greeting")
    }
    //when statement - similar to switch statement
    when(greeting){
        null -> print("hi") // if greeting is null
        else -> println(greeting) // acts a a default case 
        
    }
}

*/








