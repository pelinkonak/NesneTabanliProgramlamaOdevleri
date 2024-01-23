package com.example.kotlindersleri1.nesne_tabanli_programlama

fun main(){
//Nesne Oluşturma
    val bmw = Araba("kırmızı",0,false )

    //Okuma
    println("Renk : ${bmw.renk}")
    println("Hız  : ${bmw.hiz}")
    println("Çalışıyor mu : ${bmw.calisiyorMu}")

    val sahin = Araba("beyaz",40,false )

    println("Renk : ${sahin.renk}")
    println("Hız  : ${sahin.hiz}")
    println("Çalışıyor mu : ${sahin.calisiyorMu}")

}