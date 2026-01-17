package raktar;

import raktar.model.Konzerv;
import raktar.model.Raktar;

import java.io.*;
import java.time.LocalDate;
import java.util.Collections;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Raktar raktar = new Raktar();
    raktar.add(new Konzerv("Tej", "Zalatej", LocalDate.of(2026, 12, 12)));
    raktar.add(new Konzerv("Pacalpörkölt", "PacaLaci Kft.", LocalDate.of(2030, 1, 1)));



    String fileName = "raktar.bin";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(raktar);
            System.out.println("Mentve");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            Raktar raktarVisszatolt = (Raktar) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}