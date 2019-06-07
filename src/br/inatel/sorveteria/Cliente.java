/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.sorveteria;

import java.io.Serializable;

/**
 *
 * @author Raryagnes
 */
public class Cliente implements Serializable, Comparable<Cliente> {

    private String nome;
    private String endereço;
    private String bairro;
    private String telefone;
    private String celular;
    private String cidade;
    private String email;
    private String produto;
    private String cnpj;
    private String empresa;
    private String cpf;

    @Override
    public String toString() {
        return "nome: " + nome +  "Cpf: " + cpf+ "Endereço: " + endereço + " Bairro: " + bairro + " Cidade: " + cidade + "  Telefone: " + telefone + " Celular: " + celular + " E-mail: " + email + " Cnpj: " + cnpj + "Empresa: " + empresa;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int compareTo(Cliente t) {
        return nome.compareTo(t.getNome());
    }

}
