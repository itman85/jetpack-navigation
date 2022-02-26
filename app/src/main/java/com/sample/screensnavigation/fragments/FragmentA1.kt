package com.sample.screensnavigation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sample.screensnavigation.R
import com.sample.screensnavigation.databinding.FragmentA1Binding
import com.sample.screensnavigation.databinding.FragmentABinding


class FragmentA1 : Fragment() {

    private var _binding: FragmentA1Binding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentA1Binding.inflate(inflater)

        setHasOptionsMenu(true)

        binding.btnBack.setOnClickListener {
           // findNavController().navigate(R.id.action_fragmentA1_to_fragmentA)
        }

        Log.i("FragmentA1","onCreateView")

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("FragmentA1","onDestroy")
        _binding = null
    }

}