fun main() {
    val cat = Cat()
    val food = Food()
    val paper = Paper("Grey", "square", 150)
    val boiler = Boiler()
    val battery = Battery("Power source", 6)
    val liquid = Liquid()
    val cup = Cup("Small", "blue")
    val box = Box("Big", "yellow", 10)
    val student = Student()
    val employeesCompany = EmployeesCompany("Samsung", 3000)

    cat.info()
    food.info()
    paper.info()
    boiler.info()
    battery.info()
    liquid.info()
    cup.info()
    box.info()
    student.info()
    employeesCompany.info()

    println(cat.hashCode())
    println(food.hashCode())
    println(paper.hashCode())
    println(boiler.hashCode())
    println(battery.hashCode())
    println(liquid.hashCode())
    println(cup.hashCode())
    println(box.hashCode())
    println(student.hashCode())
    println(employeesCompany.hashCode())

    println(cat.equals(food))
    println(cup.equals(box))
    println(boiler.equals(battery))
    println(student.equals(employeesCompany))
    println(liquid.equals(paper))
}

data class Cat(
        val name: String = "Leopold",
        val age: Int = 5,
        var satietyLevel: Int = 100,
        var waterLevel: Int = 100){

    fun info(){
        println("Cat: name=$name age=$age satietyLevel=$satietyLevel waterLevel=$waterLevel")
    }
}

data class Food(
        val name: String = "Plov",
        val type: String = "Traditional",
        val caloriesInABowl: Int = 390) {

    fun info(){
        println("Food: name=$name type=$type caloriesInABowl=$caloriesInABowl")
    }
}

data class Paper(
        var color: String,
        var shape: String,
        var quantity: Int){

    fun info(){
        println("Paper: color=$color shape=$shape quantity=$quantity")
    }
}

data class Boiler(
        val material: String = "steel",
        val capacity: Int = 100,
        val energy: String = "natural gas") {

    fun info(){
        println("Boiler: material=$material capacity=$capacity energy=$energy")
    }
}

data class Battery(
        val type: String,
        val size: Int,
        val firstProduction: Int = 1800) {

    fun info(){
        println("Battery: type=$type size=$size firstProduction=$firstProduction")
    }
}

data class Liquid(
        val substance: String = "Water",
        val chemicalFormula: String = "H2O") {

    fun info(){
        println("Liquid: substance=$substance chemicalFormula=$chemicalFormula")
    }
}

data class  Cup(val size: String, val color: String){

    fun info(){
        println("Cup: size=$size color=$color")
    }
}

data class Box(val size: String, val color: String, val quantity: Int) {

    fun info(){
        println("Box: size=$size color=$color quantity=$quantity")
    }
}

data class Student(val name: String = "Alice", var age: Int = 23) {

    fun info(){
        println("Alice: name=$name age=$age")
    }
}

data class EmployeesCompany(val name: String, var employeesQuantity: Int) {

    fun info(){
        println("EmployeesCompany: name=$name employeesQuantity=$employeesQuantity")
    }
}