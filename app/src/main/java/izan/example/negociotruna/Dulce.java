package izan.example.negociotruna;

public class Dulce {
    private String nombre;
    private String urlImagen;
    private double precio;

    // Constructor sin argumentos requerido por Firebase
    public Dulce() {
    }

    public Dulce(String nombre, double precio, String urlImagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.urlImagen = urlImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    @Override
    public String toString() {
        return nombre + " " + precio + " " + urlImagen;
    }
}