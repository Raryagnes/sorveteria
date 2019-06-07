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
public class EstoqueProdutos implements Serializable, Comparable<EstoqueProdutos> {

    private String nome;
    private String quantidade;
    private String validade;
    private String lote;

    

    @Override
    public String toString() {
        return "nome: " + nome + " Quantidade: " + quantidade + " Validade: " + validade +" Lote: "+lote;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public int compareTo(EstoqueProdutos t) {

        return nome.compareTo(t.getNome());
    }

}
