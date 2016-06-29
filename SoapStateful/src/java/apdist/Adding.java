/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apdist;

import com.sun.xml.ws.developer.servlet.HttpSessionScope;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author dordonez
 */

@HttpSessionScope
@WebService (serviceName = "AddService", 
        name = "Add", 
        portName = "AddPort", 
        targetNamespace = "http://apdist/")
public class Adding {
    private int x = 0;
    private List<String> lista = new ArrayList<>();
    
    public int add(int x) {
        return this.x += x;
    }
    
    public List<String> addToList(String str) {
        lista.add(str.toUpperCase());
        return lista;
    }
    
}
