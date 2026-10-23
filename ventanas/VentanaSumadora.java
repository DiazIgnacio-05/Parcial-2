import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class VentanaSumadora extends JFrame{
private JTextField texto = new JTextField();
private JLabel estado = new JLabel("");
private int acumulador = 0;
private class Escuchador2 implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
String comando = e.getActionCommand();
switch (comando) {
                case "1": 
                case "2": 
                case "3":
                    texto.setText(texto.getText() + comando);
                    break;
case "+":
if (!texto.getText().isEmpty()) {
        acumulador += Integer.parseInt(texto.getText());
        texto.setText("");
                    }
break;
case "=":
    if (!texto.getText().isEmpty()) {
            int sumaFinal = acumulador + Integer.parseInt(texto.getText());
            texto.setText(String.valueOf(sumaFinal));
            acumulador = 0; 
                    }
break;
		}
}
}
public VentanaSumadora(){
super("Sumadora");
setSize(450,300);
setDefaultCloseOperation(EXIT_ON_CLOSE);
texto.setEditable(false);
JPanel panel = new JPanel(new GridLayout(1,5));
Escuchador2 miEscuchador2 = new Escuchador2();
String[] botones = {"1","2","3","+","="};
for(String t: botones){
	JButton boton = new JButton(t);
	boton.addActionListener(miEscuchador2);
	panel.add(boton);
	}
add(texto,BorderLayout.NORTH);
add(panel,BorderLayout.CENTER);
add(estado,BorderLayout.SOUTH);
	}
public static void main(String[] args){
new VentanaSumadora().setVisible(true);
	}
}