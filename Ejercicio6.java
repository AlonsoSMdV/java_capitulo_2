public class Ejercicio6 {
    public static void main(String[] args){
        double base = 25.99;
        System.out.printf("Precio base %8.2f\n",base);
        System.out.printf("IVA         %8.2f\n",(base*0.21));
        System.out.printf("---------------------\n");
        System.out.printf("Total       %8.2f\n",(base*1.21));
    }
}
