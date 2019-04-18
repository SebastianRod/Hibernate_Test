/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author juan.b.rodriguez
 */

@Controller
public class ClienteController {
    
    @RequestMapping(value = "cliente.htm",method = RequestMethod.GET)
    public ModelAndView cliente(HttpServletRequest request){
        return new ModelAndView("cliente","command",new Cliente());
    }
}
