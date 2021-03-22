

/**
 *
 * @author CUELLAR
 */
package ConceptosBasicos;

import java.awt.Color;


public class ConceptosBasicos {

    
    public static void main(String[] args) {
        
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        //Tarea: Programar los objetos miAcura y miMustang
        //Acura NSX
        
        Automovil miAcura = new Automovil();
        miAcura.setMarca("Acura (Honda)");
        miAcura.setSubMarca("Supercarro (NSX)");
        miAcura.setModelo(2020);
        miAcura.setColor(Color.yellow);
        System.out.println(miAcura);
        
        //Mustang Shelby
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford Motor Company");
        miMustang.setSubMarca("Carro deportivo (Mustang Shelby)");
        miMustang.setModelo(1980);
        miMustang.setColor(Color.red);
        System.out.println(miMustang);
        
    }
    
}
