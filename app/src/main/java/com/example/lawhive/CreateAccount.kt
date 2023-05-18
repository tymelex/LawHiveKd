package com.example.lawhive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class CreateAccount : AppCompatActivity() {

    lateinit var edt_username2: EditText
    lateinit var edt_password2: EditText
    lateinit var edt_email2: EditText
    lateinit var edt_confirm: EditText
    lateinit var edt_phonenumber: EditText
    lateinit var btn_login2: Button
    lateinit var btn_createacc2: Button
    lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        edt_password2 = findViewById(R.id.txtpasssword2)
        edt_username2 = findViewById(R.id.textusername2)
        edt_email2= findViewById(R.id.txtemail2)
        edt_phonenumber= findViewById(R.id.edtphonenumber)
        edt_confirm= findViewById(R.id.edtconfirm)
        btn_login2 = findViewById(R.id.btnlogin2)
        btn_createacc2 = findViewById(R.id.btncreateaccount2)

        auth = FirebaseAuth.getInstance()

        btn_login2.setOnClickListener {

            val gotosignin = Intent(this@CreateAccount, LoginActivity::class.java)
            startActivity(gotosignin)

        }






        btn_createacc2.setOnClickListener {
            //Receive data from the user
            val username = edt_username2.text.toString()
            val phonenumber = edt_phonenumber.text.toString()
            val email = edt_email2.text.toString()
            val password = edt_password2.text.toString()
            val confirm = edt_confirm.text.toString()
            //Check if the user is trying to submit empty records

            if (username.isEmpty() || phonenumber.isEmpty() || email.isEmpty() || password.isEmpty() || confirm.isEmpty()) {

                Toast.makeText(this, "Cannot submit an empty field", Toast.LENGTH_SHORT).show()

            } else {
                // var my_child = FirebaseDatabase.getInstance().reference.child("Names/" + time_id)
                // var user_data = Users(email, password, confirmpass, time_id)
                //  show progress bar
                //  progress.show()

                // my_child.setValue(user_data).addOnCompleteListener {
                auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this){
                    if (it.isSuccessful) {

                        Toast.makeText(this, "Data Uploaded successfully", Toast.LENGTH_SHORT)
                            .show()

                        var gotomain = Intent(this, MainActivity::class.java)
                        startActivity(gotomain)
                        finish()
                    } else {
                        Toast.makeText(this, "Failed to upload data", Toast.LENGTH_SHORT).show()
                    }





                }
            }


        }




    }

}
