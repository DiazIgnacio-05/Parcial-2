import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class VentanaConversor extends JFrame{
private JTextField campo = new JTextField();
private JLabel estado = new JLabel("Listo");
private JButton btonMayus = new JButton("Mayusculas");
private JButton btonMini = new JButton("Minusculas");
private JButton btonLimpiar = new JButton("Limpiar");
private class Escuchador implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==btonMayus){
	String mayuscula = campo.getText().toUpperCase();
	estado.setText("Cambiando a mayusculas: " + mayuscula);
	}else if(e.getSource()==btonMini){
	String minuscula = campo.getText().toLowerCase();
	estado.setText("Cambiando a minusculas: " + minuscula);
			}
		}
	}
public VentanaConversor(){
super("Conversor");
setSize(450,300);
setDefaultCloseOperation(EXIT_ON_CLOSE);
JPanel panel = new JPanel();
panel.add(btonMayus);
panel.add(btonMini);
panel.add(btonLimpiar);
add(campo,BorderLayout.NORTH);
add(panel,BorderLayout.CENTER);
add(estado,BorderLayout.SOUTH);
btonLimpiar.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
campo.setText("");
estado.setText("Limpiando");
	}
});
Escuchador miEscuchador = new Escuchador();
btonMayus.addActionListener(miEscuchador);
btonMini.addActionListener(miEscuchador);
}
public static void main(String[] args){
	new VentanaConversor().setVisible(true);
	}
}