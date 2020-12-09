fun main() {

    print("Введите количество лайков")
    val likes = readLine()!!.toInt()
    val lastNumber = likes % 10

    if (lastNumber == 1) {
        print("Понравилось $likes человеку")
    } else {
        print("Понравилось $likes людям")
    }
}