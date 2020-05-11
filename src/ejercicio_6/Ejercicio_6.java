/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

/**
 *
 * @author Maxi
 */
public class Ejercicio_6 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       
        Telefonico tel=new Telefonico();
        Cliente c1=new Cliente("Juan", "Muñoz","San Luis ","Colon 58",10258963);
        Cliente c2=new Cliente("Laura", "Suarez","San Luis","Junin 458",4258741);
        Cliente c3=new Cliente("Maximiliano","Jofre","San Luis","Sucre 280",30157165);
        Cliente c4=new Cliente("Sergio", "Sosa","San Luis","La Madrid 833",8123654);
        Cliente c5=new Cliente("Oscar","Mora","San Luis","Ayacucho",16369789);
        tel.agregarCliente(4459875,c1);
        tel.agregarCliente(4478455,c2);
        tel.agregarCliente(4475698,c3);
        tel.agregarCliente(4456982,c4);
        tel.agregarCliente(4447895,c5);
        tel.agregarCliente(4477896,c2);

        System.out.println(tel.buscarTelefono("Sosa"));
        System.out.println(tel.buscarClienteS("San Luis"));
        System.out.println(tel.buscarCliente(234));
          
        System.out.println(tel.buscarCliente(999));
        tel.buscarClienteS("4458963");
        tel.borrarCliente(777);
        System.out.println(tel.buscarCliente(999));
    }

  }

