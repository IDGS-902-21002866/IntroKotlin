fun main(){
    
    val saludos = "Hola"
    val nombre: String = "Kotlin"

    println("$saludos $nombre")

    println("Ingresa el primer numero:")
    val num1 = readln().toInt()
    println("Ingresa el segundo numero:")
    val num2 = readln().toInt()

    var res = num1 + num2
    println("La suma es: $res")
}