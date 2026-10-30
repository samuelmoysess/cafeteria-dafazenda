package br.com.CafeDaFazenda.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@Table (name = "Pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Integer codigo;
    private String produto;
    private String descricao;
    private String valor;
    private LocalDate datacadastro;
    private String ativo;

    //Constructor


    public Pedidos(Integer codigo, String produto, String descricao, String valor, LocalDate datacadastro, String ativo) {
        this.codigo = codigo;
        this.produto = produto;
        this.descricao = descricao;
        this.valor = valor;
        this.datacadastro = datacadastro;
        this.ativo = ativo;
    }

    //Getters


    public Integer getCodigo() {
        return codigo;
    }

    public String getProduto() {
        return produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getValor() {
        return valor;
    }

    public LocalDate getDatacadastro() {
        return datacadastro;
    }

    public String getAtivo() {
        return ativo;
    }

    //Setters

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setDatacadastro(LocalDate datacadastro) {
        this.datacadastro = datacadastro;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
}
