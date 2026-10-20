import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana4 extends JFrame{
    private JTextField nombre = new JTextField();
    private JTextField cuadro = new JTextField();
    private JButton botomTransferir = new JButton("Transferir");
    private JButton botonCerrar = new JButton("Cerrar");
public Ventana4(){
    setBounds(0, 0, 400, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    cuadro.setEditable(false);
    JPanel p5 = new JPanel();
    p5.add(botomTransferir);
    p5.add(botonCerrar);
    add(nombre,BorderLayout.NORTH);
    add(cuadro,BorderLayout.CENTER);
    add(p5,BorderLayout.SOUTH);
    botonCerrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    botomTransferir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String textoIngresado = nombre.getText();
            cuadro.setText(textoIngresado);
        }
    });
    setVisible(true);
    }
    public static void main(String[] args) {
        new Ventana4();
    }
}
