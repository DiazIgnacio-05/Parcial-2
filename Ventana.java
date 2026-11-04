import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana extends JFrame{
private JTextField usuario = new JTextField();
private JTextField clave = new JTextField();
private JLabel etiqueta1 = new JLabel("Usuario: ");
private JLabel etiqueta2 = new JLabel("Contraseña: ");
private JLabel mensajes = new JLabel();
private JButton ingresar = new JButton("Ingresar");
private JButton limpiar = new JButton("Limpiar");
private JButton salir = new JButton("Salir");
private class Escucha implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==ingresar){
	if(usuario.getText().equals("admin") && clave.getText().equals("1234")){mensajes.setText("Bienvenido admin");
	}else{mensajes.setText("Datos incorrectos");}
}if(e.getSource()==limpiar){usuario.setText("");
clave.setText("");
mensajes.setText("");}}
}
public Ventana(){
setSize(400,400);
JPanel panel = new JPanel();
panel.add(ingresar);
panel.add(limpiar);
panel.add(salir);
JPanel datos = new JPanel(new GridLayout(2, 2));
datos.add(etiqueta1);
datos.add(usuario);
datos.add(etiqueta2);
datos.add(clave);
add(datos,BorderLayout.NORTH);
add(panel,BorderLayout.CENTER);
add(mensajes,BorderLayout.SOUTH);
salir.addActionListener(new ActionListener(){ 
@Override
public void actionPerformed(ActionEvent e){dispose();}
});
Escucha miEscucha = new Escucha(); // CREACION
ingresar.addActionListener(miEscucha); //VINCULACION
limpiar.addActionListener(miEscucha); //VINCULACION
}
public static void main(String[] args){new Ventana().setVisible(true);}
}