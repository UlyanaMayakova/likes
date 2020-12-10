fun main() {

    println("Введите количество лайков")
    val likes = readLine()!!.toInt()
    val lastNumber = likes % 10
    val lastTwoNumbers = likes % 100

    val liked = if (lastTwoNumbers != 11 && lastNumber == 1) "Понравилось $likes человеку"
    else "Понравилось $likes людям"

    println(liked)
}