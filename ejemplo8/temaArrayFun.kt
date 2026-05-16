fun cargar(arreglo: IntArray){
    for(i in arreglo.indeces){
        print("Ingrese elemento: ")
        arreglo[i] = readln().toInt()
    }
}

fun imprimir(arreglo: IntArray){
    for(elemento in arreglo){
        print(elemento )
    }
}

fun main(parametros: Array<String>){
    val arreglo = IntArray(5)
    cargar(arreglo)
    imprimir(arreglo)
}