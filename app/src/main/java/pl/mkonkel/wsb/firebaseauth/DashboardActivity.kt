package pl.mkonkel.wsb.firebaseauth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    private val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

//      TODO add some TextVoew and display basic User Information
//      uid
//      displayName
//      email

        logout.setOnClickListener {
            auth.signOut()
            finish()
        }
    }
}
