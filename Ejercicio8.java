public class Ejercicio8 {
    public static void main (String[] args){
        char letra = 'A';
        char letra2 = 'n';
        char letra3 = 't';
        char letra4 = 'e';
        char letra5 = 's';
        String cadena = ""+letra+letra2+letra3+letra4+letra5;
        System.out.println(cadena);
    }
/*
 * El error que daba la suma de las variables char era un número entero
 * esto lo solucioné usando "" al inicio de la cadena
 */
}
