//ARRAY

fun main() {

    var array= arrayOf("Luis","Mario",2,3,5,true)

    //convertir datos a String
    println(array.contentToString())

    //crear una arreglo con un solo tipo de dato
    var numeros = intArrayOf(1,2,3,4,5)

    //imprimiendo un elemento en específico
    println(array[1])

    //reemplazando un elemento en específico
    array[1]="Mario Lopez"
    println(array[1])

    //imprimiendo el tamaño del arreglo
    println(numeros.size) // --> 5

    //agregando un elemento al array
    array += "Sergio"
    println(array.contentToString())

    //------------------------------
    //ordenando un array
    var nums = intArrayOf(4,3,6,8,9,1)
    nums.sort() //ordena el array de menor a mayor
    println(nums.contentToString())

    //----------------------------
    //buscar números duplicados
    var numbers = intArrayOf(2,2,5,7,8,8,3,5,6)
    val duplicate = numbers.groupBy { it }.filter{ it.value.size > 1 }.keys
    println(duplicate)


}

