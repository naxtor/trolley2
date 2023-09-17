package com.trolley.app.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.trolley.app.R
import com.trolley.app.databinding.ActivityLoginBinding
import com.trolley.app.ui.home.HomeActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        binding.apply {
            btnLogin.setOnClickListener {
                resetView()

                val username = inputUsername.editText?.text.toString()
                val password = inputPassword.editText?.text.toString()

                if (username.isEmpty()) {
                    inputUsername.error = getString(R.string.error_username_empty)
                    return@setOnClickListener
                } else if (password.isEmpty()) {
                    inputPassword.error = getString(R.string.error_password_empty)
                    return@setOnClickListener
                }

                if (username == "pengguna" && password == "masuk") {
                    val intent = Intent(this@LoginActivity, HomeActivity::class.java).apply {
                        flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                    }
                    startActivity(intent)
                    finish()
                } else {
                    showBottomSheetError(getString(R.string.error_login_failed))
                }
            }
        }
    }

    private fun showBottomSheetError(error: String) {
        val bottomSheet = BottomSheetDialog(this)
        bottomSheet.setContentView(R.layout.bottom_sheet_error_layout)
        bottomSheet.findViewById<TextView>(R.id.text_error)?.text = error
        bottomSheet.show()
    }

    private fun resetView() {
        binding.apply {
            inputUsername.isErrorEnabled = false
            inputPassword.isErrorEnabled = false
        }
    }
}