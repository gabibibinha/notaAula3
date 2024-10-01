import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Programador programador = new Programador();

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String r;

        do{System.out.println("Digite 0 se for Programador e 1 se for Gerente");
            int opcao = scanner.nextInt();

            System.out.println("Digite o nome do Funcionario: ");
            funcionario.setNome(scanner2.nextLine());

            System.out.println("Digite o ano de nascimento: ");
            funcionario.setNascimento(scanner.nextInt());

            System.out.println("Digite o salario do Funcionario: ");
            funcionario.setSalario(scanner.nextDouble());


            switch(opcao){
                case(0):
                    programador.informarLinguagem();
                    break;

                case(1):
                    gerente.informarProjeto();
                    break;

            }

            System.out.println("Nome: "+funcionario.getNome());
            funcionario.calcularIdade();
            System.out.println("Idade: "+funcionario.getIdade());
            System.out.println("Salario: "+funcionario.getSalario());
            if(opcao==0){
                System.out.println("Linguagem: " + programador.getLinguagem());
            }else{
                System.out.println("Projeto "+ gerente.getProjeto());
            }

            System.out.println("Deseja cadastrar outro usuário, digite S");
            r = scanner.next();

        }while (r.equalsIgnoreCase("S"));

    }
}