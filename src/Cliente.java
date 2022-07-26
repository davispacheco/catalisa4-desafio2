package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cliente extends Pessoa{


    Scanner scan = new Scanner(System.in);
    private Set<Cliente> clientes = new HashSet<>();
    private ArrayList<String> produtosComprados = new HashSet<>();

    public Cliente(String nome, String cpf, String email) {
    this.setNome(nome);
    this.setCpf(cpf);
    this.setEmail(email);
    }


    @Override
    public void cadastrar(){
        System.out.println("Qual o nome do cliente?");
        String novoNome = scan.next();
        System.out.println("Qual o CPF do cliente?");
        String novoCPF = scan.next();
        System.out.println("Qual o email do cliente (use o formato xxxx@xxxx.com");
        String novoEmail = scan.next();

        Cliente novoCliente = new Cliente(novoNome, novoCPF, novoEmail);
        clientes.add(novoCliente);

    }
    @Override
    public void listar(){
        for (Cliente cliente : clientes) {
            System.out.println("CLiente: " +cliente.getNome());
        }

    }


}
