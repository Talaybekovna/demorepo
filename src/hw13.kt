fun main() {
    val myArray = arrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3)
    val elems = myArray.size

    for(i in elems - 1 downTo 1) {
        for(j in 0 until i){
            if(myArray[j] > myArray[j + 1]){
                val temp = myArray[j]
                myArray[j] = myArray[j+1]
                myArray[j+1] = temp
            }
        }
    }
    for(i in myArray.indices){
        print(myArray[i])
        print(" ")
    }
}