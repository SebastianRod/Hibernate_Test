/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author juan.b.rodriguez
 */
@Controller
@RequestMapping("venta.htm")
public class FacturaController {

    @RequestMapping( method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1){
        ModelAndView mav = new ModelAndView("venta");
        String out = "Spring + hibernate";
        try{
            Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
            sesion.beginTransaction();
            List factura = sesion.createQuery("from Factura").list();
            mav.addObject("factura", factura);
            sesion.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }
        mav.addObject("mensaje", out);
        return mav;
    }
    /*
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("factura");
        return mav;
    }*/
    
}
