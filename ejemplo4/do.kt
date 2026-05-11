fun main(){
    var x = 1

    while(x <= 10){
        println(x)
        x++
    }

    var cant = 0
    var suma = 0

    do {
        print("Ingrese un numero (0 para terminar): ")

        val valor = readln().toInt()

        if(valor != 0){
            suma += valor
            cant++
        }
    } while(valor != 0)

    if(cant != 0){
        val promedio = suma / cant 
        println("El promedio de los numeros ingresados es: $promedio")
    } else 
        println("No se ingresaron numeros")
}

/*
Problema 1: Un programa solicita al usuario ingresar el diámetro de una tubería.
No se permiten valores negativos o cero. El programa debe pedir el dato repetidamente hasta que el usuario ingrese un valor válido.

Problema 2: Una batería comienza con 1(81%1) de carga. Un cargador añade \(15\%\) cada minuto. Se debe detener el ciclo cuando la carga llegue o supere el \(200\%\).

Problema 3: Un controlador PLC bloquea el acceso tras 3 intentos fallidos de ingresar
una clave de seguridad.
*/