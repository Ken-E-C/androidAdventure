fun main(args: Array<String>) {
    println("Hello World")
    println("This conversation is being recorded")

    val salutation = "From Russia with Love \n- V. Putin"
    val kirkName = "James T Kirk"
    println(salutation)

    var madeUpTime = 25
    madeUpTime++
    madeUpTime += 5
    print("Time you have left: $madeUpTime months")

    val apples = 6
    val oranges = 35
    //example of String Interpolation
    println("\n\nPutin wants ${apples + oranges} pieces of fruit.  \n\nallegedly. Please don't sue")
    //val == let in Kotlin
    val weeks = 130.0
    val years = weeks/52
    println("\n\n$years")

    val name = "Putin"
    println("My name is " + name)
    println("This is $kirkName")


}
