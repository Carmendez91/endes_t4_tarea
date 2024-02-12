import java.util.ArrayList;
/**
 * La clase Auto representa un coche estandar con unas propiedades básicas comunes
 * y unos métodos para acceder y modificar esas propiedades.
 *
 * @author Carmen
 * @version 1.0
 * @since 2024-02-05
 */

public class Auto {
    /**
     * Atributos de la clase Auto, marca y modelo, ambos de tipo String y privados.
     */
    private String marca;

    private String modelo;


    /**
     * Se crea una nuevo constructor de Auto, con las propiedades especificadas.
     * @param marca :la marca del vehiculo.
     * @param modelo :el modelo del vehiculo.
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Metodo para obtener la marca del vehiculo
     * @return :devuelve la marca del vehiculo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establecer la marca del vehiculo.
     * @param marca :marca del vehiculo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para obtener el modelo del vehiculo.
     * @return :devuelve el modelo del vehiculo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *  Establecer el modelo del vehiculo.
     * @param modelo :modelo del vehiculo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devolver una cadena de texto, esta representa al objeto auto
     * @return :devuelve cadena de texto con la marca y el modelo del vehiculo.
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}


