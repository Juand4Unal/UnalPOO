public class ejercicio5 {
    public static void main(String[] args) {
        int SUMA = 0;
        int X = 20;
        SUMA = SUMA + X;
        int Y = 40;
        X = X + (int) Math.pow(Y, 2);
        SUMA = SUMA + X / Y;
        System.out.println("EL VALOR DE LA SUMA ES: " + SUMA);
    }
}
