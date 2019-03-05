/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author juan.b.rodriguez
 */
@Controller
@RequestMapping("detalleVenta.htm")
public class DetalleVentaController {
    @RequestMapping( method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1){
        ModelAndView mav = new ModelAndView("detalleVenta");
        
        return mav;
    }
}
