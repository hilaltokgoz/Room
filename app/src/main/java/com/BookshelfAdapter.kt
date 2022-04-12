package com

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.room.BookModel
import com.room.databinding.ItemCardBinding

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 12.04.2022               │
//└──────────────────────────┘
//RecyclerView için
class BookshelfAdapter(private var bookList:ArrayList<BookModel?>)
    :RecyclerView.Adapter<BookshelfAdapter.ItemCardDesign>(){
        class  ItemCardDesign(val itemCardBinding:ItemCardBinding):RecyclerView.ViewHolder(itemCardBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemCardDesign {
        val layoutInflater=LayoutInflater.from(parent.context)
        val itemCardBinding=ItemCardBinding.inflate(layoutInflater,parent,false)
        return ItemCardDesign(itemCardBinding)
    }

    override fun onBindViewHolder(holder: ItemCardDesign, position: Int) {
        val book=bookList[position]

        holder.itemCardBinding.apply {
            if (book!=null){
                bookNameTextView.text=book.bookName
                authorNametextView.text=book.author
            }
        }
    }

    override fun getItemCount(): Int {
       return bookList.size
    }
}