package com.example.pbl_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.pbl_app.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        binding.btrelood.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ThirdFragmentDirections.actionThirdFragmentToListFragment()
            )
        }
        return binding.root
    }



}