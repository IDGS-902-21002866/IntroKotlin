import kotlin.math.pow
import kotlin.math.PI
/*
Crear un programa que permita calcular el área de 4 figuras, mostrara un menú para elegir la figura a calcular el área, pedirá los valores necesarios y mostrara el resultado, a continuación, mostrara nuevamente el menú termina al elegir opción 5
*/

fun mostrarMenu(){
    println(
    """Ingrese el numero la figura que quieres calcular
    1. Cuadrado 
    2. Triangulo 
    3. Circulo 
    4. Rectangulo 
    0. Salir 
    """)
}

fun calcularAreaCuadrado(lado: Int): Double{
    val area = lado.toDouble().pow(2)

    return area
}

fun calcularAreaTriangulo(base: Int, altura: Int): Double{
    val area = (base * altura) / 2.0

    return area
}

fun calcularAreaCirculo(radio: Int): Double{
    val area = PI*radio.toDouble().pow(2)

    return area
}
fun calcularAreaRectangulo(base: Int, altura: Int): Double{
    val area = base.toDouble() * altura.toDouble();

    return area
}

fun limpiarPantalla(){
    ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
}

fun main(){
    
    var opcion: Int;

    do{
        
        mostrarMenu()
        opcion = readln().toInt()

        if(opcion < 5){
            when(opcion){
                1 -> {
                    println("Ingrese la medida del lado del cuadrado: ")
                    val lado = readln().toInt()
                    val area = calcularAreaCuadrado(lado)
                    println("El area del cuadrado es: $area")
                }
                2 -> {
                    println("Ingrese la medida de la base del triangulo")
                    val base = readln().toInt()
                    println("Ingrese la medida de la altura del triangulo")
                    val altura = readln().toInt()
                    val area = calcularAreaTriangulo(base, altura)
                    println("El area del triangulo es: $area")
                }
                3 -> {
                    println("Ingrese el radio del circulo")
                    val radio = readln().toInt()
                    val area = calcularAreaCirculo(radio)
                    println("El area del cirulo es: $area")
                }
                4 -> {
                    println("Ingrese la medida de la base del rectanculo")
                    val base = readln().toInt()
                    println("Ingrese la medida de la altura del rectanculo")
                    val altura = readln().toInt()
                    val area = calcularAreaRectangulo(base, altura)
                    println("El area del reactangulo es: $area")
                }
            }
        } else {
            println("Opcion no valida")
        }

    } while (opcion != 0)

}