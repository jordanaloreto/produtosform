package com.example.application.data;

import jakarta.validation.constraints.Email;
import java.time.LocalDate;


public class Produto {

   
    private Long id;
    private String nome;
    private String ultimaDataCompra;
    private String fornecedor;
    private String preco;

   public Produto() {
    }

    // Construtor com parâmetros
    public Produto(Long id, String nome, String ultimaDataCompra, String fornecedor, String preco) {
        this.id = id;
        this.nome = nome;
        this.ultimaDataCompra = ultimaDataCompra;
        this.fornecedor = fornecedor;
        this.preco = preco;
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

    public String getUltimaDataCompra() {
        return ultimaDataCompra;
    }

    public void setUltimaDataCompra(String ultimaDataCompra) {
        this.ultimaDataCompra = ultimaDataCompra;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

}
