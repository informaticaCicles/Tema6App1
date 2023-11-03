package com.example.tema6app1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.tema6app1.R
import com.example.tema6app1.databinding.FragmentBlueBinding


class BlueFragment : Fragment() {

private lateinit var mBinding : FragmentBlueBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentBlueBinding.inflate(inflater, container, false)

        //Gestionamos el evento del botón
        mBinding.btnFragmentAzul.setOnClickListener {
            Toast.makeText(context, "Fragment Azul presionado", Toast.LENGTH_LONG).show()
        }
        return mBinding.root
    }
}