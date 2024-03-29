package com.sample.screensnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.sample.screensnavigation.R
import com.sample.screensnavigation.databinding.FragmentABinding
import com.sample.screensnavigation.databinding.FragmentBBinding


class FragmentB : Fragment() {
    private var _binding: FragmentBBinding? = null

    private val binding get() = _binding!!

    // FragmentBArgs is generated by safeargs
    private val args by navArgs<FragmentBArgs>() // get argument data from navigation

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBBinding.inflate(inflater)

        setHasOptionsMenu(true)

        binding.btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB_to_fragmentMain)
        }

        binding.txtDescription.text = args.item.description

        return binding.root
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}