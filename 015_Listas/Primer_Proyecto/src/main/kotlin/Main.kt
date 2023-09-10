//ARRAY

fun main() {
/*
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
    println(duplicate)*/

    //========================================================================================
    //LISTAS
    //val lista = listOf(1,2,3,4,5)
    val lista = listOf("Rojo","Verde","Azul")
    println(lista)
    println(lista[0])

    //lista mutable
    val list = mutableListOf(1,2,3,4,5)

    //agregar un elemento a la lista mutable
    list.add(6)
    println(list)

    //eliminar un elemento de la lista mutable
    list.remove(1) //elimina el valor 1
    println(list)
    //++++++++++++++++++++++++++++++++++++++++++
    //forma de borrar un elemento en un array
    val array = arrayOf(1,2,3,4,5)
    val array2 = array.toMutableList()
    array2.remove(5)


}

