package model;
// Generated Mar 5, 2019 12:39:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int idCliente;
     private String tipoDocumentoCliente;
     private String nombresCliente;
     private String apellidosCliente;
     private int telefonoCliente;
     private String correoCliente;
     private String direccionCliente;
     private Set<Factura> facturas = new HashSet<Factura>(0);

    public Cliente() {
    }

	
    public Cliente(int idCliente, String tipoDocumentoCliente, String nombresCliente, String apellidosCliente, int telefonoCliente, String correoCliente, String direccionCliente) {
        this.idCliente = idCliente;
        this.tipoDocumentoCliente = tipoDocumentoCliente;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
        this.direccionCliente = direccionCliente;
    }
    public Cliente(int idCliente, String tipoDocumentoCliente, String nombresCliente, String apellidosCliente, int telefonoCliente, String correoCliente, String direccionCliente, Set<Factura> facturas) {
       this.idCliente = idCliente;
       this.tipoDocumentoCliente = tipoDocumentoCliente;
       this.nombresCliente = nombresCliente;
       this.apellidosCliente = apellidosCliente;
       this.telefonoCliente = telefonoCliente;
       this.correoCliente = correoCliente;
       this.direccionCliente = direccionCliente;
       this.facturas = facturas;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getTipoDocumentoCliente() {
        return this.tipoDocumentoCliente;
    }
    
    public void setTipoDocumentoCliente(String tipoDocumentoCliente) {
        this.tipoDocumentoCliente = tipoDocumentoCliente;
    }
    public String getNombresCliente() {
        return this.nombresCliente;
    }
    
    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }
    public String getApellidosCliente() {
        return this.apellidosCliente;
    }
    
    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }
    public int getTelefonoCliente() {
        return this.telefonoCliente;
    }
    
    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    public String getCorreoCliente() {
        return this.correoCliente;
    }
    
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }
    public String getDireccionCliente() {
        return this.direccionCliente;
    }
    
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    public Set<Factura> getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set<Factura> facturas) {
        this.facturas = facturas;
    }




}

