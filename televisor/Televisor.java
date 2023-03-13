package televisor;

import java.util.Scanner;

public class Televisor {

    // Atributos
    String nombre;
    String modelo;
    String marca;
    String pantalla;
    String adicional;
    String dimensiones;
    String smarttv;
    String peso;
    String garantia;

    public static void main(String[] args) {

        // Crear los objetos.
        //Instanciar la clase.
        Scanner ent = new Scanner(System.in);
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor();

        //Primer Objeto
        tv1.nombre = " Smart Tv Samsung UHD 4K - 43 ";
        tv1.modelo = " SAMTELHUDUN43AU7000PCZ ";
        tv1.dimensiones = " 96.90 cm * 62.68 cm ";
        tv1.marca = " Samsung ";
        tv1.pantalla = " 43 pulgadas. "
                + " Tecnologia: LED. "
                + " Color: PurColor. ";
        tv1.smarttv = " Procesador Crystal: 4K. "
                + " Sistema Operativo: Tizen. "
                + " Navegador Web. "
                + " Soporte para aplicaciones SmartThings. ";
        tv1.adicional = " Movil a Tv. "
                + " Replicacion de sonido. "
                + " Baja energia de bluetooth. "
                + " Wifi Direct. "
                + " Sonido del televisor al celular. ";
        tv1.garantia = " 1 año";

        System.out.println(" El nombre del televisor es : \n" + tv1.nombre);
        System.out.println(" El modelo del televisor es : \n" + tv1.modelo);
        System.out.println(" Las dimensiones del tv son : " + tv1.dimensiones);
        System.out.println(" La marca del tv es: \n" + tv1.marca);
        System.out.println(" El televisor tiene una panatalla de : \n" + tv1.pantalla);
        System.out.println(" Estas son algunas caracteristicas especiales: \n" + tv1.smarttv);
        System.out.println(" Estas son algunas funciones adicionales : \n" + tv1.adicional);
        System.out.println(" Tiene una garantia de : \n" + tv1.garantia);
        System.out.println(" \n");
        System.out.println(" \n");

        //Segundo Objeto
        tv2.nombre = " Smart Tv LG UHD 4K - 75 ";
        tv2.modelo = " 75UQ8050PSB";
        tv2.dimensiones = " 111 cm * 186.8 cm ";
        tv2.marca = " LG ";
        tv2.pantalla = " 4K UHD de 75 pulgadas. "
                + " Resolucion: 3840 x 2160 px. "
                + " Color: Gris. ";
        tv2.smarttv = " Procesador: a5 Gen5 AI Processor 4K. "
                + " Sistema Operativo: webOS Smart TV. "
                + " Navegador Web. "
                + " Active HDR. "
                + " 4K Upscaling."
                + " FILMMAKER MODE "
                + " Canales: 2.0 CH 10W. ";
        tv2.adicional = " Entradas HDMI: 2. "
                + " Puertos USB: 1. "
                + " Bluetooth. "
                + " Wifi."
                + " LAN: 1. "
                + " Entrada componente: Antena/cable."
                + " SPDIF (Salida de audio digital optica)";
        tv2.peso = " 28,6 Kg. ";
        tv2.garantia = " 1 año. ";

        System.out.println(" El nombre del televisor es : \n" + tv2.nombre);
        System.out.println(" El modelo del televisor es : \n" + tv2.modelo);
        System.out.println(" Las dimensiones del tv son : \n" + tv2.dimensiones);
        System.out.println(" La marca del tv es: \n" + tv2.marca);
        System.out.println(" El televisor tiene una pantalla de : \n" + tv2.pantalla);
        System.out.println(" Estas son algunas caracteristicas especiales: \n" + tv2.smarttv);
        System.out.println(" Estas son algunas funciones adicionales : \n" + tv2.adicional);
        System.out.println(" El peso del tv es : \n" + tv2.peso);
        System.out.println(" Tiene una garantia de : \n" + tv2.garantia);
    }
}
