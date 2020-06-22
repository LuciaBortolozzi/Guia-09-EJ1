package controller;

import java.util.ArrayList;
import java.util.TreeSet;

import model.Marcas;
import model.Modelos;
import model.DAO.MarcasDAO;
import model.DAO.ModelosDAO;

public class Controlador {

    static TreeSet<Marcas> arrayMarcas = MarcasDAO.bajarMarcasTXT();
    static ArrayList<Modelos> arrayModelos = ModelosDAO.bajarModelosTXT(arrayMarcas);


    public static ArrayList<String> obtenerModelos() {

        ArrayList<String> modelosST = new ArrayList<String>();

        for (Modelos mod : arrayModelos) {

            modelosST.add(mod.getDescripcionModelo());

        }

        return modelosST;
    }
    
    public static ArrayList<Modelos> devolverModelos(){
    	
    	return arrayModelos;
    }
    
    public static Modelos buscarModelo(String modeloAuto) {
		
		for(Modelos mod : arrayModelos) {
			
			if(mod.getDescripcionModelo().equals(modeloAuto)) {
				
				return mod;
			}
		}
		
		return null;
	}

}
