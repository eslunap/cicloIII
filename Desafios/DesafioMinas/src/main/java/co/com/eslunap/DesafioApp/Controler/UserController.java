/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.eslunap.DesafioApp.Controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ESLUNAP
 */

@RestController
@RequestMapping("/")
public class UserController {
    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "Hola Mundo";
    }
    
}
