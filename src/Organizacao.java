import java.util.Scanner;
public class Organizacao {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Cliente cliente = new Cliente(); //Instancia o objeto inicial da classe Cliente
        Vendedor vendedor = new Vendedor(null, null, null, null); //Instancia o objeto inicial da classe Vendedor
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("");
            System.out.println("O que deseja fazer?");
            System.out.println("1: Cadastrar cliente");
            System.out.println("2: Cadastrar vendedor");
            System.out.println("3: Cadastrar venda");
            System.out.println("4: Listar clientes cadastrados");
            System.out.println("5: Listar vendedores cadastrados");
            System.out.println("6: Listar vendas cadastradas");
            System.out.println("7: Pesquisar compras de um cliente");
            System.out.println("8: Pesquisar vendas de um vendedor");
            System.out.println("9: Finalizar");
            String opcao = input.next();
            switch (opcao) {
                case "1":
                    cliente.cadastrar(); // Invoca o método da classe Cliente
                    break;
                case "2":
                    vendedor.cadastrar(); // Cadastrar vendedor
                    break;
                case "3":
                    vendedor.vender(cliente); // Invoca o método vender da classe Vendedor
                    break;
                case "4":
                    cliente.listar(); // Invoca o método listar da classe Cliente
                    break;
                case "5":
                    vendedor.listar(); //Invoca o método listar da classe Vendedor
                    break;
                case "6":
                    vendedor.vendasTotais();
                    break;
                case "7":
                    cliente.buscarCompras(); //Pesquisar compras do cliente
                    break;
                case "8":
                    vendedor.listarVendasPorEmail(); //Pesquisar vendas do vendedor
                    break;
                case "9":
                    System.out.println("Fim do programa!");
                    repeticaoMenu = false; // Encerra o laço de repetição
                    break;

                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }
        input.close();


    }
}
