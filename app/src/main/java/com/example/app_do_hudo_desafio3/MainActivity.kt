package com.example.app_do_hudo_desafio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_do_hudo_desafio3.adapter.adapterProduto
import com.example.app_do_hudo_desafio3.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerView_produtos)
        recyclerView_produtos.layoutManager = LinearLayoutManager (this)
        recyclerView_produtos.setHasFixedSize(true)
        //Adapter
        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = adapterProduto (this,listaProdutos)
        recyclerView_produtos.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.merdecez,
            nome = "Classe S",
            descricao = "Carrão",
            preco = "4.000.000,00"
        )
        listaProdutos.add(produto1)
        val produto2 = Produto(
            R.drawable.class_a,
            nome = "Classe A",
            descricao = "Carrão toper",
            preco = "4.000.000,00"
        )
        listaProdutos.add(produto2)
        val produto3 = Produto(
            R.drawable.class_g,
            nome = "Classe G",
            descricao = "Carrão louco",
            preco = "1.000.000,00"
        )
        listaProdutos.add(produto3)
        val produto4 = Produto(
            R.drawable.classe_e,
            nome = "Classe E",
            descricao = "Carrão fino",
            preco = "3.500.000,00"
        )
        listaProdutos.add(produto4)
        val produto5 = Produto(
            R.drawable.class_e_coper,
            nome = "Classe E Cooper",
            descricao = "Carrão pequeno",
            preco = "900.000,00"
        )
        listaProdutos.add(produto5)
        val produto6 = Produto(
            R.drawable.c450,
            nome = "Mercedez C450",
            descricao = "Carrão",
            preco = "3.000.000,00"
        )
        listaProdutos.add(produto6)
    }
}