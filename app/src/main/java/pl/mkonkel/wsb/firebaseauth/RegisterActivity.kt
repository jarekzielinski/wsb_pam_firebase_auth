package pl.mkonkel.wsb.firebaseauth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class RegisterActivity : AppCompatActivity() {
//    TODO Get firebaseAuth instance here

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_button.setOnClickListener {
            val email = email_layout.editText?.text.toString() ?: ""
            val password = password_layout.editText?.text.toString() ?: ""

            register(email, password)
        }
    }

    private fun register(email: String, password: String) {
//        TODO: Add createUserWithEmailAndPassword
    }
}