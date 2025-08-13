package com.fizzbuzz;


import com.fizzbuzz.GestorDiasSemana;

public class App {
    public static void main(String[] args) {
        
        GestorDiasSemana gestor = new GestorDiasSemana();

       
        gestor.crearListaDias();

 
        System.out.println("Días de la semana:");
        gestor.obtenerDias().forEach(System.out::println);


        System.out.println("\nEliminando 'Martes'...");
        gestor.eliminarDia("Martes");

  
        System.out.println("\nDías después de eliminar:");
        gestor.obtenerDias().forEach(System.out::println);

       
        System.out.println("\n¿Existe 'Viernes'? " + gestor.existeDia("Viernes"));
        System.out.println("¿Existe 'Martes'? " + gestor.existeDia("Martes"));

       
        System.out.println("\nLista ordenada alfabéticamente:");
        gestor.ordenarDiasAlfabeticamente();
        gestor.obtenerDias().forEach(System.out::println);

     
        System.out.println("\nCantidad de días: " + gestor.obtenerCantidadDias());

       
        System.out.println("\nVaciando lista...");
        gestor.vaciarLista();
        System.out.println("Cantidad de días después de vaciar: " + gestor.obtenerCantidadDias());
    }
}