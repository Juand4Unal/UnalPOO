public class ejercicio12{
    public static void main(String[] args) {
        int salariobruto = 240000;
        double retencion = salariobruto * 0.125;
        double salarioneto = salariobruto - retencion;
        
        System.out.println("Salario bruto: " + salariobruto);
        System.out.println("Retencion: " + retencion);
        System.out.println("Salario neto: " + salarioneto);
    }
}
