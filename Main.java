public class Main {
    public static void main(String[]args) {
        int resultado = suma(1,2,3);
        System.out.println("resultado de la suma " + resultado);

        Coche coche = new Coche();
        coche.incrementaPuerta();
        System.out.println("El coche tiene " + coche.obtenerPuerta() + " puerta(s)");

    }

    public static int suma(int num1,int num2,int num3){
        return  num1 + num2 + num3;
    }
}

