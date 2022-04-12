package com.room

import androidx.room.*

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 12.04.2022               │
//└──────────────────────────┘
//Update,Insert,Delete vs otomatik olaak room ile gelir.Annotation kullanarak direkt kullanımı sağlanabilir.
@Dao
interface BookshelfDAO {
    @Insert
    fun bookAdd(book: BookModel)

    @Update
    fun bookUpdate(book: BookModel)

    @Delete
    fun bookDelete(book: BookModel)

    //Eğer sorguyu kendimiz yazmak istersek;
    @Query("SELECT * FROM bookshelf")
    fun allBooks(): ArrayList<BookModel?>
}