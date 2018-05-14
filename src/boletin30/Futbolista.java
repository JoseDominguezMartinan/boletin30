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
public class Futbolista extends SeleccionFutbol
{
   private Integer dorsal;
   private String demarcacion;

    public Futbolista()
    {
    }

    public Futbolista(Integer dorsal,String demarcacion)
    {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(Integer dorsal,String demarcacion,Integer id,String nombre,String apelidos,Integer edade)
    {
        super(id,nombre,apelidos,edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    

    public Integer getDorsal()
    {
        return dorsal;
    }

    public void setDorsal(Integer dorsal)
    {
        this.dorsal = dorsal;
    }

    public String getDemarcacion()
    {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion)
    {
        this.demarcacion = demarcacion;
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
        return "Futbolista{"+"dorsal="+dorsal+", demarcacion="+demarcacion+'}';
    }
   
   
   
   public void entrevista(){
       System.out.println("entrevistase o xogador");
   }

    @Override
    public void concentrarse()
    {
        System.out.println("concentrase o xogador ");
    }
}
