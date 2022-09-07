package lista01.questao01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.next();
        p.setNome(nome);

        System.out.print("Informe sua indentidade: ");
        int id = sc.nextInt();
        p.setId(id);
        
        System.out.println(p);

        sc.close();
        
    }
}
