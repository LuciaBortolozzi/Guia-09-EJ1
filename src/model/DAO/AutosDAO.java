package model.DAO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TreeSet;

import model.Autos;


public class AutosDAO {

  private static final String directorio = "C:\\\\Users\\\\Flor\\\\git\\\\GUIA9-EJ1\\\\src\\\\resources\\";

  //Actores.txt -> ("\n" + nombre + "/t"+ apellido + "/t" + sexo)
  public static ArrayList<Autos> bajarAutosTXT() {

      ArrayList<Autos> autos = new ArrayList<Autos>();
      try {
          File archivo = new File( directorio + "Autos.txt");
          if (archivo.exists()){
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

                  String patente = s.substring(0,8).toUpperCase();
                  int codigoMarca = Integer.parseInt(s.substring(8,13));
                  int codigoModelo = Integer.parseInt(s.substring(13,18));
                  int anio = Integer.parseInt(s.substring(18,22));
                  int mes = ((Integer.parseInt(s.substring(22,24)))-1);
                  int dia = Integer.parseInt(s.substring(24,26));
                  Calendar fechaPatentamiento = Calendar.getInstance();
                  fechaPatentamiento.set(Calendar.DAY_OF_MONTH, dia);
                  fechaPatentamiento.set(Calendar.MONTH, mes);
                  fechaPatentamiento.set(Calendar.YEAR, anio);
                  double precioCompra = Double.parseDouble(s.substring(26,36));
                  char tipoCombustible = s.substring(36,37).charAt(0);
                  boolean equipoMultimedia = Boolean.parseBoolean(s.substring(37,42));
                  boolean aireAcondicionado = Boolean.parseBoolean(s.substring(42,47));
                  boolean gps = Boolean.parseBoolean(s.substring(47,52));

                 // autos.add(new Autos(patente, fechaPatentamiento, precioCompra,tipoCombustible,equipoMultimedia, aireAcondicionado,gps  ));
              }

              leerArchivoAutos.close();
          }

      } catch (IOException e) {
          e.printStackTrace();
      }

      return autos;
  }
}