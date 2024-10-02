package id.ac.stiki.doleno.outdoorsportsequipment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var cv1: CardView
    private lateinit var cv2: CardView
    private lateinit var cv3: CardView
    private lateinit var cv4: CardView
    private lateinit var cv5: CardView
    private lateinit var cv6: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        cv1 = findViewById(R.id.cv1)
        cv2 = findViewById(R.id.cv2)
        cv3 = findViewById(R.id.cv3)
        cv4 = findViewById(R.id.cv4)
        cv5 = findViewById(R.id.cv5)
        cv6 = findViewById(R.id.cv6)

        cv1.setOnClickListener(::onCardViewClick)
        cv2.setOnClickListener(::onCardViewClick)
        cv3.setOnClickListener(::onCardViewClick)
        cv4.setOnClickListener(::onCardViewClick)
        cv5.setOnClickListener(::onCardViewClick)
        cv6.setOnClickListener(::onCardViewClick)


        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_item1 -> {
                    val beranda = Intent(applicationContext, MainActivity::class.java)
                    startActivity(beranda)
                    true
                }
                R.id.menu_item2 -> {
                    val website = Intent(applicationContext, Website::class.java)
                    startActivity(website)
                    true
                }
                R.id.menu_item3 -> {
                    val setting = Intent(applicationContext, Setting::class.java)
                    startActivity(setting)
                    true
                }
                else -> false
            }
        }
    }

    private fun onCardViewClick(view: View) {
        when (view.id) {
            R.id.cv1 -> {
                Toast.makeText(this, "Diving", Toast.LENGTH_SHORT).show()
                val diving = Intent(this, Diving::class.java)
                startActivity(diving)
            }
            R.id.cv2 -> {
                Toast.makeText(this, "Hiking", Toast.LENGTH_SHORT).show()
                val hiking = Intent(this, Hiking::class.java)
                startActivity(hiking)
            }
            R.id.cv3 -> {
                Toast.makeText(this, "Climbing", Toast.LENGTH_SHORT).show()
                val climbing = Intent(this, Climbing::class.java)
                startActivity(climbing)
            }
            R.id.cv4 -> {
                Toast.makeText(this, "Rafting", Toast.LENGTH_SHORT).show()
                val rafting = Intent(this, Rafting::class.java)
                startActivity(rafting)
            }
            R.id.cv5 -> {
                Toast.makeText(this, "Caving", Toast.LENGTH_SHORT).show()
                val caving = Intent(this, Caving::class.java)
                startActivity(caving)
            }
            R.id.cv6 -> {
                Toast.makeText(this, "MountainBike", Toast.LENGTH_SHORT).show()
                val mtb = Intent(this, Mountainbike::class.java)
                startActivity(mtb)
            }
        }
    }
}
