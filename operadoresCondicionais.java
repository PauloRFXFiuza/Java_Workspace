public class operadoresCondicionais {
    public static void main(String[] args) {
        long num1 = 1L;
        long num2 = 2L;

        System.out.println("____________________________________________________________________");
        System.out.println("Primeiro numero = " + num1 + " , Segundo numero = " + num2);
        if (num1 == num2) {
            System.out.println("Primeiro numero = Segundo numero ");
        } else if (num1 >= num2) {
            System.out.println("Primeiro numero >= Segundo numero ");
        } else {
            System.out.println("Primeiro numero < Segundo numero ");
        }
        System.out.println("____________________________________________________________________");

    }
}
