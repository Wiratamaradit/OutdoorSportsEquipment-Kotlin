package id.ac.stiki.doleno.outdoorsportsequipment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Diving : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diving)

        supportActionBar?.title = "Diving Sports"

    }
}