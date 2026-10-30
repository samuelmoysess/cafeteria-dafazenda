package br.com.CafeDaFazenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.math.BigInteger;


@Entity
@Table(name = "catalogo")
public class Catalogo {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    private Integer codigo;
    private String produto;
    private String descricao;
    private String valor;
    private String datetime;
    private String ativo;


    //constructor


    public Catalogo(int id, Integer codigo, String produto, String descricao, String valor, String datetime, String ativo) {
        this.id = id;
        this.codigo = codigo;
        this.produto = produto;
        this.descricao = descricao;
        this.valor = valor;
        this.datetime = datetime;
        this.ativo = ativo;
    }

    //getter

    public int getId() {
        return id;
    }

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

    public String getDatetime() {
        return datetime;
    }

    public String getAtivo() {
        return ativo;
    }

    //setter

    public void setId(int id) {
        this.id = id;
    }

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

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
}
