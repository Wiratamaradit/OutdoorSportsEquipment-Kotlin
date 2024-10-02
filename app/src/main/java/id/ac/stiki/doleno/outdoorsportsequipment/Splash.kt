package id.ac.stiki.doleno.outdoorsportsequipment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Window

class Splash : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)
        val timer: Thread = object : Thread() {
            override fun run() {
                try { sleep(4000) }
                catch (e: InterruptedException) {
                    e.printStackTrace() } finally {
                    finish()
                    val m = Intent(this@Splash, MainActivity::class.java)
                    startActivityForResult(m, 0)
                }
            }
        }
        timer.start()
    }
}