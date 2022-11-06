package com.dicoding.myarticleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ArticleRead : AppCompatActivity() {
    companion object {
        private const val INDEX_ARTICLE: Int = 0
    }

    private var list: ArrayList<Article> = arrayListOf()
    private var id: Int = 0

    private lateinit var article : Article

    private lateinit var article_image : ImageView
    private lateinit var article_title : TextView
    private lateinit var article_overview : TextView
    private lateinit var article_text1 : TextView
    private lateinit var article_text2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_read)

        list.addAll(ArticlesData.listData)
        article_image = findViewById(R.id.article_image)
        article_title = findViewById(R.id.article_title)
        article_overview = findViewById(R.id.article_overview)
        article_text1 = findViewById(R.id.article_text1)
        article_text2 = findViewById(R.id.article_text2)

        if (savedInstanceState != null) {
            id = savedInstanceState.getInt(INDEX_ARTICLE.toString(), 0)
        } else {
            id = intent.getIntExtra("article", 0)
        }

        article = list[id-1]

        article_image.setImageResource(article.image)
        article_title.setText(article.title)
        article_overview.setText(article.overview)
        article_text1.setText(article.text1)
        article_text2.setText(article.text2)
    }
}