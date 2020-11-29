/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.G2M2E1.redflix45;

import co.com.G2M2E1.redflix45.modelos.Serie;
import co.com.G2M2E1.redflix45.repositorios.SerieRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author ESLUNAP
 */

@Component
public class Example implements CommandLineRunner{
    
    @Autowired
    private SerieRepositorio serieRepositorio;
    
    @Override
    public void run(String... args) throws Exception {
       List <Serie> series =  serieRepositorio.findAll();
        for (Serie serie : series) {
            System.out.println(serie.getIdSerie()+" : "+serie.getTituloSerie());
            
        }
    }
    
}
