package id.ac.stiki.doleno.outdoorsportsequipment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Setting : AppCompatActivity() {

    private lateinit var cvakun: CardView
    private lateinit var cvhelp: CardView
    private lateinit var cvkontak: CardView
    private lateinit var cvabout: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        supportActionBar?.title = "Setting"

        cvhelp = findViewById(R.id.cvhelp)
        cvkontak = findViewById(R.id.cvkontak)
        cvabout = findViewById(R.id.cvabout)

        cvhelp.setOnClickListener(::onCardViewClick)
        cvkontak.setOnClickListener(::onCardViewClick)
        cvabout.setOnClickListener(::onCardViewClick)
    }

    private fun onCardViewClick(view: View) {
        when (view.id) {
            R.id.cvhelp -> {
                Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show()
                val tolong = Intent(this, Help::class.java)
                startActivity(tolong)
            }
            R.id.cvkontak -> {
                Toast.makeText(this, "Contact Us", Toast.LENGTH_SHORT).show()
                val kontak = Intent(this, Contact::class.java)
                startActivity(kontak)
            }
            R.id.cvabout -> {
                Toast.makeText(this, "About", Toast.LENGTH_SHORT).show()
                val tentang = Intent(this, About::class.java)
                startActivity(tentang)
            }
        }
    }
}
