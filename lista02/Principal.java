package lista02;

import java.util.Scanner;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.print("Inrforme seu nome: ");
        String nome = sc.next();
        p.setNome(nome);
        System.out.print("Informe o Apartamento: ");
        /*a função setApt recebe um parametro
         * do tipo inteiro. Pode-se parçar como
         * argumento a função de leitura lendo 
         * um tipo de inteiro e armazenando no
         * atributo da função.
         */
        p.setApt(sc.nextInt());
        
        System.out.println("Informe númeor da placa:");
        String placa = sc.next();
        
        Carro c = new Carro(placa,p);
        
        System.out.println(c);
        sc.close();
        
    }
}