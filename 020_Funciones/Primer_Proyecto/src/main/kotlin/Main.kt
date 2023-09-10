import kotlin.math.round

//FUNCIONES

fun main() {

    suma(10, 60)
    suma(30, 12)

    //Funciones Lambda
    val sum = { x: Int, y: Int -> x + y }
    val result = sum(12, 12)
    println(result) // --> 24

    //división
    println("_____División_____")
    val div = division(10.0, 3.0)
    println(div)

    //redondear el resultado de la división hacia arriba o abajo cuando es mayor o menor a x.5
    val roundDiv = round(div)
    println(roundDiv)


}

/*
fun suma() {
    val v1 = 10
    val v2 = 20

    val res = v1 + v2
    println(res)

}*/

fun suma(v1: Int, v2: Int) {

    val res = v1 + v2
    println(res)
}

//Funciones con retorno
fun division(v1: Double, v2: Double): Double {

    val res = v1 / v2
    return res

}