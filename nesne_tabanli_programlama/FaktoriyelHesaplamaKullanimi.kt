package com.example.kotlindersleri1.nesne_tabanli_programlama

fun main() {
    val sayi = 5

    try {
        val hesapla = FaktoriyelHesaplama()
        val faktoriyelSonuc = hesapla.faktoriyelHesapla(sayi)
        println("$sayi sayısının faktöriyeli: $faktoriyelSonuc")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}