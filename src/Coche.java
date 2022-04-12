public class Coche {
    //Atributos
    //variable numérica que almacene el número de puertas que tiene
    public int puertas;

    //Constructor
    public Coche(int puertas) {
        this.puertas = puertas;
    }
    public Coche() {
    }

    //Metodos
    public static void main(String[] args) throws Exception {
       
        int puertas=1;
    
        Coche miCoche = new Coche();
       
       //Mostrar el número de puertas que tiene el objeto
       System.out.println(Coche.incrementarPuertas( puertas)); 
       
    }
    //función que incrementa el número de puertas que tiene el coche
    public static int incrementarPuertas(int puertas){
        int incremento= puertas++;
        return puertas;       
    }
}
