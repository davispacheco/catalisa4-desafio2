import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<String> produtosComprados = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    public Cliente(String nome, String cpf, String email,ArrayList produtosComprados) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.produtosComprados = produtosComprados;
    }

    @Override
    public void cadastrar() {

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
            System.out.println("____________________________________________");
            System.out.println("--> Clientes cadastrados:" + clientes.size());
            System.out.println("____________________________________________");
        for (Cliente cliente : clientes) {
            System.out.println("");
            System.out.println("-> Nome do cliente: " + cliente.getNome());
            System.out.println("-> CPF do cliente: " + cliente.getCpf());
            System.out.println("-> |E-mail do cliente: " + cliente.getEmail());
            System.out.println("--------------------------------------------");
            System.out.println("");
        }

    }
     public void buscarCompras(){
         System.out.println("Digite o CPF do cliente que deseja buscar: ");
         String pesquisaCPF = scan.next();
         int aprovadorDeCPF = 0;
         for (int i = 0; i < clientes.size(); i++) {
             if (clientes.get(i).getCpf().equals(pesquisaCPF)) {
                 System.out.println(clientes.get(i).produtosComprados);
                 i = clientes.size();
                aprovadorDeCPF++;
             }
     }
         if (aprovadorDeCPF != 1){
             System.out.println("Cliente não encontrado");
         }
    }
    @Override
    public void vender(){            // O cliente compra

        Scanner input = new Scanner(System.in);

        boolean compra = true;

        while(compra == true){
            System.out.println("Qual produto deseja comprar? Segue as opções: ");
            System.out.println("Digite 1 - Monitor");
            System.out.println("Digite 2 - Notebbok");
            System.out.println("Digite 3 - Mouse");
            System.out.println("Digite 4 - Teclado");
            System.out.println("Digite 5 - Fone");
            System.out.println("Digite 6 - Desktop");

            int escolhaDoCliente = input.nextInt();

            switch (escolhaDoCliente){

                case 1:
                    compra.monitor;
                    break;

                case 2:
                    compra.notebook;
                    break;

                case 3:
                    compra.mouse;
                    break;

                case 4:
                    compra.teclado;
                    break;

                case 5:
                    compra.fone;
                    break;

                case 6:
                    compra.desktop;
                    break;

                case 7:
                    compra = false;
                    break;

                default:
                    System.out.println("Escolha inválida");
            }
        }
    }
}
