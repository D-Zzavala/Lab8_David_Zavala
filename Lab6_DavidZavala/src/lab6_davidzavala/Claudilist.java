package lab6_davidzavala;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Claudilist {

    private String Nombre;
    private ArrayList<Show> Shows;

    public Claudilist() {
    }

    public Claudilist(String Nombre, ArrayList<Show> Shows) {
        this.Nombre = Nombre;
        this.Shows = Shows;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Show> getShows() {
        return Shows;
    }

    public void setShows(ArrayList<Show> Shows) {
        this.Shows = Shows;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Shows: " + Shows;
    }

    public void ReadFileScanner(File TFile, Claudilist Clau) {
        File archivo = null;
        Scanner sc = null;
        try {
            archivo = new File("./Files/.txt");
            sc = new Scanner(archivo);
            while (sc.hasNext()) {
                String next = sc.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en el Reader.");
        }
        sc.close();
    }

    public void WriteFile(Claudilist Clau) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./Files/" + Clau.getNombre() + ".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < Clau.getShows().size(); i++) {
                bw.write(Clau.getShows().get(i) + "/");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en el Writer.");
        }
    }

}
