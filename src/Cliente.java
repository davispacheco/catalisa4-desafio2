
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<String> produtosComprados = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    public Cliente(String nome, String cpf, String email, ArrayList produtosComprados) {
        super(nome, cpf, email);

    }

    @Override
    public void cadastrar() {

        System.out.println("Qual o nome do cliente?");
        String novoNome = scan.next();
        System.out.println("Qual o CPF do cliente?");
        String novoCPF = scan.next();
        System.out.println("Qual o email do cliente (use o formato xxxx@xxxx.com) ");
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
                    if ((clientes.get(i).getCpf().equals(novoCPF)) || (clientes.get(i).getEmail().equals(novoEmail))) {
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
            System.out.println("_____________________________________________________");
            System.out.println("--> Clientes cadastrados:" + clientes.size());
            System.out.println("_____________________________________________________");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("");
            System.out.println("                   " +i +"                           ");
            System.out.println("-> Nome do cliente: " + clientes.get(i).getNome());
            System.out.println("-> CPF do cliente: " + clientes.get(i).getCpf());
            System.out.println("-> |E-mail do cliente: " + clientes.get(i).getEmail());
            System.out.println("-----------------------------------------------------");
            System.out.println("");
        }

    }
     public void buscarCompras(){
         System.out.println("Digite o CPF do cliente que deseja buscar: ");
         String pesquisaCPF = scan.next();
         int aprovadorDeCPF = 0;

         for (int i = 0; i < clientes.size(); i++) {
             if (clientes.get(i).getCpf().equals(pesquisaCPF)) {
                 for (int j = 0; j < clientes.get(i).produtosComprados.size(); j++) {
                     System.out.println("Produto " +(j+1) +": " +clientes.get(i).produtosComprados.get(j));

                     aprovadorDeCPF++;
                 }


             }
             }

         if (aprovadorDeCPF != 1){
             System.out.println("Cliente não encontrado");
         }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<String> getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(ArrayList<String> produtosComprados) {
        this.produtosComprados = produtosComprados;
    }
}
