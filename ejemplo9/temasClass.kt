/*
La estructura básica en Kotlin de una clase es:
class [nombre de la clase] {
    [propiedades de la clase]
    [métodos o funciones de la clase]
}
*/
class Persona {
    var nombre: String = ""
    var edad: Int = 0

    fun inicilizar(nombre: String, edad: Int){
        this.nombre = nombre
        this.edad = edad
    }

    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad(){
        if(edad >= 18)
            println("Es mayor de edad")
        else
            println("Es menor de edad")
    }
}

fun main(parametro: Array<String>){
    val persona1 = Persona()
    persona1.inicilizar("Juan", 25)
    persona1.imprimir()
    persona1.esMayorEdad()

    val persona2 = Persona()
    persona2.inicilizar("Ana", 15)
    persona2.imprimir()
    persona2.esMayorEdad()
}