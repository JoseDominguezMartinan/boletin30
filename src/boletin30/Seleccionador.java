/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author jdominguezmartinan
 */
public class Seleccionador extends SeleccionFutbol
{

    public Seleccionador()
    {
    }

    public Seleccionador(Integer id,String nombre,String apelidos,Integer edade)
    {
        super(id,nombre,apelidos,edade);
    }

    @Override
    public void concentrarse()
    {
        System.out.println("concentrase o seleccionador");
    }
    public void seleccionXogador(){
        System.out.println("o seleccionador selecciona xogadores");
    }
    
}
