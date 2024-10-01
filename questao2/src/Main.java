//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Tobe", "Golden", "caminha", "late");
        Gato gato = new Gato("Marielle", "Tricolor", "caminha", "mia");

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Informações do Cachorro:");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Locomoção: " + cachorro.getLocomocao());
        System.out.println("Late: " + cachorro.getLate());
        System.out.println("-----------------------------------");
        System.out.println("Informações do Gato:");
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Raça: " + gato.getRaca());
        System.out.println("Locomoção: " + gato.getLocomocao());
        System.out.println("Mia: " + gato.getMia());






    }


}