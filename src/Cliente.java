import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<String> produtosComprados = new ArrayList<>();

    public Cliente(String nome, String cpf, String email,ArrayList produtosComprados) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.produtosComprados = produtosComprados;
    }

    @Override
    public void cadastrar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome do cliente?");
        String novoNome = scan.next();
        System.out.println("Qual o CPF do cliente?");
        String novoCPF = scan.next();
        System.out.println("Qual o email do cliente (use o formato xxxx@xxxx.com");
        String novoEmail = scan.next();
        Cliente clientenovo = new Cliente(novoNome, novoCPF, novoEmail, null);
        if (novoEmail.contains("@")) {
            boolean adicionar = true;

            if (clientes.isEmpty()) {
                clientes.add(clientenovo);
                System.out.println("Cliente adicionado");
                adicionar = false;
            } else {
                for (int i = 0; i < clientes.size(); i++) {
                    if ((clientes.get(i).getNome().equals(novoNome)) || (clientes.get(i).getCpf().equals(novoCPF)) || (clientes.get(i).getEmail().equals(novoEmail))) {
                        System.out.println("Dados ja existentes");
                        adicionar = false;
                        i = clientes.size();
                    }
                }
            }
            if (adicionar == true) {
                clientes.add(clientenovo);
                System.out.println("Cliente adicionado");
            }
        } else {
            System.out.println("Email invalido");
        }


    }

    @Override
    public void listar() {
        System.out.println("");
            System.out.println("__________________________________________");
            System.out.println("|Clientes cadastrados:" + clientes.size()    +"                  |");
        for (Cliente cliente : clientes) {
            System.out.println("|Nome do cliente:" + cliente.getNome()  +"                       |");
            System.out.println("|CPF do cliente" + cliente.getCpf()   +"                         |");
            System.out.println("|E-mail do cliente:" + cliente.getEmail() +"                     |");
            System.out.println("------------------------------------------");
            System.out.println("");
        }

    }

    @Override
    public void vender(){            // O cliente compra
        System.out.println("");
    }
}
