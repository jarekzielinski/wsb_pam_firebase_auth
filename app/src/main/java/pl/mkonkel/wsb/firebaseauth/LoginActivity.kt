package pl.mkonkel.wsb.firebaseauth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
//    TODO Get firebaseAuth instance here

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        login_button.setOnClickListener {
            val email = email_layout.editText?.text.toString() ?: ""
            val password = password_layout.editText?.text.toString() ?: ""

            login(email, password)
        }
    }

    private fun login(email: String, password: String) {
//        TODO: Add signInWithEmailAndPassword
    }
}