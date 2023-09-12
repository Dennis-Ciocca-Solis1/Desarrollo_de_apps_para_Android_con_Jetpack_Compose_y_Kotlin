//REDUCE

fun main() {

    val nombres = listOf("Luis", "Maria", "Pedro", "Arturo")

    //Filtrar los nombres que empiecen por la letra a
    val nombresRes = nombres.filter { it.startsWith("a", ignoreCase = true) }
    println(nombresRes)

    //Filtrar los nombres que contengan la letra a
    val nombresRes2 = nombres.filter { it.contains("a", ignoreCase = true) }
    println(nombresRes2)

    //Filtrar los nombres que terminan con la letra o
    val nombresRes3 = nombres.filter { it.endsWith("o", ignoreCase = true) }
    println(nombresRes3)

    //Filtrar todas las personas que sean mayores a 30
    val personas = listOf(
        Persona("Maria", 35),
        Persona("Pedro", 45),
        Persona("Daniela", 25),
        Persona("Lucia", 15),
        Persona("Luis", 60)
    )

    //usar map para conseguir filtrar solo el nombre de los mayores de 30
    val mayores = personas.filter { it.edad > 30 }.map { it.nombre }.sorted()
    println(mayores)                                               //sorted ordena ascendentemente

    //==================================================================================================================
    println("========MAP=======")
    //listar todas las personas
    val listaPersona = personas.map { it.nombre }
    println(listaPersona)

    //extraer las edades con 'map' y multiplicar por 2
    val multiplicar = personas.map { it.edad * 2 }
    println(multiplicar)

    //extraer todas las edades de la lista y sumarlas
    val sumarEdades = personas.map { it.edad }.sum()
    println(sumarEdades)

    //contar los caracteres que hay en una palabra
    val palabras = listOf("hola", "mundo", "kotlin")
    val sumaPalabras = palabras.map { it.length }
    println(sumaPalabras)              //length nos devuelve el número de caracteres que hay en una palabra

    //==================================================================================================================
    println("========REDUCE=======")

    //multiplicar todos los elementos de una lista y devolver solo un resultado
    val num = listOf(1, 2, 3, 4, 5)

    val numRes = num.reduce { valorAcumulado, valorActual -> valorAcumulado * valorActual }
    println(numRes)

    //concatenar todas las palabras de la lista
    val concatenar = palabras.reduce { acumulado, actual -> acumulado + " " + actual }
    println(concatenar)

}

data class Persona(val nombre: String, val edad: Int)