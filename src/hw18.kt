fun main() {
    val cat = Cat()
    val cat1 = Cat(50, 75)
    println(cat.info)
    println("Cat`s current satietyLevel: ${cat1.satietyLevel}")
    println("Cat`s current waterLevel: ${cat1.waterLevel}")

}

class Cat(){
    val name: String = "Leopold"
    val age: Int = 5
    var satietyLevel: Int = 100
    var waterLevel: Int = 100

    val info = """Cat: name=$name,
        |age=$age,
        |satietyLevel=$satietyLevel,
        |waterLevel=$waterLevel""".trimMargin()

    constructor(_satietyLevel: Int, _waterLevel: Int): this(){
        satietyLevel = _satietyLevel
        waterLevel = _waterLevel
    }
}

class Food(
        val name: String = "Plov",
        val type: String = "Traditional",
        val caloriesInABowl: Int = 390) {

}

class Paper(
        var color: String,
        var shape: String,
        var quantity: Int){

}

class Boiler(
        val material: String = "steel",
        val capacity: Int = 100,
        val energy: String = "natural gas") {

}

class Battery(
        val type: String,
        val size: Int,
        val firstProduction: Int = 1800) {

}

class Liquid(
        val substance: String = "Water",
        val chemicalFormula: String = "H2O") {

}

class  Cup(val size: String, val color: String){

}

class Box(val size: String, val color: String, val quantity: Int) {

}

class Student(val name: String = "Alice", var age: Int = 23) {

}

class EmployeesCompany(val name: String, var employeesQuantity: Int) {

}