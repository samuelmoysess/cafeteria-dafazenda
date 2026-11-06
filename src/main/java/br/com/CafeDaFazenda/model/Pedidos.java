package br.com.CafeDaFazenda.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String produto;
    private String descricao;
    private String valor;
    private LocalDate datacadastro;
    private String ativo;

    public Pedidos() {
    }

    public Pedidos(Long codigo, String produto, String descricao,
                   String valor, LocalDate datacadastro, String ativo) {
        this.codigo = codigo;
        this.produto = produto;
        this.descricao = descricao;
        this.valor = valor;
        this.datacadastro = datacadastro;
        this.ativo = ativo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LocalDate getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(LocalDate datacadastro) {
        this.datacadastro = datacadastro;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
}