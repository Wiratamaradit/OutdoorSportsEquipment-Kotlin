package id.ac.stiki.doleno.outdoorsportsequipment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Mountainbike : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mountainbike)

        supportActionBar?.title = "Mountain Bike / Downhill Sports"
    }
}