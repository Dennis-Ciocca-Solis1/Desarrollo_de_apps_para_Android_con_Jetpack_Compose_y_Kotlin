//BUCLE FOR

fun main() {

    //imprime un rango de números
    for (i in 1..5) {
        println(i)

    }

    //imprime un rango de letras
    for (a in 'a'..'f') {
        println(a)
    }

    //imprime un rango de letras a la inversa
    for (b in 'f' downTo 'a') {
        println(b)
    }

    //imprimir los elementos de un array
    val users = arrayOf("Luis", "Ramon", "Laura", "Diana")
    for (user in users) {
        println(user)
    }

    //
    for (user in users.indices) {
        //println(user) //imrimir los índices(la posición) de un array

        println("[$user, ${users[user]}]") //imprimir la posición y el nombre
    }


}

