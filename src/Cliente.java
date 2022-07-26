package src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cliente extends Pessoa{


    Scanner scan = new Scanner(System.in);
    private Set<Cliente> clientes = new HashSet<>();

    public Cliente(String nome, String cpf, String email) {

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
        for (int i = 0; i < clientes.size(); i++){
            System.out.println(clientes.toArray(i));
        }

    }

}
