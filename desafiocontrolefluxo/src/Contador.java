import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número do primeiro parâmetro: ");
        int num1 = in.nextInt();

        System.out.println("Digite o número do segundo parâmetro: ");
        int num2 = in.nextInt();

        try{
            contar(num1, num2);
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException{
        if(p1 > p2){
            throw new ParametrosInvalidosException();
        }
        else{
            for(int i = p1; i <= p2; i++){
                System.out.println("Imprimindo número " + i);
            }
        }
    }
}
