package id.ac.stiki.doleno.outdoorsportsequipment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Climbing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_climbing)

        supportActionBar?.title = "Rock Climbing Sports"
    }
}