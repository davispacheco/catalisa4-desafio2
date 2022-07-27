
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor extends Pessoa {
    Scanner scan = new Scanner(System.in);
    ArrayList<Vendedor> vendedoresCadastrados = new ArrayList<>();
    ArrayList<String> produtosVendidos = new ArrayList<>();
    Scanner input = new Scanner(System.in);


    public Vendedor(String nome, String cpf, String email, ArrayList produtosVendidos) {
        super(nome, cpf, email);
        this.vendedoresCadastrados = vendedoresCadastrados;

    }

    @Override
    public void cadastrar() {
        System.out.println("Qual o nome do vendedor?");
        String nomeVend = scan.next();
        System.out.println("Qual o CPF do vendedor?");
        String cpfVend = scan.next();
        System.out.println("Qual o email do vendedor (use o formato xxxx@xxxx.com");
        String emailVend = scan.next();
        Vendedor novoVendedor = new Vendedor(nomeVend, cpfVend, emailVend, null);

        if (emailVend.contains("@")) {
            boolean adicionar = true;

            if (vendedoresCadastrados.isEmpty()) {
                adicionar = false;
            } else {
                for (int i = 0; i < vendedoresCadastrados.size(); i++) {
                    if ((vendedoresCadastrados.get(i).getCpf().equals(cpfVend)) || (vendedoresCadastrados.get(i).getEmail().equals(emailVend))) {
                        System.out.println("Vendedor já cadastrado");
                     i = vendedoresCadastrados.size();
                }else {
                        adicionar = false;
                    }

            }}
            if (adicionar == false) {
                vendedoresCadastrados.add(novoVendedor);
                System.out.println("Vendedor adicionado");
            }
        } else {
                System.out.println("Email invalido");
            }
        }

    @Override
    public void listar() {
        System.out.println("____________________________________________");
        System.out.println("--> Vendedores cadastrados:" + vendedoresCadastrados.size());
        System.out.println("____________________________________________");

        for (int i = 0; i < vendedoresCadastrados.size(); i++) {
            System.out.println("                  VENDEDOR " +i +"          ");
            System.out.println("-> Nome do vendedor: " + vendedoresCadastrados.get(i).getNome());
            System.out.println("-> CPF do vendedor " + vendedoresCadastrados.get(i).getCpf());
            System.out.println("-> E-mail do vendedor: " + vendedoresCadastrados.get(i).getEmail());
            System.out.println("--------------------------------------------");

        }
    }

    public void listarVendasPorEmail() {
        System.out.println("Deseja ver as vendas de qual vendedor?");
        System.out.println("Digite o email:");
        String emailVendedor = input.next();
        int aprovadorDeEmail = 0;

        for (int i = 0; i < vendedoresCadastrados.size(); i++) {
            if (vendedoresCadastrados.get(i).getEmail().equals(emailVendedor)) {
                for (int j = 0; j < vendedoresCadastrados.get(i).produtosVendidos.size(); j++) {
                    System.out.println("Produto " +(j+1) +": " +vendedoresCadastrados.get(i).produtosVendidos.get(j));


                }
                aprovadorDeEmail++;
                break;
            }


        }if (aprovadorDeEmail != 1) {
            System.out.println("Vendedor não encontrado");
        }
    }
        public void vender (Cliente cliente) {

            if (vendedoresCadastrados.isEmpty() || cliente.getClientes().isEmpty()) {
                System.out.println("Você necessita adicionar primeiro os Clientes e Vendedores! ");
            } else {
                boolean compra = true;

                System.out.println("Qual vendedor realizou a venda? ");
                System.out.println("Vendedores cadastrados: ");
                listar();

                int vendedorEscolhido = input.nextInt();

                if ((vendedorEscolhido >= 0) && (vendedorEscolhido <= vendedoresCadastrados.size())) {
                    cliente.listar();
                    int clienteEscolhido = input.nextInt();

                    if (clienteEscolhido >= 0 && (clienteEscolhido <= cliente.getClientes().size())){

                        while (compra == true) {
                            System.out.println(" ");
                            System.out.println("Qual produto foi vendido? Segue as opções: ");
                            System.out.println("Digite 1 - Monitor");
                            System.out.println("Digite 2 - Notebbok");
                            System.out.println("Digite 3 - Mouse");
                            System.out.println("Digite 4 - Teclado");
                            System.out.println("Digite 5 - Fone");
                            System.out.println("Digite 6 - Desktop");
                            System.out.println("Digite 7 - Para encerrar a compra");;

                            int escolhaDoCliente = input.nextInt();

                            switch (escolhaDoCliente) {

                                case 1:
                                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Monitor, por R$ 600,00. Comprado no dia: " + LocalDateTime.now());
                                    break;

                                case 2:
                                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Notebook, por R$ 3.000,00. Comprado no dia: " + LocalDateTime.now());
                                    break;

                                case 3:
                                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Mouse, por R$ 50,00. Comprado no dia: " + LocalDateTime.now());
                                    break;

                                case 4:
                                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Teclado, por R$ 90,00. Comprado no dia: " + LocalDateTime.now());
                                    break;

                                case 5:
                                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Fone, por R$ 180,00. Comprado no dia: " + LocalDateTime.now());
                                    break;

                                case 6:
                                    vendedoresCadastrados.get(vendedorEscolhido).produtosVendidos.add("Desktop, por R$ 2.400,00. Comprado no dia: " + LocalDateTime.now());
                                    break;

                                case 7:
                                    compra = false;
                                    break;

                                default:
                                    System.out.println("Escolha inválida");
                            }
                        }

                    } else {
                        System.out.println("Escolha Inválida!");
                    }
                } else {
                    System.out.println("Escolha Inválida!");
                }
            }
        }

    }





