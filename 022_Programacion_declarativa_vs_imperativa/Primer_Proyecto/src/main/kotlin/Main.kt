//PROGRAMACIÓN DECLARATIVA VS IMPERATIVA
/*
//Imperativa
fun main() {

    val num = listOf(1,2,3,4,5)
    val res = sumarLista(num)
    println(res)
}

//Sumar los números que se encuentran en una lista
fun sumarLista(lista: List<Int>):Int{

    var resultado = 0
    for (i in lista){
        resultado += i
    }
    return resultado

}
*/

//====================================================================
//Declarativa
//Sumar los números que se encuentran en una lista
fun main() {

    val num = listOf(1, 2, 3, 4, 5)
    val res = sumarLista(num)
    println(res)

    //lista de números para sacarle los pares
    val pares = listOf(2, 3, 8, 12, 16, 15)
    val res2 = filtrarPares(pares)
    println(res2)

}

fun sumarLista(lista: List<Int>): Int {

    return lista.sum() //reemplaza thodo el proceso solo con una linea

}

//=====================================================================
/*
//Filtrar los números pares de una lista
//Imperativa
fun filtrarPares(lista: List<Int>): List<Int> { //ponemos List<Int> porque nos va a retornar una lista

    val resultado = mutableListOf<Int>()

    for (i in lista){
        if (i % 2 == 0){
            resultado.add(i)
        }
    }
    return resultado

}*/

//=====================================================================
//Declarativa
fun filtrarPares(lista: List<Int>): List<Int> { //ponemos List<Int> porque nos va a retornar una lista

    return lista.filter { it % 2 == 0 }.toList()

}