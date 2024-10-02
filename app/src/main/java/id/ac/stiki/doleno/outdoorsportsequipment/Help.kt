package id.ac.stiki.doleno.outdoorsportsequipment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView

class Help : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        supportActionBar?.title = "Instructions for use"

        val mywebView = findViewById<View>(R.id.myweb) as WebView
        val webViewSettings = mywebView.settings
        webViewSettings.defaultFontSize = 12
        mywebView.settings.javaScriptEnabled = true
        mywebView.loadUrl("file:///android_asset/petunjuk.htm")
    }
}