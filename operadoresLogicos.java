public class operadoresLogicos {
    public static void main(String[] args) {
        boolean V = true;
        boolean F = false;
        // operador "E (and)" = && ; "OU (or)" = || ; "NÃO (not)" = !
        System.out.println("__________________________");
        System.out.println("V = " + V);
        System.out.println("F = " + F);
        System.out.printf("V E F = %S", V && F);
        System.out.println("");
        System.out.printf("V OU F = %S", V || F);
        System.out.println("");
        System.out.printf("NAO V = %S", !V);
        System.out.println("");
        System.out.printf("NAO F = %S", !F);
    }
}
