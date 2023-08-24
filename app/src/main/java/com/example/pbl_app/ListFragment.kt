package com.example.pbl_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SimpleAdapter
import com.example.pbl_app.databinding.FragmentListBinding

class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentListBinding? = null
    private val binding get() =  _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)

        val data = listOf(
            mapOf("name" to "2F男子トイレ", "detail" to "小：空き2 大：空き1"),
            mapOf("name" to "4F男子トイレ", "detail" to "小：空き2 大：空き1"),
            mapOf("name" to "5F男子トイレ", "detail" to "小：空き2 大：空き1")
        )

        
        // Inflate the layout for this fragment
        return binding.root
    }
}