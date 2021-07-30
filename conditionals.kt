fun main(args : Array<String>){

        statement1()
        statement2()

    }

//if statement
fun statement1() {
    val number = 100
    // if expression
    if (number%2 == 0)
        println("Even Number")
    println("Out Of If statement")
}

//if else statement
fun statement2(){
    // Marks out of 100
    val money = 100
    if (money < 40) {
        println("Broke")
    }
    else {
        println("Rick")
    }
}

fun statement3(args: Array<String>) {
    val  goodgrade= 50
    if(goodgrade < 0)
        println("Come on man, do better")
    else {
        //Nested expression
        if(goodgrade in 50..70)
            println("Good job")
        
        else if(goodgrade in 70..90)
            println("Muy bein!!!")
        else
            println(" Wonderful, Muy muy bein, Amazing")
    }
 }
