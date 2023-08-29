import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        int choice;
        
        do {
            System.out.println("Menu:");
            System.out.println("1 - Criar Funcionário");
            System.out.println("2 - Mostrar Folha de Pagamento");
            System.out.println("3 - Alterar remuneração");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Digite o crachá: ");
                    int cracha = scanner.nextInt();
                    funcionario.setCracha(cracha);
                    
                    System.out.print("Digite o nome: ");
                    scanner.nextLine(); // Consume the newline character
                    String nome = scanner.nextLine();
                    funcionario.setNome(nome);
                    
                    System.out.print("Digite o tipo de vínculo (H para horista, S para salário fixo): ");
                    char tipoVinculo = scanner.next().charAt(0);
                    funcionario.setTipoVinculo(tipoVinculo);
                    
                    if (tipoVinculo == 'H') {
                        System.out.print("Digite o valor da hora: ");
                        float valorHora = scanner.nextFloat();
                        funcionario.setValorHora(valorHora);
                        
                        System.out.print("Digite a quantidade de horas: ");
                        float qtdeHora = scanner.nextFloat();
                        funcionario.setQtdeHora(qtdeHora);
                    } else {
                        System.out.print("Digite o salário: ");
                        float salario = scanner.nextFloat();
                        funcionario.setSalario(salario);
                    }
                    
                    System.out.print("Digite o valor do desconto: ");
                    float valorDesconto = scanner.nextFloat();
                    funcionario.setValorDesconto(valorDesconto);
                    
                    break;
                    
                case 2:
                    System.out.println("\nFolha de Pagamento:\n" + funcionario.imprimir() + "\n");
                    break;
                    
                case 3:
                    if (funcionario.getTipoVinculo() == 'H') {
                        System.out.print("Digite o novo valor da hora: ");
                        float novoValorHora = scanner.nextFloat();
                        funcionario.setValorHora(novoValorHora);
                        
                        System.out.print("Digite a nova quantidade de horas: ");
                        float novaQtdeHora = scanner.nextFloat();
                        funcionario.setQtdeHora(novaQtdeHora);
                    } else {
                        System.out.print("Digite o novo salário: ");
                        float novoSalario = scanner.nextFloat();
                        funcionario.setSalario(novoSalario);
                    }
                    
                    System.out.print("Digite o novo valor do desconto: ");
                    float novoValorDesconto = scanner.nextFloat();
                    funcionario.setValorDesconto(novoValorDesconto);
                    
                    break;
                    
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        } while (choice != 4);
        
        scanner.close();
    }
}	

