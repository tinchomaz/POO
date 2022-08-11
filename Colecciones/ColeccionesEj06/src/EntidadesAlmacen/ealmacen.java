/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesAlmacen;

import java.util.Objects;

/**
 *
 * @author serus
 */
public class ealmacen {
    
    
    String articulo;
    Integer precio;
    int stock;

    public ealmacen() {
    }

    public ealmacen(String articulo, int precio, int stock) {
        this.articulo = articulo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.articulo);
        hash = 23 * hash + this.precio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ealmacen other = (ealmacen) obj;
        if (this.precio != other.precio) {
            return false;
        }
        if (!Objects.equals(this.articulo, other.articulo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ealmacen{" + "articulo=" + articulo + ", precio= $ " + precio + ", stock=" + stock + '}';
    }
    
    
    
    
    
    
}
