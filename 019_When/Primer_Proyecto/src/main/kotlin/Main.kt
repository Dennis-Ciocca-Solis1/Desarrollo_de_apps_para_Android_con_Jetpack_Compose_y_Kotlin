//WHEN

fun main() {
    /*
        var dia = 8

        when (dia) {
            1 -> println("Lunes")
            2 -> println("Martes")
            3 -> println("Miércoles")
            4 -> println("Jueves")
            5 -> println("Viernes")
            6 -> println("Sábado")
            7 -> println("Domingo")
            else -> println("El número no es válido")
        }*/

    var dia = "Lunes"

    when (dia) {
        "Lunes" -> println("Lunes")
        "Martes" -> println("Martes")
        "Miércoles" -> println("Miércoles")
        "Jueves" -> println("Jueves")
        "Viernes" -> println("Viernes")
        "Sábado" -> println("Sábado")
        "Domingo" -> println("Domingo")
        else -> println("El día no es válido")
    }

    //rangos
    //val x = 5
    val x = 12

    when (x) {
        in 1..10 -> println("Está en el rango")
        in 10..20 -> println("Está fuera de rango")
    }

}

