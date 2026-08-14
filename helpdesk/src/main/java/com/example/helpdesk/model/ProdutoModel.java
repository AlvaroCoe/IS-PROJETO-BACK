package com.example.helpdesk.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table (name = "/tab_produtos")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String codigoProduto;

    @Column(nullable = false)
    private String dataFabricacao;

    @Column(nullable = false)
    private String preco;

    @Column(nullable = false)
    private int quantidade;


    public ProdutoModel() {
    }

    public ProdutoModel(Long id, String nome, String codigoProduto, String dataFabricacao, String preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.codigoProduto = codigoProduto;
        this.dataFabricacao = dataFabricacao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
