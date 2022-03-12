/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author CARLOSANTONIO
 */
public class Producto {
    private String nombredelproducto;
    private String tipodelproducto;
    private String Cantidaddelproducto;
    private String nombredelproveedor;
    private String Sucursal;     

    public Producto(String nombredelproducto, String tipodelproducto, String Cantidaddelproducto, String nombredelproveedor, String Sucursal) {
        this.nombredelproducto = nombredelproducto;
        this.tipodelproducto = tipodelproducto;
        this.Cantidaddelproducto = Cantidaddelproducto;
        this.nombredelproveedor = nombredelproveedor;
        this.Sucursal = Sucursal;
    }

    public String getNombredelproducto() {
        return nombredelproducto;
    }

    public void setNombredelproducto(String nombredelproducto) {
        this.nombredelproducto = nombredelproducto;
    }

    public String getTipodelproducto() {
        return tipodelproducto;
    }

    public void setTipodelproducto(String tipodelproducto) {
        this.tipodelproducto = tipodelproducto;
    }

    public String getCantidaddelproducto() {
        return Cantidaddelproducto;
    }

    public void setCantidaddelproducto(String Cantidaddelproducto) {
        this.Cantidaddelproducto = Cantidaddelproducto;
    }

    public String getNombredelproveedor() {
        return nombredelproveedor;
    }

    public void setNombredelproveedor(String nombredelproveedor) {
        this.nombredelproveedor = nombredelproveedor;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    

    
    /**
     * @param args the command line arguments
     */
    
    
}
