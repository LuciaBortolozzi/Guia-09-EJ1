package model.DAO;

import java.io.*;
import java.util.*;


import model.Autos;
import model.Modelos;

public class AutosDAO {

//    private static final String directorio = "C:\\\\Users\\\\Flor\\\\git\\\\Guia-09-EJ1\\\\src\\\\resources\\";
    private static final String directorio = "D:\\\\IdeaProjects\\\\Guia-09-EJ1\\\\src\\\\resources\\";

    public static ArrayList<Autos> bajarAutosTXT(ArrayList<Modelos> modelo) {

        ArrayList<Autos> auto = new ArrayList<Autos>();
        try {
            File archivo = new File(directorio + "Autos.txt");
            if (archivo.exists()) {
                Scanner leerArchivoAutos = new Scanner(archivo);
                ArrayList<String> autosST = new ArrayList<String>();

                //Guardar contenido en String
                while (leerArchivoAutos.hasNext()) {
                    String lineaActual = leerArchivoAutos.nextLine();
                    autosST.add(lineaActual);
                }

                // Guardar objetos
                int i = 0;
                for (String s : autosST) {
                    auto.add(new Autos());
                    auto.get(i).setPatente(s.substring(0, 10).trim().toUpperCase());

                    int anio = Integer.parseInt(s.substring(20, 24).trim());
                    auto.get(i).setAnioPatentamiento(anio);

                    auto.get(i).setPrecioCompra(Double.parseDouble(s.substring(24, 34).trim()));

                    auto.get(i).setTipoCombustible(s.substring(34, 35).trim().charAt(0));

                    auto.get(i).setEquipoMultimedia(Boolean.parseBoolean(s.substring(35, 40).trim()));

                    auto.get(i).setAireAcondicionado(Boolean.parseBoolean(s.substring(40, 45).trim()));

                    auto.get(i).setGps(Boolean.parseBoolean(s.substring(45, 50).trim()));

                    int codigoMarca = Integer.parseInt(s.substring(10, 15).trim());
                    int codigoModelo = Integer.parseInt(s.substring(15, 20).trim());
                    agregarModeloMarca(auto, modelo, codigoMarca, codigoModelo, i);
                    i++;
                }

                leerArchivoAutos.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return auto;
    }


    public static void agregarModeloMarca(ArrayList<Autos> auto, ArrayList<Modelos> modelo, int codigoMarca, int codigoModelo, int i) {

        for (Modelos m : modelo) {

            if (codigoModelo == m.getCodigoModelo() && codigoMarca == m.getMarcas().getCodigoMarca()) {

                auto.get(i).setModelos(m);
                break;
            }
        }

    }

    public static void grabarAutosTXT(Autos auto) {

        try {
            FileWriter fichero = new FileWriter(directorio + "Autos.txt", true);

            PrintWriter archivoSalida = new PrintWriter(fichero);

            archivoSalida.println(String.format("%9s", auto.getPatente()) +
                    String.format("%6s", auto.getModelos().getMarcas().getCodigoMarca()) +
                    String.format("%5s", auto.getModelos().getCodigoModelo()) +
                    String.format("%4s", auto.getAnioPatentamiento()) +
                    String.format("%10s", auto.getPrecioCompra()) +
                    String.format("%1s", auto.getTipoCombustible()) +
                    String.format("%5s", auto.isEquipoMultimedia()) +
                    String.format("%5s", auto.isAireAcondicionado()) +
                    String.format("%5s", auto.isGps())
            );

            archivoSalida.close();

        } catch (IOException e3) {
            System.out.println("No se puede grabar el archivo de Autos.txt");
        }
    }
}