import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor extends Pessoa{

    ArrayList<Vendedor> vendedoresCadastrados = new ArrayList<>();
    ArrayList<String> produtosVendidos = new ArrayList<>();

    public Vendedor(String nome, String cpf, String email, ArrayList produtosVendidos) {
        super(nome, cpf, email);
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void listar() {

    }

    public void vender(){            // O cliente compra

        Scanner input = new Scanner(System.in);

        boolean compra = true;


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
                    produtosVendidos.add("Monitor, por R$ 600,00. Comprado no dia: " + LocalDate.now());
                    break;

                case 2:
                    produtosVendidos.add("Notebook, por R$ 3.000,00. Comprado no dia: " + LocalDate.now());
                    break;

                case 3:
                    produtosVendidos.add("Mouse, por R$ 50,00. Comprado no dia: " + LocalDate.now());
                    break;

                case 4:
                    produtosVendidos.add("Teclado, por R$ 90,00. Comprado no dia: " + LocalDate.now());
                    break;

                case 5:
                    produtosVendidos.add("Fone, por R$ 180,00. Comprado no dia: " + LocalDate.now());
                    break;

                case 6:
                    produtosVendidos.add("Desktop, por R$ 2.400,00. Comprado no dia: " + LocalDate.now());
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
