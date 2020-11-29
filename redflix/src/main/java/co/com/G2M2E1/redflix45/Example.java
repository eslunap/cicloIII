/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.G2M2E1.redflix45;

import co.com.G2M2E1.redflix45.modelos.Pelicula;
import co.com.G2M2E1.redflix45.modelos.Serie;
import co.com.G2M2E1.redflix45.modelos.Usuario;
import co.com.G2M2E1.redflix45.repositorios.PeliculaRepositorio;
import co.com.G2M2E1.redflix45.repositorios.SerieRepositorio;
import co.com.G2M2E1.redflix45.repositorios.UsuarioRepositorio;
import java.util.List;
import java.util.Optional;
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
    
    @Autowired
    private PeliculaRepositorio peliculaRepositorio;
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio; 
    
    @Override
    public void run(String... args) throws Exception {
       
        System.out.println("-----------1. Crear un usuario-----------");
        try{
            Usuario u = new Usuario();
            u.setIdUsername("Sparrow");
            u.setNombreUsuario("Johnny");
            u.setApellidoUsuario("Depp");
            u.setCelularUsuario("3222247253");
            u.setEmailUsuario("sparrow@gmail.com");
            u.setPassword("password9");
            u.setFechaNacimiento("1990-06-19");
            usuarioRepositorio.save(u);
            System.out.println("Se registró exitosamente el usuario Sparrow");
        }catch(Exception e){
            System.out.println("Error al crear usuario");
        }
        
        System.out.println("-----------2. Crear una película-----------");
        try{
            Pelicula p = new Pelicula();
            p.setTituloPelicula("Guason");
            p.setResumen("Pelicula de suspenso basada en el personaje de DC Comics Joker que se remonta a los orígenes del personaje con profundo análisis social");
            p.setAnio(2019);
            p.setNombre_director("Todd Phillips");
            peliculaRepositorio.save(p);
            System.out.println("Se registró correctamente la película Guasón");
        }catch(Exception e){
            System.out.println("Error al crear película");
        }
        
        System.out.println("-----------3. Crear una serie-----------");
        try{
            Serie s = new Serie();
            s.setTituloSerie("DARK");
            s.setNumTemporadas(3);
            s.setNumEpisodios(26);
            serieRepositorio.save(s);
            System.out.println("Se registró correctamente la serie DARK");
        }catch(Exception e){
            System.out.println("Error al ingresar la serie");
        }
        
        System.out.println("-----------4. Buscar una serie que no se encuentre-----------");
        List<Serie> serieN = serieRepositorio.findByTituloSerie("Gambito Dama");
        if (!serieN.isEmpty()){
            for (Serie s : serieN) {
              System.out.println("Serie disponible: "+ s.getTituloSerie() + " consta de "+s.getNumEpisodios()+" episodios en "+s.getNumTemporadas()+" temporadas");
            }
        }else{
            System.out.println("La serie que busca no fue encontrada");
        }
        
        System.out.println("-----------5. Buscar la serie DARK-----------");
        List<Serie> serie = serieRepositorio.findByTituloSerie("DARK");
        if (!serie.isEmpty()){
            for (Serie s : serie) {
              System.out.println("Serie disponible: "+ s.getTituloSerie() + " consta de "+s.getNumEpisodios()+" episodios en "+s.getNumTemporadas()+" temporadas");
            }
        }else{
            System.out.println("La serie que busca no fue encontrada");
        }
        
        System.out.println("-----------6. Eliminar la película: Los Vengadores-----------");
        List <Pelicula> pelicula = peliculaRepositorio.findByTituloPelicula("Los Vengadores");
        if (!pelicula.isEmpty()){
            for (Pelicula p : pelicula) {
                 peliculaRepositorio.deleteById(p.getIdPelicula());
            }
            System.out.println("Se eliminó exitosamente la película Los Vengadores");
        }
        
        System.out.println("-----------7. Editar el usuario Johnny Depp a Jack Sparrow-----------");
        try{
            Usuario u = new Usuario();
            u.setIdUsername("Sparrow");
            u.setNombreUsuario("Jack");
            u.setApellidoUsuario("Sparrow");
            u.setCelularUsuario("3222247253");
            u.setEmailUsuario("sparrow@gmail.com");
            u.setPassword("password9");
            u.setFechaNacimiento("1990-06-19");
            usuarioRepositorio.save(u);
            System.out.println("Se actualizó correctamente el usuario Jack Sparrow");
        }catch(Exception e){
            System.out.println("Error al actualizar usuario");
        }
        
        System.out.println("-----------8. Crear un usuario que ya existe-----------");
        try{
            
            Optional <Usuario> usuarios =  usuarioRepositorio.findById("malopez");
            if (!usuarios.isEmpty()){
                System.out.println("Lo sentimos el usuario no se encuentra disponible");
            }else{
                Usuario u = new Usuario();
                u.setIdUsername("Sparrow");
                u.setNombreUsuario("Jack");
                u.setApellidoUsuario("Sparrow");
                u.setCelularUsuario("3222247253");
                u.setEmailUsuario("sparrow@gmail.com");
                u.setPassword("password9");
                u.setFechaNacimiento("1990-06-19");
                usuarioRepositorio.save(u);
                System.out.println("Se registró exitosamente el usuario: "+ u.getIdUsername());
            }
        }catch(Exception e){
            System.out.println("Error al actualizar usuario");
        }
        
        
    }
    
}
