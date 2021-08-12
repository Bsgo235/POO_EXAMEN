/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

/**
 *
 * @author ADMIN
 */
public class empleado {
    private String sueldo_bruto;

    public empleado() {
    }

    public empleado(String sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public String getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(String sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
