public class actividad214 {
    public static void main(String[] args) {
        double vd1 = 4200000;
        double vd2 = 250000;
        double vd3 = 3300000;
        double salar = 380320;
        double totven = vd1 + vd2 + vd3;
        double porven = 0.33 * totven;
        double salar1, salar2, salar3;

        if (vd1 > porven) {
            salar1 = salar + 0.2 * salar;
        } else {
            salar1 = salar;
        }

        if (vd2 > porven) {
            salar2 = salar + 0.2 * salar;
        } else {
            salar2 = salar;
        }

        if (vd3 > porven) {
            salar3 = salar + 0.2 * salar;
        } else {
            salar3 = salar;
        }

        System.out.println("SALARIO VENDEDORES DEPTO. 1: " + salar1 + " SALARIO VENDEDORES DEPTO. 2: " + salar2 + " SALARIO VENDEDORES DEPTO. 3: " + salar3);
    }
}