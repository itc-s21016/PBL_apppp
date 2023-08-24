package com.example.pbl_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.pbl_app.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.btTouroku.setOnClickListener {
            Navigation.findNavController(it).navigate(
//                FirstFragmentDirections.actionFirstFragmentToSecondFragment()
                FirstFragmentDirections.actionFirstFragmentToThirdFragment()
            )
        }
        return binding.root
    }
}