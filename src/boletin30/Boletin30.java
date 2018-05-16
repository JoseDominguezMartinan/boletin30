/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

import java.util.ArrayList;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin30
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        ArrayList<SeleccionFutbol>seleccion=new ArrayList();
        SeleccionFutbol deGea=new Futbolista(1,"PT",1,"David","De Gea",26);
        SeleccionFutbol DelBosque=new Entrenador(1,0,"Vicente","Del Bosque",60);
        SeleccionFutbol  pedrito=new Masajista("fisioterapia",5,32,"Pedro","Fernandez",30);
        SeleccionFutbol Aragones=new Seleccionador(70,"Luis","Aragones",70);
        
        seleccion.add(deGea);
        seleccion.add(DelBosque);
        seleccion.add(pedrito);
        seleccion.add(Aragones);
        
        for(int i=0;i<seleccion.size();i++){
            System.out.println(seleccion.get(i).toString());
          
        }
        deGea.concentrarse();
        
        
      
        
        
    }
    
}
