
package RetroGaming;

import java.io.Serializable;
import java.util.ArrayList;

public class inventario implements Serializable{
    private ArrayList<videojuego> inventario = new ArrayList<>();

    public inventario() {
    }
    
    public void agregarVideojuego(videojuego juego){
        inventario.add(juego);
    }
    
    public void listarInventario(){
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println(inventario.get(i));
        }
    }
    
    public void buscarPorPlataforma(String plataforma){
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getPlataforma().equals(plataforma)) {
                System.out.println(inventario.get(i));
            }
        }
    }
    
    public int getZize(){
        return inventario.size();
    }
    public videojuego getn(int i){
        return inventario.get(i);
    }
    
    
}
