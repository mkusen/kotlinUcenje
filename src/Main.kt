fun main() {
    test()
    }


fun test() {
    print("upiši ime: ")
    var name= readln().trim()
    var number = 0
    do {
        number++
        print(if (number<=5)"$name $number" else {testProba(); "$number"})
        test2(number)
    }while (number<10)
}
fun test2(number: Int){
    val name=if (number <=5)"Petar" else "Martin"
    println(", $name $number")
}

fun testProba() {
    val test = Test()
    print(test.test3())
}



