/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

import javax.swing.JOptionPane;

/**
 *
 * @author arjol
 */
public class Productos {
    //Atributos
   
    private int codigoProducto;
    private int cantidadProductos;
    private String tiposProductos;
    //private String productos;   
    private double precioBruto;
    private double precioBase;
    private double ganancia;   
//Constructores
    public Productos(String nombreProducto, String tiposProductos, int codigoProducto, double precioBruto, String tipo) {
       
        this.codigoProducto = codigoProducto;
        this.cantidadProductos = cantidadProductos;
        this.tiposProductos = tiposProductos;
        this.precioBruto = calcularPrecioBruto();
        this.precioBase = precioBase;
        this.ganancia = (this.precioBase+ this.precioBruto)*this.cantidadProductos;
    }

   
    private void preguntartiposProductos(){
        this.tiposProductos=JOptionPane.showInputDialog("Ingrese el tipo de prodcuto");
    }
    
private double calcularPrecioBruto(){
    double precioBruto=0;
    
    switch (tiposProductos){
        case "Alimentos" -> precioBruto= this.precioBase*0.20+this.precioBase;
        case "Bebidas" -> precioBruto=this.precioBase*0.30+this.precioBase;
        case "Higiene" -> precioBruto= this.precioBase*0.25+this.precioBase+500;
        case "Limpieza" -> precioBruto= this.precioBase*0.19+this.precioBase*0.4+1000+this.precioBase;
    }
            return  precioBruto;     
    }
           public void inciar(){
               preguntartiposProductos();
               calcularPrecioBruto();
           }         

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
           
           
}

    


    
    
    

