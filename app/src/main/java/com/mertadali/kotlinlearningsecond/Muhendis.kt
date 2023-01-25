package com.mertadali.kotlinlearningsecond

class Muhendis {
    var surname = ""
    var age = 0
    var depertman = ""

    // Muhendis sınıfından bir obje oluşturulduğunda çağırılacak method anlamına gelir.

    constructor(ageInput : Int, surnameInput: String, depertmanInput: String) {
        this.age = ageInput
        this.surname = surnameInput
        this.depertman = depertmanInput

    }
}