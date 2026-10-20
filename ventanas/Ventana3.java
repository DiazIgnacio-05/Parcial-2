import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Ventana3 extends JFrame{
    private JLabel parcial1 = new JLabel("Nota parcial 1");
    private JLabel parcial2 = new JLabel("Nota Parcial 2");
    private JTextField nota1 = new JTextField();
    private JTextField nota2 = new JTextField();
    private JButton boton1 = new JButton("Calcular promedio");
    private JButton boton2 = new JButton("Limpiar");
    public class Escuchador3 implements ActionListener{
        @Override
        public void actionPerformed (ActionEvent e){
            if(e.getSource() == boton1){
                String nota1Ingresada = nota1.getText();
                String nota2Ingresada = nota2.getText();
                Integer promedio = (Integer.parseInt(nota1Ingresada)+ Integer.parseInt(nota2Ingresada)) / 2;
                JOptionPane.showMessageDialog(Ventana3.this,"El promedio de las notas es: " + promedio);
            } else if(e.getSource()== boton2){
                nota1.setText("");
                nota2.setText("");
            }
        }
    }
    public Ventana3(){
        setBounds(0, 0, 400, 400);
        setLayout(new GridLayout(3,2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //JPanel p4 = new JPanel();
        //p4.add(boton1);
        //p4.add(boton2);
        add(parcial1);
        add(nota1);
        add(parcial2);
        add(nota2);
        //add(p4);
        add(boton1);
        add(boton2);
        Escuchador3 miEscuchador3 = new Escuchador3();
        boton1.addActionListener(miEscuchador3);
        boton2.addActionListener(miEscuchador3);

        setVisible(true);
}
public static void main(String[] args) {
    new Ventana3();
}
}