package src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Organizacao {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Scanner input = new Scanner(System.in);
        Cliente cliente = new Cliente(null, null, null); //coloca o metodo adicionar cliente

        while (repeticaoMenu) {
            System.out.println("O que deseja fazer?");
            System.out.println("1: Cadastrar cliente");
            System.out.println("2: Cadastrar vendedor");
            System.out.println("3: Cadastrar venda");
            System.out.println("4: Listar clientes cadastrados");
            System.out.println("5: Listar vendedores cadastrados");
            System.out.println("6: Listar vendas cadastradas");
            System.out.println("7: Finalizar");
            String opcao = input.next();
            switch (opcao) {
                case "1":

                    cliente.cadastrar();
                break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    cliente.listar();
                    break;

            }
        }
        input.close();
    }
}