package com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.room.BookshelfDatabase
import com.room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //ViewBinding Kurulumu
     private lateinit var binding:ActivityMainBinding
     //Room Kullanımı
     private lateinit var bookshefDB: BookshelfDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //room çağırma
        bookshefDB=BookshelfDatabase.getBookshelfDatabase(this)!!

    }
}