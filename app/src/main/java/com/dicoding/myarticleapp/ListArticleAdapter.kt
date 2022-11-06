package com.dicoding.myarticleapp

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListArticleAdapter (private val listArticle: ArrayList<Article>): RecyclerView.Adapter<ListArticleAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Article)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvOverview: TextView = itemView.findViewById(R.id.tv_item_overview)
        var imgImage: ImageView = itemView.findViewById(R.id.img_item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_article, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val article = listArticle[position]

        Glide.with(holder.itemView.context).load(article.image)
            .apply(RequestOptions().override(55, 55)).into(holder.imgImage)

        holder.tvTitle.text = article.title
        holder.tvOverview.text = article.overview

        holder.itemView.setOnClickListener(){
            onItemClickCallback.onItemClicked(listArticle[holder.adapterPosition])
        }

    }

    override fun getItemCount(): Int = listArticle.size
}