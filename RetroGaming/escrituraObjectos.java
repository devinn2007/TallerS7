
package RetroGaming;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class escrituraObjectos {
    private String nombreArchivo;
    private inventario inventario1;

    public escrituraObjectos(String nombreArchivo, inventario inventario1) {
        this.nombreArchivo = nombreArchivo;
        this.inventario1 = inventario1;

    }

    
    public void escribirInventario(){
        try (ObjectOutputStream ofos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {

            ofos.writeObject(inventario1);
            
        } catch (IOException e) {

        }
    }
}
