package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cliente extends Pessoa {


    Scanner scan = new Scanner(System.in);
    private Set<Cliente> clientes = new HashSet<>();
    private ArrayList<String> produtosComprados = new ArrayList<>();

    public Cliente(String nome, String cpf, String email) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
    }


    @Override
    public void cadastrar() {
        System.out.println("Qual o nome do cliente?");
        String novoNome = scan.next();
        System.out.println("Qual o CPF do cliente?");
        String novoCPF = scan.next();
        System.out.println("Qual o email do cliente (use o formato xxxx@xxxx.com");
        String novoEmail = scan.next();
        if (novoEmail.contains("@")) {
                    Cliente clientenovo = new Cliente(novoNome, novoCPF, novoEmail);
                    for (int i = 0 ; i <= clientes.size(); i++){
                    if (clientes.contains(clientenovo.getNome())){
                        System.out.println("Cliente ja existente");
                    }else {
                        clientes.add(clientenovo);
                        System.out.println("Cliente adicionado");
                        i = clientes.size() + 1;
                    }}
        }else{
            System.out.println("Email invalido");
        }
        System.out.println("_______________________________________________________________________");


        }


    @Override
    public void listar(){
        for (Cliente cliente : clientes) {
            System.out.println("CLiente: " +cliente.getNome());
        }

    }


}
