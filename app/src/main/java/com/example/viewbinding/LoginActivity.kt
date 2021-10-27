package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.UserLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : UserLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = UserLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            if(binding.edtUsername.text.toString().equals("bitcode") && binding.edtPassword.text.toString().equals("bitcode")) {
                startActivity( Intent(this@LoginActivity, HomeActivity::class.java))
            }
        }

    }
}