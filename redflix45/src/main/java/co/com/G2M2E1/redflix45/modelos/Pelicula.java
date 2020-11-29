/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.G2M2E1.redflix45.modelos;

import java.time.Year;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    @Column (name ="id_pelicula")
    private Long idPelicula;
    
    @Column (name ="titulo_pelicula")
    private Long tituloPelicula;
    
    @Column (name ="resumen")
    private String resumen;
    
    @Column (name ="anio")
    private Year anio;
    
    @Column (name ="nombre_director")
    private String nombre_director;
    
}
