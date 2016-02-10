/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18.pkg3;
import javax.swing.JOptionPane;
/**
 *
 * @author Adrián
 */
public class Notas {
    public static final int Tamano = 5;
    int[] notas = new int[Tamano];
    String[] alumnos = {"adri", "miki", "Jorge"};

    public void notas() {

        for (int i = 0; i < Tamano; i++) {
            double random = Math.random() * 10 + 1;
            int valor = (int) random;
            notas[i] = valor;
            System.out.println(alumnos[i] + "-->" + notas[i]);
        }
    }
 public void visualizarAprobSus() {
        int ap = 0, sp = 0;
        for (int i = 0; i < Tamano; i++) {
            if (notas[i] >= 5) {
                System.out.println("Nota " + (i + 1) + "-->" + notas[i] + " APROBADO");
                ap++;
            } else {
                System.out.println("Nota " + (i + 1) + "-->" + notas[i] + " SUSPENSO");
                sp++;
            }
        }
        System.out.println("Aprobados: " + ap + "\nSuspensos: " + sp);
    }
    public void visualizarNotaAlta() {
        for (int i = 0; i < Tamano; i++) {
            System.out.println(alumnos[i] + "-->" + notas[i]);
        }
    }

     public void notaMedia() {
        int ac = 0;
        for (int i = 0; i < Tamano; i++) {
            ac += notas[i];
        }
        System.out.println("Nota Media: " + (ac / Tamano));
    }

    public void notaAlta() {
        int nM = 0;
        for (int i = 0; i < Tamano; i++) {
            if (notas[i] > nM) {
                nM = notas[i];
            }
        }
        System.out.println("Nota mas alta: " + nM);
    }

    public void consultaAlumno() {
        String n = JOptionPane.showInputDialog("Nombre del Alumno.");
        n = n.toUpperCase();
        for (int i = 0; i < Tamano; i++) {
            if (n.equals(alumnos[i])) {
                System.out.println("Alumno: " + n + " Nota: " + notas[i]);
            }
        }
    }

    public void alumnosAprobados() {
        System.out.println("Aprobados.");
        for (int i = 0; i < Tamano; i++) {
            if (notas[i] >= 5) {
                System.out.println("Alumno: " + alumnos[i]);
            }
        }
    }

    public void ordenarNotaAlumnos() {
        int c = 0, aux;
        String aux2;
        do {
            c = 0;//para que salga del bucle
            for (int i = 0; i < Tamano - 1; i++) {
                if (notas[i] > notas[i + 1]) {
                    aux = notas[i];
                    notas[i] = notas[i + 1];
                    notas[i + 1] = aux;

                    aux2 = alumnos[i];
                    alumnos[i] = alumnos[i + 1];
                    alumnos[i + 1] = aux2;

                    c = 1;
                }
            }
        } while (c != 0);

    }
}
