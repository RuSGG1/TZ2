package TZ;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("Калькулятор");

    Scanner scanner = new Scanner(System.in);
    String Instring = scanner.nextLine();


    StringAnalyzer StringAnalyzer = new StringAnalyzer(Instring);


    String  operationSignNew = StringAnalyzer.getOperationSign();
    String firstOperandNew = StringAnalyzer.getfirstOperand();
    String  secondStringOperandNew = StringAnalyzer.getsecondStringOperand();
    int secondIntegerOperandNew =StringAnalyzer.getsecondIntegerOperand();

        Calculate Calculate = new Calculate();
        String  resultat = Calculate.calculator(operationSignNew,firstOperandNew,secondStringOperandNew,secondIntegerOperandNew);

        if (resultat.length() > 40){
        System.out.println(resultat.substring(0, 41) + "...\"");
        }
        else{
            System.out.println(resultat);
        }
    }









}
