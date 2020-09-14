fun main(args: Array<String>) {
//    //Kotlin infers that this is an Int
//    val lives = 3
//    var isGameOver = lives < 1
//    println(isGameOver)
//
//    if(isGameOver) {
//        println("You're dead!!!")
//    } else {
//        println("You're still alive...for now")
//    }
    println("How old are you?")
    val age = readLine()!!.toInt()
    println("age is $age")
    val message: String
    message = if (age < 18){
        "You're too young to vote!"
    } else if (age == 100) {
        "You are soooo old"
    } else {
        "You can vote I guess."
    }
//    message = if (age < 18){
//        "You're too young to vote!"
//    } else if (age == 100) {
//        "You are soooo old"
//    } else {
//        "You can vote I guess."
//    }

    println(message)
}
