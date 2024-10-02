package id.ac.stiki.doleno.outdoorsportsequipment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Caving : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caving)

        supportActionBar?.title = "Caving Sports"
    }
}