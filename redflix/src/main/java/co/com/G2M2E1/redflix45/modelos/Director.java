/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.G2M2E1.redflix45.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ESLUNAP
 */

@Entity
@Table(name = "director")
public class Director {
    
@Id
@Column(name="id_director")
private Long idDirector;

@Column (name="nombre_director")
private String nombreDirector;

@Column (name="apellido_director")
private String apellidoDirector;

@Column(name="nacionalidad_director")
private String nacionalidadDirector;

    public Long getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(Long idDirector) {
        this.idDirector = idDirector;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public String getApellidoDirector() {
        return apellidoDirector;
    }

    public void setApellidoDirector(String apellidoDirector) {
        this.apellidoDirector = apellidoDirector;
    }

    public String getNacionalidadDirector() {
        return nacionalidadDirector;
    }

    public void setNacionalidadDirector(String nacionalidadDirector) {
        this.nacionalidadDirector = nacionalidadDirector;
    }

    @Override
    public String toString() {
        return "Director{" + "idDirector=" + idDirector + ", nombreDirector=" + nombreDirector + ", apellidoDirector=" + apellidoDirector + ", nacionalidadDirector=" + nacionalidadDirector + '}';
    }



}
