import java.util.*

fun main() {
    val taskRobo = TaskRobo()

    println("__________________")
    println("Hi GoodMorning !")
    println("__________________")
    print("Sir please Enter your Name: ")
    val bossName = readLine()
    println("___________________________________________________________")
    println("Ok $bossName sir, I am your personal assistance jarvis ->")
    println("___________________________________________________________")
    println("Sir i can do these works for you")
    println("__________________________________")

    while (true) {
        println("1.Set alarm")
        println("______________")
        println("2.Make coffee")
        println("_________________")
        println("3.heat water for your bathing")
        println("_________________________________")
        println("4.Ready your bag")
        println("___________________")
        println("5.Cock breakfast or lunch")
        println("____________________________")
        println("6.Ready your clothes")
        println("_______________________\n\n")
        println("--------------------- Sir please choose one option mention above -------------------")

        when (readLine()) {
            "1" -> taskRobo.beforeAlarm()
            "2" -> taskRobo.makeCoffee()
            "3" -> taskRobo.heatWater()
            "4" -> taskRobo.packBag()
            "5" -> taskRobo.cockBreakfast()
            "6" -> taskRobo.ironClothes()
            else -> "Sir you choose wrong option"
        }
        println("===================================================================== Task Completed ================================================================\n\n\n")
    }
}