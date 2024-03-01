import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Por favor, digite la edad de Juan: ");
        int edadJuan = scanner.nextInt();
        
        int edadAlberto = (int) (edadJuan * 2.0 / 3.0);
        int edadAna = (int) (edadJuan * 4.0 / 3.0);
        int edadMama = edadAlberto + edadAna + edadJuan;
        
        System.out.println("LAS EDADES SON: ALBERTO: " + edadAlberto + " JUAN: " + edadJuan + " ANA: " + edadAna + " MAMA: " + edadMama);
        
        scanner.close();
    }
}