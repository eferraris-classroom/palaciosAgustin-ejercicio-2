package ar.edu.undef.fie;

import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        var par = 0;
        var impar = 0;

        for (int i = 0; i < args.length; i++) {
            Integer numero = Integer.parseInt(args[i]);
            if (numero %2 == 0) {
                par ++;
            }
            else {
                impar ++;
            }

        }
        System.out.println("par = " + par);
        System.out.println("impar = " + impar);
    }

    /* Otra forma:
    var odd = 0;
    var even = 0;

    for (var arg:args)
        if(isOdd(Integer.parseInt(arg))){
            odd++;
        } else {
            even++;
        }

    private static boolean isOdd (int number){
        return % 2 == 0:
    }
     */
}