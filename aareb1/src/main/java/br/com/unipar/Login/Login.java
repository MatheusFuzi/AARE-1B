package br.com.unipar.Login;

import java.util.Scanner;

public class Login {

    String name, user, password, confirmpassword;
    Integer id;

    void reading() {

        this.id = 10;
        System.out.println("\n");
        System.out.println("Cadastre o seu Login");
        System.out.printf("Digite seu nome:");
        Scanner read = new Scanner(System.in);
        this.name = read.nextLine();
        System.out.printf("Digite sua senha:");
        Scanner read1 = new Scanner(System.in);
        this.password = read1.nextLine();
        System.out.printf("Digite seu usuario:");
        Scanner read2 = new Scanner(System.in);
        this.user = read2.nextLine();
        System.out.printf("Confirme sua senha:");
        Scanner read3 = new Scanner(System.in);
        this.confirmpassword = read3.nextLine();
        confirm();
        System.out.printf("\n");
    }

    void confirm() {

        if (this.confirmpassword.equals(this.password)) { verify(); }else  
        System.err.println("Login nao cadastrado, senhas não conferem"); 
    }

    boolean verify() {
        if (this.name.length() < 10) { System.err.println("Nome menor que 10 letras");
            return false;}
        if (this.password.length() < 8) { System.err.println("Senha menor que 8 digitos: fraca");
            return false; } 
        if (this.password.equals(this.confirmpassword)) {
            System.out.println("login cadastrado com sucesso");
            System.out.println("Usuario: " + this.user);
            System.out.println("Nome: "+this.name);
            System.out.println("Senha: "+ this.password);
            return true;}       
        return false;
    }

    public static void main(String[] args) {
        Login user1 = new Login();
        Login user2 = new Login();
        Login user3 = new Login();
        user1.reading();
        user2.reading();
        user3.reading();
    }
}
