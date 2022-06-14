/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciados;
import herenciauno.EstudianteDistancia;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("Rene");
        estudiante.establecerApellidoEstudiante("Elizalde");
        estudiante.establecerIdentificacionEstudiante("10010010");
        estudiante.establecerEdadEstudiante(38);
        estudiante.establecerCostoAsignatura(30);
        estudiante.establecerNumeroAsginaturas(5);
        estudiante.calcularMatriculaDistancia();
        
        
        System.out.printf("%s\n", estudiante);
    }
    
}
