package pt.ie.smartcold_qrreader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activitylogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.loginentrada)

        button.setOnClickListener {
            val intent = Intent(this, menu_principal::class.java)
            startActivity(intent)
        }

    }
}