import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/*
Ejercicio 1: Sistema de Emergencias Médicas
Planteo: Estás diseñando la interfaz gráfica para un software de gestión de guardia médica. 
Necesitás una ventana que reciba el estado del paciente y permita ejecutar acciones rápidas.
Tres botones: "Registrar Paciente", "Limpiar" y "Código Rojo".
*/
public class Ventana1 extends JFrame{
    private JTextField texto2 = new JTextField();
    private JButton boton1 = new JButton("Registrar Paciente");
    private JButton boton2 = new JButton("Limpiar");
    private JButton boton3 = new JButton("Codigo rojo");
    private class Escuchador2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== boton1){
                texto2.setText("Guardando registro...");
            } else if(e.getSource()== boton3){
                texto2.setText("¡ALERTA MÉDICA ACTIVADA!");
            }
        }
    }
    public Ventana1(){
        setBounds(10,10,450,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p2 = new JPanel();
        p2.add(boton1);
        p2.add(boton2);
        p2.add(boton3);
        add(texto2, BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        Escuchador2 miEscuchador2 = new Escuchador2();
        boton1.addActionListener(miEscuchador2);
        boton3.addActionListener(miEscuchador2);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto2.setText("");
                texto2.requestFocus(); 
            }
        }); 
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ventana1();
    }
}