package com.example.pbl_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.pbl_app.databinding.FragmentSecondBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 画面が表示された際に遅延遷移をスケジュール
        scheduleDelayedNavigation()
    }
    

    private fun scheduleDelayedNavigation() {
        GlobalScope.launch {
            delay(3000) // 3000ミリ秒（3秒）後に遷移
            // ここで遷移のアクションを呼び出す
            // 例えば、Navigation ComponentのNavControllerを使用して遷移を行う
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
    }
}







