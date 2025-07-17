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
public class Inventario {
    private Productos [] Inventario;
    private String nombreSuper;
    private String codigoSuper;
    private String nombreEmpleado;
    private String cedulaEmpleado;
    
    public Inventario() {
      this.nombreSuper = "Super Chino"; 
        this.codigoSuper = "001";
        this.nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        this.cedulaEmpleado = JOptionPane.showInputDialog("Ingrese la cedula del empleado:");
        
        int cantidadTotal = Integer.parseInt(JOptionPane.showInputDialog("Cuantos tipos de productos va a ingresar?"));
        this.Inventario = new Productos[cantidadTotal];
}
    
public void agregarProductos() {
        for (int i = 0; i < Inventario.length; i++) {
            JOptionPane.showMessageDialog(null, "Ingresando Producto #" + (i + 1));
            
            String codigo = JOptionPane.showInputDialog("Codigo del producto:");
            String nombre = JOptionPane.showInputDialog("Nombre del producto:");
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a ingresar:"));
            double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Precio base del producto:"));
            String tipo = JOptionPane.showInputDialog("Tipo (Alimentos, Bebidas, Higiene, Limpieza):");

            
            Inventario[i] = new Productos(codigo, nombre, cantidad, precioBase, tipo);
        }
    }
    
     public void mostrarInventario() {
        StringBuilder reporte = new StringBuilder(" Inventario Agregado por el empleado " + this.nombreEmpleado + " \n\n");
        for (Productos producto : Inventario) {
            reporte.append(producto.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, reporte.toString());
    }
    
  
    public void mostrarGananciaTotal() {
        double gananciaTotal = 0;
        for (Productos producto : Inventario) {
            gananciaTotal += producto.getGanancia;
        }
        JOptionPane.showMessageDialog(null, "La ganancia total esperada de todos los productos es: " + gananciaTotal);
    }
    
    public void iniciar() {
        agregarProductos();
        mostrarInventario(); 
        mostrarGananciaTotal();
    }
}

   
    
}

