
package RetroGaming;

import java.io.Serializable;

public class videojuego implements Serializable{
    private String titulo;
    private String plataforma;
    private int anioLanzamiento;
    private double precio;

    public videojuego(String titulo, String plataforma, int anioLanzamiento, double precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.anioLanzamiento = anioLanzamiento;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "Titulo: "+ titulo
                + "\nPlataforma: "+ plataforma
                + "\nAno Lanzamiento: "+ anioLanzamiento
                + "\nPrecio: " + precio;
    }
    public String mostrarInfromacion(){
        return "Titulo: "+ titulo
                + "\nPlataforma: "+ plataforma
                + "\nAno Lanzamiento: "+ anioLanzamiento
                + "\nPrecio: " + precio;
    }
}
