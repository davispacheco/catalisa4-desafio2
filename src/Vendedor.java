import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor extends Pessoa{

    ArrayList<Vendedor> vendedoresCadastrados = new ArrayList<>();
    ArrayList<String> produtosVendidos = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public Vendedor(String nome, String cpf, String email, ArrayList produtosVendidos) {
        super(nome, cpf, email);
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void listar() {

    }

    public void listarVendas(){
        System.out.println("Deseja ver as vendas de qual vendedor?");
        System.out.println("Digite o email:");
        String emailVendedor = input.next();
        System.out.println("Digite o CPF do cliente que deseja buscar: ");
        int aprovadorDeEmail = 0;
        for (int i = 0; i < vendedoresCadastrados.size(); i++) {
            if (vendedoresCadastrados.get(i).getCpf().equals(emailVendedor)) {
                System.out.println(vendedoresCadastrados.get(i).produtosVendidos);
                i = vendedoresCadastrados.size();
                aprovadorDeEmail++;
            }
        }
        if (aprovadorDeEmail != 1){
            System.out.println("Vendedor não encontrado");
        }
    }

    public void vender(){
        boolean compra = true;

        System.out.println("Qual vendedor realizou a venda? ");
        System.out.println("Vendedores cadastrados: ");

        for (int i = 0; i< vendedoresCadastrados.size(); i++) {
            System.out.println("Vendedor " + i + " - " + vendedoresCadastrados.get(i).getNome());
        }
        int vendedorEscolhido = input.nextInt();

        //escolha de clientes cadastrados

        while(compra == true){
            System.out.println("Qual produto foi vendido? Segue as opções: ");
            System.out.println("Digite 1 - Monitor");
            System.out.println("Digite 2 - Notebbok");
            System.out.println("Digite 3 - Mouse");
            System.out.println("Digite 4 - Teclado");
            System.out.println("Digite 5 - Fone");
            System.out.println("Digite 6 - Desktop");

            int escolhaDoCliente = input.nextInt();

            switch (escolhaDoCliente){

                case 1:
                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Monitor, por R$ 600,00. Comprado no dia: " + LocalDate.now());
                    break;

                case 2:
                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Notebook, por R$ 3.000,00. Comprado no dia: " + LocalDate.now());
                    break;

                case 3:
                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Mouse, por R$ 50,00. Comprado no dia: " + LocalDate.now());
                    break;

                case 4:
                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Teclado, por R$ 90,00. Comprado no dia: " + LocalDate.now());
                    break;

                case 5:
                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Fone, por R$ 180,00. Comprado no dia: " + LocalDate.now());
                    break;

                case 6:
                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Desktop, por R$ 2.400,00. Comprado no dia: " + LocalDate.now());
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
