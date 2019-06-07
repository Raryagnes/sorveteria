
package br.inatel.sorveteria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArquivoVendas {
    
    public ArquivoVendas() {
        try {
            FileOutputStream EstoqueProdutoVendas = new FileOutputStream("Vendas.txt", true);
            EstoqueProdutoVendas.close();
        } catch (Exception ex) {

        }
    }

    public void salvar(ArrayList<EstoqueProdutoVendas> array) {
        FileOutputStream fout;
        ObjectOutputStream out;
        try {
            fout = new FileOutputStream("Vendas.txt");
            out = new ObjectOutputStream(fout);

            out.writeObject(array);
            out.flush();

            out.close();
            fout.close();
            System.out.println("Salvo!");
        } catch (Exception ex) {

            ex.printStackTrace();
            System.out.println(ex);
        }
    }

    public ArrayList<EstoqueProdutoVendas> ler() {
        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<EstoqueProdutoVendas> vendas = new ArrayList<>();

        try {
            fin = new FileInputStream("Vendas.txt");
            in = new ObjectInputStream(fin);

            vendas= (ArrayList<EstoqueProdutoVendas>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return vendas;
    }
    
}
