/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apdist;

import java.net.URL;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author dordonez
 */
public class SoapStatefulClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            AddService service = new AddService(
                new URL("http://localhost:8080/SoapStateful/AddService?WSDL"),
                new QName("http://apdist/", "AddService"));
            
            Add add1 = service.getAddPort();
            ((BindingProvider)add1).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true); 
            
            Add add2 = service.getAddPort();
            ((BindingProvider)add2).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true); 
            
            //Prueba método add
            System.out.println(add1.add(5));
            System.out.println(add2.add(8));
            System.out.println(add1.add(5));
            System.out.println(add2.add(8));
            
            //Prueba método addToLista
            List<String> lista;
            lista = add1.addToList("hola");
            System.out.println("Cliente add1:");
            for(String str : lista) {
                System.out.println(str);
            }
            System.out.println("Cliente add2:");
            lista = add2.addToList("diego");
            for(String str : lista) {
                System.out.println(str);
            }
            System.out.println("Cliente add1:");
            lista = add1.addToList("chao");
            for(String str : lista) {
                System.out.println(str);
            }
            System.out.println("Cliente add2:");
            lista = add2.addToList("vero");
            for(String str : lista) {
                System.out.println(str);
            }              
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
