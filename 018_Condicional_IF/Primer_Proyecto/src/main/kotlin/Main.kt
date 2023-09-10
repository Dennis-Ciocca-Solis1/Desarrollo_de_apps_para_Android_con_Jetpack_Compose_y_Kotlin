//CONDICIONAL IF

fun main() {

    val x = true
    val edad = 18
    //val sexo = "M"

    if (x) {
        println("Es verdadero")
    } else {
        println("Es falso")
    }

    /*
    val edad = 34
    if (edad >= 18){
        println("Es mayor de edad")
    }else{
        println("Es menor de edad")
    }*/

    //
    /*
    val edad = 34
    if (edad === 18) { // === es 'exactamente igual'
        println("Tiene 18 años cumplidos")
    } else if (edad > 18) {
        println("Es mayor de 18 años")
    } else {
        println("Es menor de edad")
    }*/

    //-------------------------------------------------------
    //val sexo = "M"
    val sexo = "F"

    if (edad === 18) { // === es 'exactamente igual'
        println("Tiene 18 años cumplidos")
        if (sexo === "M") {
            println("Le toca servicio obligatorio")
        } else {
            println("El servicio es opcional")
        }

    } else if (edad > 18) {
        println("Es mayor de 18 años")
    } else {
        println("Es menor de edad")
    }


}

