package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Scanner input = new Scanner(System.in);
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
                    Cliente cliente = new Cliente();
            }
        }
        input.close();

    }
}
