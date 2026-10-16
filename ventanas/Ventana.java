import java.awt.*; // JFRAME,JLABEL,JBUTTON
import java.awt.event.*;
import javax.swing.*; // ACTIONLISTENER Y ACTIONEVENT
public class Ventana{
    public static void main(String[] args) {
        // CREAMOS LA VENTANA
        JFrame ventana = new JFrame("Prueba de primera ventana");
        ventana.setSize(400, 400);
        ventana.setLocationRelativeTo(null); // LA CENTRA EN LA PANTALLA
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // TERMINA EL PROGRAMA CUANDO SE CIERRA LA VENTANA
        ventana.setLayout(new FlowLayout()); // ACOMODA LOS ELEMENTOS UNO AL LADO DEL OTRO
        JLabel etiqueta = new JLabel("Mi Primer interfaz grafica");
        JButton boton = new JButton("Salir");
        // CLASE ANONIMA PARA ESCUCHAR EL EVENTO 
        /*
        SINTAXIS CLASE ANONIMA:
        new NombreDeInterfazOClaseBase() {
    
    Atributos propios (opcional, poco común)
    
    @Override
    public tipoDeRetorno nombreDelMetodo(Parametros p) {
        // Código a ejecutar
    }
    
}; LLEVA ; AL FINAL
        */
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        // PONEMOS LOS COMPONENTES EN LA VENTANA
        ventana.add(etiqueta);
        ventana.add(boton);
        // SIEMPRE AL FINAL. HACE VISIBLE LA VENTANA
        ventana.setVisible(true);
}
}