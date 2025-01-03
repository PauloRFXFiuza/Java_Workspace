public class variaveis {
    public static void main(String[] args) {
        //Variáveis

        byte varByte = 127;                         //de -128 a 127
        short varShort = 32767;                     //de -32768 a 32767
        int varInt = 2147483647;                    //de -2147483648 a 2147483647
        long varLong = 100000L;                     //de −9223372036854775808 a 9223372036854775807
        float varFloat = 1.325E-2F;                 //de 1.4E-45 a 3.4028235E38
        double varDouble = 1.32546545446545E-15;    //de 4.9E-324 a 1.7976931348623157E308
        char varChar = 'a';                         //apenas um caracter entre aspas
        boolean varBoolean = true;                  //apenas true ou false (verdadeiro ou falso)       
        
        //Prints na Tela
        
        System.out.println(varByte);
        System.out.println(varShort);
        System.out.println(varInt);
        System.out.println(varLong);
        System.out.println(varFloat);
        System.out.println(varDouble);
        System.out.println(varChar);
        System.out.println(varBoolean);
        System.out.println("Valor minimo de long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de char: " + Character.MIN_VALUE);
        System.out.println("Valor maximo de char: " + Character.MAX_VALUE);
        System.out.println("Valor minimo de boolean: " + false);
        System.out.println("Valor maximo de boolean: " + true);
    }
    

}
