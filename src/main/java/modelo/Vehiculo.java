package modelo;

/**
 *
 * @author Jorge Fuentes
 * @author Fernanda Jara
 * @author Javier Torres
 * @author Miriam Zambrano
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String patente;
    private String color;
    private String anio;
    private int kilometraje;
    private int precio;

    public Vehiculo() {
    }
    
    public Vehiculo(String marca, String modelo, String patente, String color, String anio, int kilometraje, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.color = color;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
