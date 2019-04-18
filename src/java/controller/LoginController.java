/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.HibernateUtil;
import model.Usuario;
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
public class LoginController {
    
    @RequestMapping(value = "login.htm",method=RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request){
        return new ModelAndView("login","command",new Usuario());
    }
    
    @RequestMapping(value = "login.htm",method = RequestMethod.POST)
    public String login(Usuario u){
        String resultado = "login";
        String query = "from Usuario where idUsuario = " + u.getIdUsuario()+" and passwordUsuario ="+u.getPasswordUsuario();
        System.out.println(query);
        try{
            Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
            sesion.beginTransaction();
            List login = sesion.createQuery(query).list();
            if(login.size()>=1){
                resultado = "inicio";
                System.out.println("Se fue pa: "+resultado);
            }else{
                resultado = "login";
                System.out.println("Se fue pa: "+resultado);
            }
            System.out.println(login);
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultado;
    }
}
