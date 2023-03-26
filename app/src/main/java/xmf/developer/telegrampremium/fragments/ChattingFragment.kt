package xmf.developer.telegrampremium.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import xmf.developer.telegrampremium.R
import xmf.developer.telegrampremium.databinding.FragmentChattingBinding

class ChattingFragment : Fragment() {
    private val binding by lazy { FragmentChattingBinding.inflate(layoutInflater) }
     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

         return binding.root
    }
}