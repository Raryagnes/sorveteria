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
public class EstoqueProdutoVendas implements Serializable, Comparable<EstoqueProdutoVendas> {

    private String sabor;
    private String lote;
    private String validade;
    private String preço;
    private String picole;
    private String massa;
    

    EstoqueProdutoVendas(){
    
    this.lote= lote+1;
    
    }
     @Override
    public String toString() {
        return "Sabor: " + sabor + " Preço: " + preço + " Validade: " + validade +" Lote: "+lote+"Massa: "+massa +" Picole: "+picole;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getPreço() {
        return preço;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }

    public String getPicole() {
        return picole;
    }

    public void setPicole(String picole) {
        this.picole = picole;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

   

   

    @Override
    public int compareTo(EstoqueProdutoVendas t) {
        return sabor.compareTo(t.getSabor());
    }

}
