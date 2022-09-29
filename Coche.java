public class Coche {
    private int puerta;

    public Coche(){
        puerta = 0;
    }

    public void incrementaPuerta(){
        this.puerta++;
    }

    public int obtenerPuerta(){
        return this.puerta;
    }
}
