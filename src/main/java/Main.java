import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            boolean loop = true;

            while (loop) {
                Scanner text = new Scanner(System.in);
                System.out.println("********** Calculadora **********");

                System.out.println("**** Menú de Operaciones ****");
                System.out.println("+ (Suma)");
                System.out.println("- (Resta)");
                System.out.println("* (Multiplicación)");
                System.out.println("/ (División)");
                System.out.println("x (Salir)");

                System.out.println("Escoga una operación a realizar: ");
                String operador = text.nextLine();

                String[] validOps = {"+", "-", "*", "/", "x"};

                if (Arrays.asList(validOps).contains(operador)) {

                    if (operador.equals("x")) {
                        System.out.println("Programa finalizado.");
                        loop = false;
                        break;
                    } else {
                        System.out.println("Ingrese el primer número: ");
                        int firstNumber = text.nextInt();

                        System.out.println("Ingrese el segundo número: ");
                        int secondNumber = text.nextInt();

                        switch (operador) {
                            case "+":
                                System.out.println(firstNumber + secondNumber);
                                break;
                            case "-":
                                System.out.println(firstNumber - secondNumber);
                                break;
                            case "*":
                                System.out.println(firstNumber * secondNumber);
                                break;
                            case "/":
                                if (secondNumber != 0) {
                                    System.out.println(firstNumber / secondNumber);
                                } else {
                                    System.out.println("No es posible dividir por cero");
                                }
                                break;
                        }
                    }
                } else {
                    System.out.println("Debe escoger una operación valida a realizar...");
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }


    }
}
