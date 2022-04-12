package com.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 12.04.2022               │
//└──────────────────────────┘

//Room Database
@Database(entities = [BookModel::class], version = 1)// Sütun ekleme,sütun silme vs gibi işlemlerde versiyon değiştirilmelidir.
abstract class BookshelfDatabase :RoomDatabase(){

    //Dao Çağrılır.
    abstract fun bookselfDao(): BookshelfDAO

    //Veritabanı 1 kez oluşturulacak.1 den fazla fragment aynı anda database i kullanabilir.
    companion object {

        private var INSTANCE: BookshelfDatabase? =
            null //Instance yoksa oluştur varsa varolan veritabanını getir.

        //Instance boş mu değil mi kontrolü yaptırılır.
        fun getBookshelfDatabase(context: Context): BookshelfDatabase? {
            if (INSTANCE == null) {
                INSTANCE =
                    Room.databaseBuilder(context, BookshelfDatabase::class.java, "bookshelf.db")
                        .allowMainThreadQueries()
                        .build()
            }
            return INSTANCE
        }
    }
}