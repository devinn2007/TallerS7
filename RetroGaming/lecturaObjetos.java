
package RetroGaming;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class lecturaObjetos {
    private String nombreArchivo;
    private ObjectInputStream ofis;

    public lecturaObjetos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;

    }
    
    public inventario cargarLista(){
        
        inventario listaCargada = new inventario();
        try {
            ofis = new ObjectInputStream(new FileInputStream(nombreArchivo));
            listaCargada = (inventario) ofis.readObject();
            ofis.close();
        } catch (IOException | ClassNotFoundException e) {
        }
        return listaCargada;
    }
}
