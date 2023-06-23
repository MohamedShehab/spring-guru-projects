fun main(args: Array<String>) {
    println("Hello World!")


    val name = "Mohamed Shehab"
    val number: Int = 10
    println(number)

    val num1 = 10
    val num2 = 20
    val result = if(num1 > num2)  num1 else num2
    println(result)

    when{
        num1 % 2 == 0 -> println("Even number")
        num1 % 2 == 1 -> println("Odd number")
        else ->{
            println("thanks")
        }
    }

    for( i in 1.rangeTo(5).step(2)){
        println(i)
    }
}