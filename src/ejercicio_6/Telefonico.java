/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Maxi
 */
public class Telefonico {
     TreeMap<Integer, Cliente> client = new TreeMap<Integer, Cliente>();
    public void agregarCliente(int telefono, Cliente cliente) {
        
        if(client.put(telefono, cliente)==null){ // si hay lugar para put. agregar k,v ??
            System.out.println("Agregado con exito");
        }else{
        
            System.out.println("No se ha podido agregar cliente clave repetida");
        }
        
    }

    //buscar cliente por numero de telefono
    public Cliente buscarCliente(int telefono) {
        return client.get(telefono);
    }

    public Set<Integer> buscarTelefono(String apellido) {
        HashSet<Integer> telefonos = new HashSet<Integer>();//se crea un hashSet donde se guardan los telefono
        Set<Integer> tel = client.keySet();//en el Set "tel" estan todas las claves creadas
        Iterator it = tel.iterator();//con Iterador se recorre el Set "tel"
        while (it.hasNext()) {//mientras tenga un siguiente
            Integer telefono = (Integer)/*casteo*/ it.next();   //guardar un next telefono (key)
            Cliente c = client.get(telefono);//obtengo desde la clave "telefono" el  Cliente 
            if (c.getApellido().equals(apellido))//si el apellido ingresado es = a la persona que obtuve por telefono
            {
                telefonos.add(telefono);//lo guardo en hashSet telefonos
            }
        }
        return telefonos;
    }
    //buscar por ciudad

    public List<Cliente> buscarClienteS(String ciudad) {
        ArrayList<Cliente> clientess = new ArrayList<Cliente>();
        Set<Integer> tel1 = client.keySet();
        Iterator <Integer>it = tel1.iterator();
        while (it.hasNext()) {
            Integer telefono =  it.next();
            Cliente c = client.get(telefono);
            if (c.getCiudad().equals(ciudad)) {
                clientess.add(c);
            }
        }
        return clientess;
    }

    public void borrarCliente(long dni) {
        Integer telencontrado=null;
       Set <Integer>s = client.keySet();
        Iterator <Integer>it = s.iterator();
        while (it.hasNext()) {
            //En x tengo la clave del cliente actual.
            Integer x =  it.next();
            Cliente c = client.get(x);
            if (c.getDni() == (dni)) {
                telencontrado=x;
            }
        }
        if(telencontrado!=null){
        
            client.remove(telencontrado);
        }
    }

   
}


    

