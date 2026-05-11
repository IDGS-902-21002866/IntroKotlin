/*
definicion de rangos
    val unDigito= 1..9
    val letras = 'a'...'z'
    val docena = 1..12

if (5 in docena)
    printin("el numero 5 esta en el rando docena")
if (18 lin docena)
    printin("el 18 no esta en el rango docena")
*/
fun main(){
    for(i in 1..10){
        println(i)
    }

    for (i in 1..10 step 2){
        println(i)
    }

    for(i in 10 downTo 1){
        println(i)
    }

    for(i in 10 downTo 1 step 2){
        println(i)
    }
}