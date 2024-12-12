package br.com.fantonio.mongo_ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.util.Scanner;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args)  {
        SpringApplication.run(RestServiceApplication.class, args);

        // Usa o ClassLoader para obter o InputStream do arquivo
        InputStream inputStream = RestServiceApplication.class.getClassLoader().getResourceAsStream("ascii/fantonio.txt");
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