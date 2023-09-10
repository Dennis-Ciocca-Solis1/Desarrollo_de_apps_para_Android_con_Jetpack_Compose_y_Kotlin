//CLASES

class Personas {
    //Atributos (variables)
    var nombre = ""
    var edad = 0

    //Constructor secundario
    constructor(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }

    //Métodos
    fun hola() {
        println("Hola, me llamo $nombre y tengo $edad años")
    }


}

//creando otra clase con sólo constructor primario
class Usuarios(private var name: String, private var email: String) {
    fun login() {
        println("Login con user: $name, email: $email")
    }
}


fun main() {
    //construyendo un objeto a partir de una clase
    val persona = Personas("Jorge", 12)

    println(persona.nombre)
    println(persona.edad)
    println(persona.hola())

    //construyendo otro objeto
    val user = Usuarios("Pedro", "pedro@gmail.com")
    val user2 = Usuarios("Angelica", "angie@gmail")

    println(user2.login())

}