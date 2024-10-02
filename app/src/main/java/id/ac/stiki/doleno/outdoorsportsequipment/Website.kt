package id.ac.stiki.doleno.outdoorsportsequipment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.ac.stiki.doleno.outdoorsportsequipment.WebsiteAdapter

class Website(val url: String, val logo: Int) : AppCompatActivity() {
    constructor() : this("", 0)

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: WebsiteAdapter
    private lateinit var websiteList: List<Website>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)

        supportActionBar?.title = "Outdoor Store Website"

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        websiteList = listOf(
            Website("https://www.consina.com", R.drawable.consina),
            Website("https://www.eigeradventure.com", R.drawable.eiger),
            Website("https://www.deuter.com", R.drawable.deuter),
            Website("https://www.osprey.com", R.drawable.osprey),
            Website("https://www.mammut.com", R.drawable.mammut),
            Website("https://www.blackdiamondequipmnet.com", R.drawable.black_diamond),
            Website("https://www.thenorthface.com", R.drawable.tnf),
            Website("https://www.berghaus.com", R.drawable.berghaus),
            Website("https://www.patagonia.com", R.drawable.patagonia),
            Website("https://www.polygonbikes.com", R.drawable.polygon),
            Website("https://www.thrillbicycle.com", R.drawable.thrill),
            Website("https://www.spesialized.com", R.drawable.specialized),
            Website("https://www.trekbikes.com", R.drawable.trek),
            Website("https://www.santacruzbicycle.com", R.drawable.santa_cruz),
            Website("https://www.outdoorplay.com", R.drawable.outdoorplay),
            Website("https://www.cascaderivergear.com", R.drawable.cascade),
            Website("https://www.divein.com", R.drawable.divein),
            Website("https://www.scubadiving.com", R.drawable.scubadiving),
            Website("https://www.johnsonoutdoors.com", R.drawable.johnson)
        )

        adapter = WebsiteAdapter(websiteList)
        recyclerView.adapter = adapter
    }
}
