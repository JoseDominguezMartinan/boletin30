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
public class Masajista extends SeleccionFutbol
{
  private String titulacion;
  private Integer anosExperiencia;  

    public Masajista()
    {
    }

    public Masajista(String titulacion,Integer anosExperiencia)
    {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public Masajista(String titulacion,Integer anosExperiencia,Integer id,String nombre,String apelidos,Integer edade)
    {
        super(id,nombre,apelidos,edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

  
    public String getTitulacion()
    {
        return titulacion;
    }

    public void setTitulacion(String titulacion)
    {
        this.titulacion = titulacion;
    }

    public Integer getAnosExperiencia()
    {
        return anosExperiencia;
    }

    public void setAnosExperiencia(Integer anosExperiencia)
    {
        this.anosExperiencia = anosExperiencia;
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
        return "Masajista{"+"titulacion="+titulacion+", anosExperiencia="+anosExperiencia+'}';
    }
  
  

    @Override
    public void concentrarse()
    {
        System.out.println("concentrase o masaxista");
    }
    public void darMasaxe(){
        System.out.println("da masaxes o masaxista");
    }
}
