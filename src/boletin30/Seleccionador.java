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

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApelidos()
    {
        return apelidos;
    }

    public void setApelidos(String apelidos)
    {
        this.apelidos = apelidos;
    }

    public Integer getEdade()
    {
        return edade;
    }

    public void setEdade(Integer edade)
    {
        this.edade = edade;
    }

    @Override
    public String toString()
    {
        return "Seleccionador "+nombre+" "+apelidos+" "+edade;
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
