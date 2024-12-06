package br.com.fantonio.main;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        // Usa o ClassLoader para obter o InputStream do arquivo
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("ascii/fantonio.txt");
        // Verifica se o arquivo foi encontrado
        if (inputStream == null) {
            System.out.println("Arquivo não encontrado.");
            return;
        }

        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println("\nFantonio Corporation - 2024");
    }
}