package model;

import java.util.Iterator;

public class Marcas implements Comparable<Marcas>{

    private int codigoMarca;
    private String descripcionMarcas;

    public Marcas() {
    }

    public Marcas(int codigoMarca, String descripcionMarcas) {
        super();
        this.codigoMarca = codigoMarca;
        this.descripcionMarcas = descripcionMarcas;
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getDescripcionMarcas() {
        return descripcionMarcas;
    }

    public void setDescripcionMarcas(String descripcionMarcas) {
        this.descripcionMarcas = descripcionMarcas;
    }

    @Override
    public int compareTo(Marcas m) {
        return this.codigoMarca - m.codigoMarca;
    }
}
