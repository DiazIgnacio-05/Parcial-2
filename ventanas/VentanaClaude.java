import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class VentanaClaude extends JFrame{
private JTextField campo = new JTextField();
private JLabel etiqueta = new JLabel();
private JButton btonSaludar = new JButton("Saludar");
private JButton btonContar = new JButton("Contar");
private JButton btonBorrar = new JButton("Borrar");
private class Escucha implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==btonSaludar){
etiqueta.setText("Hola, " + campo.getText());
}else if(e.getSource()==btonContar){
etiqueta.setText("Letras: "+ campo.getText().length());
	}
	}
}
public VentanaClaude(){
super("Ventana 12");
setSize(450,300);
setDefaultCloseOperation(EXIT_ON_CLOSE);
JPanel panel = new JPanel();
panel.add(btonSaludar);
panel.add(btonContar);
panel.add(btonBorrar);
add(campo,BorderLayout.NORTH);
add(etiqueta,BorderLayout.SOUTH);
add(panel,BorderLayout.CENTER);
Escucha miEscucha = new Escucha(); //Creacion del escucha
btonSaludar.addActionListener(miEscucha); //Vinculacion
btonContar.addActionListener(miEscucha); //Vinculacion
btonBorrar.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
campo.setText("");
etiqueta.setText("");}
});
}
public static void main(String[] args){
new VentanaClaude().setVisible(true);
}
}