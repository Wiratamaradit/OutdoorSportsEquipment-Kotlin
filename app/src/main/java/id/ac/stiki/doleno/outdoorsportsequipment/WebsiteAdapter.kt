package id.ac.stiki.doleno.outdoorsportsequipment

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WebsiteAdapter(private val websitesList: List<Website>) :
    RecyclerView.Adapter<WebsiteAdapter.WebsiteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WebsiteViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_listwebsite, parent, false)
        return WebsiteViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WebsiteViewHolder, position: Int) {
        val website = websitesList[position]
        holder.logoImageView.setImageResource(website.logo)
        holder.urlTextView.text = website.url

        holder.urlTextView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(website.url)
            holder.urlTextView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return websitesList.size
    }

    inner class WebsiteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val logoImageView: ImageView = itemView.findViewById(R.id.image_logo)
        val urlTextView: TextView = itemView.findViewById(R.id.text_url)
    }
}
