/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.G2M2E1.redflix45.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ESLUNAP
 */

@Entity
@Table (name ="pelicula")
public class Pelicula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="id_pelicula")
    private Long idPelicula;
    
    @Column (name ="titulo_pelicula")
    private String tituloPelicula;
    
    @Column (name ="resumen")
    private String resumen;
    
    @Column (name ="anio")
    private int anio;
    
    @Column (name ="nombre_director")
    private String nombreDirector;

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre_director() {
        return nombreDirector;
    }

    public void setNombre_director(String nombre_director) {
        this.nombreDirector = nombre_director;
    }

    @Override
    public String toString() {
        return  "Titulo Pelicula: " + tituloPelicula + "\n resumen: " + resumen + ", año: " + anio+"\n";
    }   
}
