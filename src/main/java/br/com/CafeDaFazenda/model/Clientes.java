package br.com.CafeDaFazenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Clientes {

    @Entity
    @Table(name = "cliente")
    public class Cliente {

        @id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String nome;
        private String cpf;
        private String endereco;
        private String bairro;
        private String cidade;
        private String telefone;
        private String email;
        private Date dataNascimento;
        private BigDecimal saldo;
        private String senha;
        private String historico;
        private LocalDate dataCadastro;
        private Boolean ativo;


        //constructor

        public Cliente(int id, String nome, String cpf, String endereco, String bairro, String cidade, String telefone, String email, Date dataNascimento, BigDecimal saldo, String senha, String historico, LocalDate dataCadastro, Boolean ativo) {
            this.id = id;
            this.nome = nome;
            this.cpf = cpf;
            this.endereco = endereco;
            this.bairro = bairro;
            this.cidade = cidade;
            this.telefone = telefone;
            this.email = email;
            this.dataNascimento = dataNascimento;
            this.saldo = saldo;
            this.senha = senha;
            this.historico = historico;
            this.dataCadastro = dataCadastro;
            this.ativo = ativo;
        }


        //getter

        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public String getEndereco() {
            return endereco;
        }

        public String getBairro() {
            return bairro;
        }

        public String getCidade() {
            return cidade;
        }

        public String getTelefone() {
            return telefone;
        }

        public String getEmail() {
            return email;
        }

        public Date getDataNascimento() {
            return dataNascimento;
        }

        public BigDecimal getSaldo() {
            return saldo;
        }

        public String getSenha() {
            return senha;
        }

        public String getHistorico() {
            return historico;
        }

        public LocalDate getDataCadastro() {
            return dataCadastro;
        }

        public Boolean getAtivo() {
            return ativo;
        }


        //setter


        public void setId(int id) {
            this.id = id;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setDataNascimento(Date dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public void setSaldo(BigDecimal saldo) {
            this.saldo = saldo;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public void setHistorico(String historico) {
            this.historico = historico;
        }

        public void setDataCadastro(LocalDate dataCadastro) {
            this.dataCadastro = dataCadastro;
        }

        public void setAtivo(Boolean ativo) {
            this.ativo = ativo;
        }
    }
}
