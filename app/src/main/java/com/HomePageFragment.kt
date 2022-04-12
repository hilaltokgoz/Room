package com

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.room.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {
  private var _binding:FragmentHomePageBinding?=null
    private  val binding get()=_binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      _binding= FragmentHomePageBinding.inflate(inflater)
        return binding.root
    }

}