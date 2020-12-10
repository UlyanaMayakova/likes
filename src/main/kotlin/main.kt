fun main() {

    println("Введите количество лайков")
    val likes = readLine()!!.toInt()
    val lastNumber = likes % 10
    val lastTwoNumbers = likes % 100

    if (lastTwoNumbers != 11 && lastNumber == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}