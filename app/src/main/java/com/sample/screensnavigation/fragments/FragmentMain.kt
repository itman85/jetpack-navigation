package com.sample.screensnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sample.screensnavigation.R
import com.sample.screensnavigation.databinding.FragmentMainBinding
import com.sample.screensnavigation.model.DataItem

class FragmentMain: Fragment() {

    private var _binding: FragmentMainBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnOpenA.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_fragmentA)
        }
        binding.btnOpenB.setOnClickListener {
            val actionDirection = FragmentMainDirections.actionFragmentMainToFragmentB(item = DataItem("Data item transfer from main screen"))
            findNavController().navigate(actionDirection)
        }
        binding.btnOpeC.setOnClickListener {
            findNavController().navigate(R.id.mainActivity2)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}