/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Factura;
import model.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
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

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) {
        String id = hsr.getParameter("id");
        System.out.println("sin convertir " + id);
        Integer idFactura = Integer.parseInt(id);
        System.out.println("convertido: " + idFactura);
        ModelAndView mav = new ModelAndView("detalleVenta");
        try {
            Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
            sesion.beginTransaction();
            String query = "select f.idFactura, f.fechaFactura, f.valorFactura from Factura f, Cliente c where f.cliente = c.idCliente and f.idFactura="+idFactura;
            List factura = sesion.createQuery(query).list();
            System.out.println("tamaño lista: " +factura.size());
            System.out.println("valor: "+factura.toString());
            for (int i = 0; i < factura.size();i++) {
                System.out.println(factura.get(i));
            }
            System.out.println("Se supone que salio..");
            mav.addObject("factura", factura);
            sesion.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }
}
