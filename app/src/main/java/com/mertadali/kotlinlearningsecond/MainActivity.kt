package com.mertadali.kotlinlearningsecond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /* button.setOnClickListener {
           println("created")
       }*/          // bu şekilde de buttona tıklandığında ne olacağı yazılabilirdi.


        // Class
        // Bunun için yeni bir class oluşturucam.

        val  mert = Muhendis(22,"Adalı","Developer")  // Mert sınıfından kullanarak çektik bilgileri.  --> Instance & Object

       /* mert.age = 22
        mert.depertman = "Developer"
        mert.surname = "Adalı"
        println(mert.age) */

        // Nullability
        // Nullable (?) && Non-null
        var myString : String? = null    // soru işareti bize  Initiliaze edilmiş mi sorgusunu yap anlamını taşır.
        println(myString)

        // 1-)Null safety
        var myAges : Int? = null
        if (myAges != null){
            println(myAges + 5)
        }else{
            println("myAges : null")
        }

        // 2-)Elvis
        val myResult = myAges?.compareTo(2) ?: -1  // bu ifade  soldaki işlemlerden çıkan sonuç null ise -1 e eşitle demektir.
        println(myResult)


    }
    // Görünümler ve Fonksiyonlar.

    fun helloWorld(view : View){         //onClick metodu tanımlandı.
        textView.text = "Hello Kotlin"



    }




}