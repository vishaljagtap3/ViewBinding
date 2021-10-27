package com.example.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewbinding.databinding.UserProfileBinding

class UserProfileFragment : Fragment() {

    private lateinit var binding : UserProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = UserProfileBinding.inflate(inflater, container, false)

        binding.txtUsername.text = "BitCode"
        binding.imgUserAvatar.setImageResource(R.mipmap.ic_launcher)
        return binding.root
    }
}