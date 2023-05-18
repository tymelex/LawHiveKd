package com.example.lawhive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    lateinit var edt_password: EditText
    lateinit var edt_email: EditText
    lateinit var btn_login: Button
    lateinit var btn_createacc: Button
    lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        edt_password = findViewById(R.id.txtpasssword)
        edt_email= findViewById(R.id.txtemail)
        btn_login = findViewById(R.id.btnlogin)
        btn_createacc = findViewById(R.id.btncreateacc)


        auth = FirebaseAuth.getInstance()



        btn_createacc.setOnClickListener {
            //takes you to create an account
            val gotocreateaccount = Intent(this, CreateAccount::class.java)
            startActivity(gotocreateaccount)

        }

        btn_login.setOnClickListener {
            val email1 = edt_email.text.toString().trim()
            val password1 = edt_password.text.toString().trim()

            if (email1.isEmpty() || password1.isEmpty()) {
                Toast.makeText(this, "Cannot submit empty field", Toast.LENGTH_SHORT).show()

            } else {
                auth.signInWithEmailAndPassword(email1, password1).addOnCompleteListener(this) {

                    if (it.isSuccessful) {
                        Toast.makeText(this, "Logged in Successfully", Toast.LENGTH_SHORT).show()

                        //
                        val gotomain = Intent(this@LoginActivity, MainActivity::class.java)
                        startActivity(gotomain)
                        finish()

                    }else{

                        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
                    }
                }

            }





        }
    }
}