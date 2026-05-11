/*
Problema 1: Un programa solicita al usuario ingresar el diámetro de una tubería.
No se permiten valores negativos o cero. El programa debe pedir el dato repetidamente hasta que el usuario ingrese un valor válido.
*/
fun main() {
    var diametro: Double

    do {
        println("Ingrese el diametro de la tuberia: ")

        diametro = readln().toDouble()

        if(diametro <= 0) println("Valor invalido")

    } while(diametro <= 0)

    println("El diametro es $diametro")
}