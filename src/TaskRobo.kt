import java.util.*

class TaskRobo {
    fun beforeAlarm() {
        try {

            print("Sir Enter hours :")
            val min = readLine()
            println("__________________")
            val minutes = min?.toInt()
            print("Sir Enter minutes :")
            val hrs = readLine()
            println("____________________")
            val hours = hrs?.toInt()
            print("Sir please also mention which day not snooze alarm :")
            val d = readLine()
            println("_______________________________________________________")
            val day = d?.toInt()
            val date = Date()
            date.hours = hours!!
            date.minutes = minutes!!
            ringAlarm(date, day!!)
        } catch (e: Exception) {
            println("Something wrong happen!")
        }

    }

    private fun ringAlarm(date: Date, day: Int) {
        if (date.day != day) {
            println(
                "Alarm >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" +
                        "\n\n\n"
            )
        } else {
            println("On $day day i can't set alarm")
            println("________________________________")
        }
    }

    fun makeCoffee() {
        try {
            print("How do you like your coffee with milk or without milk, Enter black or milk : ")
            val coffeeType = readLine()
            println("_______________________________________________________________________________________")
            print("How many spoon of sugar you’ll take : ")
            val sugarSpoon = readLine()
            println("______________________________________")
            val spoon = sugarSpoon?.toInt()
            if (coffeeType.equals("milk") || coffeeType.equals("black")) {
                makeCoffee(coffeeType!!, spoon!!)
            } else {
                println("$coffeeType coffee is not available")
                println("_____________________________")
            }
        } catch (e: java.lang.Exception) {
            println("Something wrong happen")
        }
    }

    private fun makeCoffee(coffeeType: String, sugar: Int) {
        println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> making $coffeeType coffee with $sugar sugar spoon\n\n")
    }

    fun heatWater() {
        try {

            print("Sir Enter your prefer temperature for heating water :")
            val temp = readLine()
            println("_________________________________________________________")
            print("Sir any particular day which you don't want to take bath :")
            val day = readLine()
            println("_____________________________________________________________")
            heatWater(temp?.toInt()!!, day?.toInt()!!)

        } catch (e: java.lang.Exception) {
            println("Something wrong happen")
            println("_________________________")
        }
    }

    private fun heatWater(temperature: Int, day: Int) {
        if (Date().day != day) {
            println("Sir your water are bowling at $temperature temperature")
            println("_________________________________________________________")
        } else {
            println("Sorry sir , but $day day you don't take bath")
            println("_________________________________________________\n\n\n")
        }
    }

    fun packBag() {
        try {

            print("Sir enter hours for packing bag :")
            val hours = readLine()
            println("__________________________________")
            print("also mention minutes :")
            val minutes = readLine()
            println("______________________")
            if (Date().hours == hours?.toInt() && Date().minutes == minutes?.toInt()) {
                println("Your bag packed")
            }
        } catch (e: java.lang.Exception) {
            println("Something wrong happen")
            println("__________________________")
        }
    }

    fun cockBreakfast() {
        try {

            var dishes = mutableListOf<String>()
            print("Sir enter which type of dish you want eat(sour, sweet, chilly) : ")
            var taste = readLine()
            println("________________________________________________________________________")
            when (taste) {
                "sour" -> {
                    print("Enter sir your favorite sour dishes with space : ")
                    val list = readLine()
                    println("_______________________________________________________")
                    val dishesLis = list?.split(" ")
                    val cockingDish = dishesLis?.random()
                    println("$cockingDish cocking for breakfast................")
                    println("____________________________________________________")
                }
                else -> {
                    println("Sir you choose or enter Something Wrong!!!!!!")
                    println("______________________________________________")
                }
            }
        } catch (e: Exception) {
            println("Sir something wrong happen!")
            println("____________________________")
        }
    }

    fun ironClothes() {
        print("Sir before you bath enter which clothes you will wear : ")
        var clothes = readLine()
        println("______________________________________________________________")
        println("Ok sir i will iron $clothes for you now you can to take bath.")
        println("______________________________________________________________")
        println("$clothes ready to wear.............................")
        println("____________________________________________________")

    }
}