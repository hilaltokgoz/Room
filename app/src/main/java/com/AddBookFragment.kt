package com

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.room.BookModel
import com.room.BookshelfDatabase
import com.room.R
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       //sürekli binding yazmak istemediğimiz için apply yazdık.
        binding.apply {
            bookAddButton.setOnClickListener{
                //Yazılan Verileri Alma
                val bookNameInput= bookNameEditText.text.toString()
                val authorNameInput=authorNameEditText.text.toString()

                bookshelfDB.bookselfDao().bookAdd(
                    BookModel(
                        bookName = bookNameInput,
                        author = authorNameInput))
                findNavController().navigate(R.id.action_addBookFragment_to_homePageFragment)
            }
        }

    }
}