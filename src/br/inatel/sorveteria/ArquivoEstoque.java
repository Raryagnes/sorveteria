
package br.inatel.sorveteria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArquivoEstoque {
    public ArquivoEstoque() {
        try {
            FileOutputStream EstoqueProdutos = new FileOutputStream("Estoque.txt", true);
            EstoqueProdutos.close();
        } catch (Exception ex) {

        }
    }

    public void salvar(ArrayList<EstoqueProdutos> array) {
        FileOutputStream fout;
        ObjectOutputStream out;
        try {
            fout = new FileOutputStream("Estoque.txt");
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

    public ArrayList<EstoqueProdutos> ler() {
        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<EstoqueProdutos> estoque = new ArrayList<>();

        try {
            fin = new FileInputStream("Estoque.txt");
            in = new ObjectInputStream(fin);

            estoque= (ArrayList<EstoqueProdutos>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return estoque;
    }
    
}
