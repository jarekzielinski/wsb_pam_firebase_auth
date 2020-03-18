package pl.mkonkel.wsb.firebaseauth

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkAuthStatus()

        login.setOnClickListener {
            launchLogin()
        }

        register.setOnClickListener {
            launchRegister()
        }
    }

    private fun isLogged(): Boolean {
        return auth.currentUser != null
    }

    private fun checkAuthStatus() {
        Handler().postDelayed(Runnable {
            if (isLogged()) {
                launchDashboard()
            } else {
                content.visibility = View.VISIBLE
            }
        }, 1000)

    }

    private fun launchDashboard() {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun launchRegister() {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun launchLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}