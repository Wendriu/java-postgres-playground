package com.example;

import java.util.Scanner;


//Exercicios front beginners
public class AppExer {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        AppExer app = new AppExer();
        app.ConverteIdade3();


    }

    //Exe 1
    public void RetornaAntecessor(){
        System.out.println("Digite um número:" );
        int n = scanner.nextInt();
        System.out.println("o antecessor é: " + (n - 1));
    }

    //Exe 2
    public void CalculaArea(){
        System.out.println("Digite o tamanho da Base:" );
        double base = scanner.nextDouble();
        System.out.println("Digite o tamanho da Altura:" );
        double altura = scanner.nextDouble();
        System.out.println("A área é: " + (base * altura));
    }

    //Exe 3
    public void ConverteIdade3(){
        System.out.println("Digite sua idade em Anos:" );
        double ano = scanner.nextDouble();
        System.out.println("Digite sua idade em Meses:" );
        double mes = scanner.nextDouble();
        System.out.println("Digite sua idade em Dias:" );
        double dia = scanner.nextDouble();
        System.out.println("Sua idade em dias é: " + ((ano*365) + (mes * 30) + dia));
    }


}
