package com.example.learnmap.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.learnmap.R
import com.example.learnmap.databinding.FragmentSignInBinding

class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    private lateinit var binding: FragmentSignInBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignInBinding.bind(view)

        binding.signInButton.setOnClickListener {
            // TODO
        }
        binding.createAccountButton.setOnClickListener {
            // TODO
        }
    }
}