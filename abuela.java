 public class Abuela {
    
    // El nombre de la abuela en cuestión
    private String nombreYaya;
    // La cantidad de tortillas que ha hecho en su vida
    private int numeroTortillasTotales;
    // Abuela, ¿Estás durmiendo?
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
            System.out.println("ERROR: No puede hacer tortillas si se está echando la siesta");
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
     * La abuela también se echa la siesta, pero también sirve para despertarla
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
     * También podemos saber si está durmiendo o no sin molestarla
     */
    public boolean getStatusSiestaYaya(){
        return haceSiestaAhora;
    }
    
    public void ImprimirDetalles(){
        System.out.println("Yaya en cuestión: " + nombreYaya + " | " + "Total de tortillas hechas: " + numeroTortillasTotales + " | " + "¿Está en plena siesta? " + haceSiestaAhora);
    }
}   
    