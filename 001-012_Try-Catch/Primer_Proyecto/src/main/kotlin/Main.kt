import java.lang.NumberFormatException

fun main() {
    /*
    //null safety
    var x : String? = null

    x = "Hola"

    println(x)

    //imprime el mensaje solo si 'x' tiene algún valor
    x?.let {
        println("tiene valor")
    }

    println()

    //----------------------------------------------------------------------------------
    //a b
    var id : Int? = null
    id?.let {
        println("tiene valor")
    }

    println(id)
    */

    //----------------------------------------------------------------------------------

    //CAMBIAR TIPOS DE DATOS
    /*
    val num1 = 5
    val num2 = "10"

    val res = num1 + num2.toInt()
    println(res)

    //----------------------------
    //CONCATENACIONES
    val t1 = "Hola"
    val t2 = "Mundo"

    val texto = t1 + " " + t2
    println(texto)

    //Otra formas de concatenar
    val resultado = t1.plus(" ").plus(t2) //dentro de los parentesis se pone lo que se quiere concatenar
    println(resultado)

    // Concantenar con un arreglo
    val array = arrayOf("Hola","Mundo","Cruel")
    val res2 = array.joinToString(" ") //une las palabras del arreglo por un espacio
    println(res2)
    */


    //==================================================================================================================
    //TRY-CATCH

    try {
        //Escribir en consola
        print("Escribe el primer valor: ")
        val n1 = readln().toInt()
        print("Escribe el segundo valor: ")
        val n2 = readln().toInt()

        val res = n1 + n2
        println(res)
    } catch (e: NumberFormatException) {
        println("Error: escribe un número válido $e") //la 'e' te imprime el nombre del error
    }


}