package com.senac.coinwallet.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "investimento")
public class Investimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Integer tipo;
    @Column(nullable = false)
    private Double valorInvestido;
    @Column(nullable = false)
    private Double valorTotal;
    @Column(nullable = false)
    private String vencimento;
    @Column(nullable = false)
    private String dataCompra;
    @Column(nullable = false)
    private Double iof;
    @Column(nullable = false)
    private Double indice;
    @Column(nullable = false)
    private Double precoUnitario;
    @Column(nullable = false)
    private String urlImg;

    public Investimento() {
    }

    public Investimento(String nome, Integer tipo, Double valorInvestido, Double valorTotal, String vencimento, String dataCompra, Double iof, Double indice, Double precoUnitario, String urlImg) {
        this.nome = nome;
        this.tipo = tipo;
        this.valorInvestido = valorInvestido;
        this.valorTotal = valorTotal;
        this.vencimento = vencimento;
        this.dataCompra = dataCompra;
        this.iof = iof;
        this.indice = indice;
        this.precoUnitario = precoUnitario;
        this.urlImg = urlImg;
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

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(Double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getIof() {
        return iof;
    }

    public void setIof(Double iof) {
        this.iof = iof;
    }

    public Double getIndice() {
        return indice;
    }

    public void setIndice(Double indice) {
        this.indice = indice;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
