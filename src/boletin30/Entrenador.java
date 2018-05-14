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
public class Entrenador extends SeleccionFutbol
{
    private Integer idFederacion;

    public Entrenador()
    {
    }

    public Entrenador(Integer idFederacion)
    {
        this.idFederacion = idFederacion;
    }

    public Entrenador(Integer idFederacion,Integer id,String nombre,String apelidos,Integer edade)
    {
        super(id,nombre,apelidos,edade);
        this.idFederacion = idFederacion;
    }


    public Integer getIdFederacion()
    {
        return idFederacion;
    }

    public void setIdFederacion(Integer idFederacion)
    {
        this.idFederacion = idFederacion;
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
        return "Entrenador{"+"idFederacion="+idFederacion+'}';
    }
    @Override
    public void concentrarse()
    {
        System.out.println("concentrase o entrenador ");
    }
    public void planificarEntrenamiento(){
        System.out.println("planifica o entrenamento");
    }
   
    
}
