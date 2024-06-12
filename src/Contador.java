import java.util.Scanner;
//import para a classe ParametrosInvalidosException em ../Parametros/ParametrosInvalidosException.java
import Parametros.ParametrosInvalidosException;
import Contar.Contar;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            Contar.contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
        }

    }
}