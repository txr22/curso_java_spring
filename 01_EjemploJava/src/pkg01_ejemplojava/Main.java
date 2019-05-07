
package pkg01_ejemplojava;

public class Main {

    
    public static void main(String[] args) {

    Tucan miTucan = new Tucan();
    miTucan.longuitud = 20.5f;
        System.out.println("Medida del tucan " +miTucan.longuitud);
        
        Tucan otroPajaro = null;
        
    otroPajaro = new Tucan();
    otroPajaro.longuitud = 30.6f;
    
        System.out.println(miTucan.longuitud +"--> " +otroPajaro.longuitud);
    
        miTucan.piar();
        
        Tucan nuevoTuc = new Tucan();
              
        System.out.println(nuevoTuc.longuitud);
    }
    
}
