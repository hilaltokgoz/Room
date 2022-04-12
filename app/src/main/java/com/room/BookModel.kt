package com.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 12.04.2022               │
//İlk önce Entity oluşturulacak yani bir model daha sonra Dao oluşturulacak daha sonra room/
//kitap id,yazar adı ve kitap adı olucak
@Entity(tableName = "bookshelf")
data class BookModel(
    @PrimaryKey(autoGenerate = true) //Her yeni girişte otomatik id ver.
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "book_name") //burada bookName olarak kullanacağım ama tabolaya book_name olarak yaz.
    var bookName: String,

    @ColumnInfo(name = "author_name")
    var author: String
)
