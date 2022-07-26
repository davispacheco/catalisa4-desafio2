package src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cliente extends Pessoa{

    private String nome;
    private String cpf;
    private String email;

    Scanner scan = new Scanner(System.in);
    private Set<Cliente> clientes = new HashSet<>();
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }


    @Override
    public void cadastrar(Organizacao organizacao){
        System.out.println("Qual o nome do cliente?");
        String novoNome = scan.next();





    }
    @Override
    public void listar(Organizacao organizacao){

    }

}
