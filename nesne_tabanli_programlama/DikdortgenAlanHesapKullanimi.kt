package com.example.kotlindersleri1.nesne_tabanli_programlama

fun main() {
    val hesapla = DikdortgenAlanHesap()

    val uzunKenar = 5.0
    val kisaKenar = 3.0

    val dikdortgenAlan = hesapla.dikdortgenAlaniniHesapla(uzunKenar, kisaKenar)

    println("Dikdörtgenin alanı: $dikdortgenAlan birim karedir.")
}