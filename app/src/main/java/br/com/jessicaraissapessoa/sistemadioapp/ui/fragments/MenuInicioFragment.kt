package br.com.jessicaraissapessoa.sistemadioapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.jessicaraissapessoa.sistemadioapp.databinding.FragmentMenuInicioBinding

class MenuInicioFragment : Fragment() {

    private var _binding : FragmentMenuInicioBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentMenuInicioBinding.inflate(inflater, container, false)

        return binding.root
    }
}