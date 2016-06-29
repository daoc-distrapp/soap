
package apdist.soap;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author dordonez
 */

@Stateless
@WebService(serviceName = "HolaService", 
        name = "Hola", 
        portName = "HolaPort", 
        targetNamespace = "http://soap.apdist/")
public class HolaEjb {
    
    /**
     * operación ofrecida por el servicio
     */
    public String bienvenida(String nombre) {
        return "Hola " + nombre + " !";
    }
    
}
