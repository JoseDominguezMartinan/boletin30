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
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol
{
    Integer id;
    String nombre;
    String apelidos;
    Integer edade; 

    public SeleccionFutbol()
    {
    }

    public SeleccionFutbol(Integer id,String nombre,String apelidos,Integer edade)
    {
        this.id = id;
        this.nombre = nombre;
        this.apelidos = apelidos;
        this.edade = edade;
    }

    @Override
    public abstract void concentrarse();

    @Override
    public void viajar()
    {
        System.out.println("viaxa a seleccion");
    }

    @Override
    public void entrenar()
    {
        System.out.println("entrena a seleccion");
    }

    @Override
    public void jugarPartido()
    {
        System.out.println("xoga a seleccion");
    }
}
