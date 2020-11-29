/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.G2M2E1.redflix45.modelos;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

/**
 *
 * @author ESLUNAP
 */

@Entity
@Table (name ="registro_transmisiones")
public class Transmision {
   
    @Id
    @GeneratedValue
    @Column(name = "id_transmision")
    private Long idTransmision;
    
    @Column (name = "titulo_contenido")
    private String tituloContenido;
    
    @Column (name = "fecha_hora")
    private Date fechaHora;
     
    @ManyToOne
    @JoinColumn (name = "id_username")
    private Usuario usernameId;

    public Long getIdTransmision() {
        return idTransmision;
    }

    public void setIdTransmision(Long idTransmision) {
        this.idTransmision = idTransmision;
    }

    public String getTituloContenido() {
        return tituloContenido;
    }

    public void setTituloContenido(String tituloContenido) {
        this.tituloContenido = tituloContenido;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Usuario getUsernameId() {
        return usernameId;
    }

    public void setUsernameId(Usuario usernameId) {
        this.usernameId = usernameId;
    }

    @Override
    public String toString() {
        return "Transmision{" + "idTransmision=" + idTransmision + ", tituloContenido=" + tituloContenido + ", fechaHora=" + fechaHora + ", usernameId=" + usernameId + '}';
    }    
    
}
