/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import java.lang.reflect.Array;

public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*El constructor debe tener parametros*/
        /*Podes creae un constructor pasando nombre,apellido y domicilio*/
        Persona p = new Persona("Mauro Martin","Neme Toll","Salta 789");
        /*Podes crear otro usando el dni nomas*/
        Persona b = new Persona(123456);       
        p.Saludar();
    }
    
}
