package com

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.room.BookshelfDatabase
import com.room.databinding.FragmentAddBookBinding


class AddBookFragment : Fragment() {
   private var _binding:FragmentAddBookBinding?=null
   private val binding get()= _binding!!
    //Room
    private  lateinit var bookshelfDB: BookshelfDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bookshelfDB=BookshelfDatabase.getBookshelfDatabase(requireContext())!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentAddBookBinding.inflate(inflater)
        return binding.root

    }
}