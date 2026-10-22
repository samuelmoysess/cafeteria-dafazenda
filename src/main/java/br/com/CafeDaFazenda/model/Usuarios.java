package br.com.CafeDaFazenda.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name ="usuarios")
public class Usuarios {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public long id;

    private Integer resgistro;
    @Column (length = 80)
    private String nome;
    @Column (length = 40)
    private String email;
    @Column (length = 10)
    private String senha;
    @DateTimeFormat (style = "yyyy-mm-dd")
    private LocalDate dataAdmissao;
    private Boolean ativo;

    //Constructor
    public Usuarios() {

    }

    public Usuarios(long id, Integer resgistro, String senha, Boolean ativo, LocalDate dataAdmissao, String email, String nome) {
        this.id = id;
        this.resgistro = resgistro;
        this.senha = senha;
        this.ativo = ativo;
        this.dataAdmissao = dataAdmissao;
        this.email = email;
        this.nome = nome;
    }

    //Setters


    public void setId(long id) {
        this.id = id;
    }

    public void setResgistro(Integer resgistro) {
        this.resgistro = resgistro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }


    //Getters


    public long getId() {
        return id;
    }

    public Integer getResgistro() {
        return resgistro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}
