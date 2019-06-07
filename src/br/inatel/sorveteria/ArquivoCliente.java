package br.inatel.sorveteria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArquivoCliente {

    public ArquivoCliente() {
        try {
            FileOutputStream cliente = new FileOutputStream("Cliente.txt", true);
            cliente.close();
        } catch (Exception ex) {

        }
    }

    public void salvar(ArrayList<Cliente> array) {
        FileOutputStream fout;
        ObjectOutputStream out;
        try {
            fout = new FileOutputStream("Cliente.txt");
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

    public ArrayList<Cliente> ler() {
        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Cliente> cliente = new ArrayList<>();

        try {
            fin = new FileInputStream("Cliente.txt");
            in = new ObjectInputStream(fin);

            cliente = (ArrayList<Cliente>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return cliente;
    }

}
