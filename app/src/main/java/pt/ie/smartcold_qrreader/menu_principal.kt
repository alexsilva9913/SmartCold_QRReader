package pt.ie.smartcold_qrreader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class menu_principal : AppCompatActivity() {

    var valueQRNovo = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val button = findViewById<Button>(R.id.openqr)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        valueQRNovo = intent.getStringExtra("valordoqr").toString()

        var valueQR = findViewById<TextView>(R.id.valueQR)

        if(valueQRNovo.isNullOrEmpty()){
            valueQR.setText("Valor do QRCODE")
        }
        else{
            valueQR.setText(valueQRNovo)
        }
    }
}