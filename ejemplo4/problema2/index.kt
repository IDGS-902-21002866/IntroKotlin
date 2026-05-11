/*
Problema 2: Una batería comienza con (0%) de carga. Un cargador añade \(15\%\) cada minuto. Se debe detener el ciclo cuando la carga llegue o supere el \(100\%\).
*/
fun main(){
    var carga = 0
    do {
        
        carga += 15
        
        if(carga > 100){
            carga = 100 
        }
        println("La carga es $carga")
    } while(carga < 100)
}