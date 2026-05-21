
package TiendaRetroGaming;

import RetroGaming.inventario;
import RetroGaming.videojuego;
import RetroGaming.escrituraObjectos;
import RetroGaming.lecturaObjetos;
import java.io.IOException;

public class Tienda1 {
    public static void main(String[] args) throws IOException {
        inventario inventarioJuegos = new inventario();
        String nombreArchivoInventario = "inventarioRetroGaming.txt";
        videojuego juego = new videojuego("Minecraft", "XBOX", 2011, 29.99);
        videojuego juego1 = new videojuego("PUG", "PC", 2012, 59.99);
        videojuego juego2 = new videojuego("GTA", "PS4", 2000, 19.99);
        
        inventarioJuegos.agregarVideojuego(juego);
        inventarioJuegos.agregarVideojuego(juego1);
        inventarioJuegos.agregarVideojuego(juego2);
        
        inventarioJuegos.listarInventario();
        
        escrituraObjectos escritura = new escrituraObjectos(nombreArchivoInventario, inventarioJuegos);
        escritura.escribirInventario();
        
        inventario juegosArchivo = new inventario();
        
        System.out.println("\nLectrura de Archivo\n");
        
        lecturaObjetos lectura = new lecturaObjetos(nombreArchivoInventario);
        
        juegosArchivo = lectura.cargarLista();
        
        juegosArchivo.listarInventario();
    }
}
