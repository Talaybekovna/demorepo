fun main() {
    val book1 = Book()
    val book2 = book1.copy(title = "Kotlin")
    val book3 = book2.copy(author = "D.Griffits")
    val book4 = book3.copy(year = 2019)
    val book5 = Book(title = "KOTLIN", year = 2019)

    println(book1.toString())
    println(book2.toString())
    println(book3.toString())
    println(book4.toString())
    println(book5.toString())
}


data class Book(
        var title: String = "Head First Kotlin",
        val author: String = "David Griffits",
        var year: Int = 2020){

}