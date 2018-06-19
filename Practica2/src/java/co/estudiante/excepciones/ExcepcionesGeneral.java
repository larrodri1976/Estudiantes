/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.estudiante.excepciones;

/**
 *
 * @author SENA
 */
public class ExcepcionesGeneral extends RuntimeException{
    
    public ExcepcionesGeneral(){
        this("Ocurrio una excepcion");
    }
    public ExcepcionesGeneral(String mensaje){
        super(mensaje);
    }
}
