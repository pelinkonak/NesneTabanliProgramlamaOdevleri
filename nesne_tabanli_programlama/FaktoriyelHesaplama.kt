package com.example.kotlindersleri1.nesne_tabanli_programlama

class FaktoriyelHesaplama {
    fun faktoriyelHesapla(sayi: Int): Long {
        if (sayi < 0) {
            throw IllegalArgumentException("Negatif sayının faktöriyeli tanımsızdır.")
        }

        var faktoriyel: Long = 1

        for (i in 1..sayi) {
            faktoriyel *= i.toLong()
        }

        return faktoriyel

    }
}
