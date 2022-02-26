package com.sample.screensnavigation.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sample.screensnavigation.R
import com.sample.screensnavigation.databinding.FragmentABinding


class FragmentA : Fragment() {

    private var _binding: FragmentABinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentABinding.inflate(inflater)

        setHasOptionsMenu(true)

        binding.btnOpenChildScreen.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentA1)

        }

        Log.i("FragmentA","onCreateView")

        return binding.root
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        retainInstance = true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("FragmentA","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("FragmentA","onDestroy")
        _binding = null
    }

}