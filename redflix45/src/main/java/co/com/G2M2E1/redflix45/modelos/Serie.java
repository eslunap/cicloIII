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
@Table(name = "serie")
public class Serie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_serie")
    private Long idSerie;
    
    @Column (name="titulo_serie")
    private String tituloSerie;
    
    @Column (name="num_episodios")
    private int numEpisodios;
    
    @Column (name="num_temporadas")
    private int numTemporadas;

    public Long getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Long idSerie) {
        this.idSerie = idSerie;
    }

    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public int getNumEpisodios() {
        return numEpisodios;
    }

    public void setNumEpisodios(int numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    @Override
    public String toString() {
        return "Serie{" + "idSerie=" + idSerie + ", tituloSerie=" + tituloSerie + ", numEpisodios=" + numEpisodios + ", numTemporadas=" + numTemporadas + '}';
    }   
}
