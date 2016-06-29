/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsoap;

import apdist.soap.Hola;
import apdist.soap.HolaService;
import java.net.URL;
import javax.xml.namespace.QName;

public class ClientSoap {
      
    public static void main(String[] args) {
        try {
            HolaService service = new HolaService(
                new URL("http://localhost:8080/HolaService/Hola?WSDL"),
                new QName("http://soap.apdist/", "HolaService"));
            Hola port = service.getHolaPort();
            System.out.println(port.bienvenida("Pana"));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
