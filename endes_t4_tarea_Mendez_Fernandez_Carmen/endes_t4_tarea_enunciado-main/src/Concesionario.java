import java.util.ArrayList;

/**
 * La clase concesionario representa a un concesionario estandar que contiene un listado de autos
 * y unos metodos para añadir y mostrar esos vehiculos.
 *
 * @author Carmen
 * @version 1.0
 * @since 2024-02-05
 */
public class Concesionario {

    /**
     * Atributo privado de la clase concesionario, arraylist de tipo Auto.
     */
    private ArrayList<Auto> autos;

    /**
     * Se crea un nuevo constructor de Concesionario, y el arraylist de tipo Auto.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Metodo para añadir vehiculos, agregandolos al arraylist.
     * @param auto :el auto a añadir..
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Metodo para devolver vehiculos, retornando el listado.
     * @return :el listado de autos.
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Metodo para imprimir los autos
     * Se usa un bucle for each para recorrer el listado de autos e imprimirlos por pantalla.
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}

