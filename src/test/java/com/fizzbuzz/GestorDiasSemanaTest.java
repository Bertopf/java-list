package com.fizzbuzz;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GestorDiasSemanaTest {

    private GestorDiasSemana gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorDiasSemana();
        gestor.crearListaDias();
    }

    @Test
    void testCrearListaDias() {
        assertEquals(7, gestor.obtenerCantidadDias());
    }

    @Test
    void testObtenerDias() {
        List<String> dias = gestor.obtenerDias();
        assertEquals(7, dias.size());
        assertTrue(dias.contains("Lunes"));
    }

    @Test
    void testObtenerCantidadDias() {
        assertEquals(7, gestor.obtenerCantidadDias());
    }

    @Test
    void testEliminarDia() {
        assertTrue(gestor.eliminarDia("Martes"));
        assertFalse(gestor.existeDia("Martes"));
    }

    @Test
    void testObtenerDia() {
        assertEquals("Lunes", gestor.obtenerDia(0));
    }

    @Test
    void testExisteDia() {
        assertTrue(gestor.existeDia("Viernes"));
        assertFalse(gestor.existeDia("Feriado"));
    }

    @Test
    void testOrdenarDiasAlfabeticamente() {
        gestor.ordenarDiasAlfabeticamente();
        assertEquals("Domingo", gestor.obtenerDia(0));
    }

    @Test
    void testVaciarLista() {
        gestor.vaciarLista();
        assertEquals(0, gestor.obtenerCantidadDias());
    }
}
