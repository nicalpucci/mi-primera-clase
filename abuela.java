 public class Abuela {
    
    // El nombre de la abuela en cuesti�n
    private String nombreYaya;
    // La cantidad de tortillas que ha hecho en su vida
    private int numeroTortillasTotales;
    // Abuela, �Est�s durmiendo?
    private boolean haceSiestaAhora;
    
    /**
     * Constructor de la abuela
     */
    public Abuela(String yaya, int tortillasHechas, boolean siesta) {
        nombreYaya = yaya;
        numeroTortillasTotales = tortillasHechas;
        haceSiestaAhora = siesta;
    }
    
    /**
     * Para cambiar el nombre de la susodicha octogenaria
     */
    public String setName(String yaya){
        nombreYaya = yaya;
        return nombreYaya;
    }
    
    /**
     * Devuelve el nombre de nuestra abuelita
     */
    public String getName(){
        return nombreYaya;
    }
    
    /**
     * Abuela hazte una tortillica
     */
    public int hacerUnaTortilla(){
        int resultadoTortilla = numeroTortillasTotales;
        if(haceSiestaAhora == false){
            numeroTortillasTotales = numeroTortillasTotales + 1;
            resultadoTortilla = numeroTortillasTotales;
        }else{
            resultadoTortilla = -1;
            System.out.println("ERROR: No puede hacer tortillas si se est� echando la siesta");
        }
        return resultadoTortilla;
    }
    
    /**
     * Historial de tortillas 
     */
    public int getHistorialTortillas(){
        return numeroTortillasTotales;
    }
    
    /**
     * La abuela tambi�n se echa la siesta, pero tambi�n sirve para despertarla
     */    
    public boolean DormirODespertar(){
        if(haceSiestaAhora == false){
            haceSiestaAhora = true;
            return haceSiestaAhora;
        }else{
            haceSiestaAhora = false;
            return haceSiestaAhora;
        }        
    }
    
    /**
     * Tambi�n podemos saber si est� durmiendo o no sin molestarla
     */
    public boolean getStatusSiestaYaya(){
        return haceSiestaAhora;
    }
    
    public void ImprimirDetalles(){
        System.out.println("Yaya en cuesti�n: " + nombreYaya + " | " + "Total de tortillas hechas: " + numeroTortillasTotales + " | " + "�Est� en plena siesta? " + haceSiestaAhora);
    }
}   
    