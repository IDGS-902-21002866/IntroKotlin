/*
•••--Suma de dos matrices 3x3 en Kotlin---crear un programa que permita al usuario ingresar por teclado los valores de dos matrices de tamaño 3x3 y posteriormente realiza la suma de ambas matrices, mostrando el resultado en pantalla.
---Explicación del programa--.
Se crean tres matrices:
matriz1 para almacenar la primera matriz. matriz2 para almacenar la segunda matriz.
resultado para guardar la suma.
*/
fun main() {
    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val resultado = Array(3) { IntArray(3) }


    // Primero llenamos las matrices

    // Matriz 1
    for (i in 0..2){
        for(j in 0..2){
            print("Ingese el valor de la matriz 1 para la posicion [$i][$j]")
            matriz1[i][j] = readln().toInt()
        }
    }

    println("""
    Matriz 1
    """)

    for (i in 0..2){
        for(j in 0..2){
            print("${matriz1[i][j]} ")
        }
        println()
    }


    // Matriz 2
    for(i in 0..2){
        for(j in 0..2){
            print("Ingese el valor de la matriz 2 para la posicion [$i][$j]")
            matriz2[i][j] = readln().toInt()
        }
    }

    println("""
    Matriz 2
    """)

     for (i in 0..2){
        for(j in 0..2){
            print("${matriz2[i][j]} ")
        }
        println()
    }


    // Ahora sumamos los elementos de cada uno de las matrices
    for(i in 0..2){
        for(j in 0..2){
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("""
    Matriz resultante
    """)

     for (i in 0..2){
        for(j in 0..2){
            print("${resultado[i][j]} ")
        }
        println()
    }

}