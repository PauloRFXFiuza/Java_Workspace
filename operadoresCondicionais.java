public class operadoresCondicionais {
    public static void main(String[] args) {
        long num1 = 1L;
        long num2 = 2L;
        String mesDoAno = "Dezembro";

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
        System.out.println("Mes do Ano Vigente = " + mesDoAno);
        //o break serve para encerrar o programa caso a condição já for obedecida sem precisar rodar o resto do programa
        switch (mesDoAno){
            case ("Janeiro") -> System.out.println("Estamos no 1o Mes do Ano ");
            case ("Fevereiro") -> System.out.println("Estamos no 2o Mes do Ano ");
            case ("Marco") -> System.out.println("Estamos no 3o Mes do Ano ");
            case ("Abril") -> System.out.println("Estamos no 4o Mes do Ano ");
            case ("Maio") -> System.out.println("Estamos no 5o Mes do Ano ");
            case ("Junho") -> System.out.println("Estamos no 6o Mes do Ano ");
            case ("Julho") -> System.out.println("Estamos no 7o Mes do Ano ");
            case ("Agosto") -> System.out.println("Estamos no 8o Mes do Ano ");
            case ("Setembro") -> System.out.println("Estamos no 9o Mes do Ano ");
            case ("Outubro") -> System.out.println("Estamos no 10o e Antepenultimo Mes do Ano ");
            case ("Novembro") -> System.out.println("Estamos no 11o e Penultimo Mes do Ano ");
            case ("Dezembro") -> System.out.println("Estamos no 12o e Ultimo Mes do Ano ");
            default -> System.out.println("O Mes em Questao Esta Digitado Errado ou Nao Existe");
        }
    }
}
