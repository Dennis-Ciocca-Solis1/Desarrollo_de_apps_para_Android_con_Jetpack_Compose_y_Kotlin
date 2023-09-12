//FILTER

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

}

data class Persona(val nombre: String, val edad: Int) {

}