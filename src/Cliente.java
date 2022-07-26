package src;

import java.security.PrivateKey;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cliente extends Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private Set<Cliente> clientes = new HashSet<>();

    public Cliente() {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.clientes = clientes;
    }


    @Override
    public void cadastrar(Cliente cliente) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome do cliente?");
        Nome = scan.next();
        System.out.println("Qual o CPF do cliente?");
        cpf = scan.next();
        System.out.println("Qual o email do cliente (use o formato xxxx@xxxx.com");
        email = scan.next();
        this.clientes.add(this);

    }

    @Override
    public void listar() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes);
        }

    }

}
