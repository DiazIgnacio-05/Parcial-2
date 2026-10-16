
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana2025 extends JFrame{
    private JTextField texto = new JTextField("");
    private JButton boton1 = new JButton("Guardar");
    private JButton boton2 = new JButton("Nuevo");
    private JButton boton3= new JButton("Editar");
    private class Escuchador implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){ // Clase interna miembro
            if(e.getSource() == boton1 ){
                texto.setText("Guardando archivo de texto...");
            }else if (e.getSource() == boton3){
                texto.setText("Modificando archivo de texto....");
            }
        }
        }
         public Ventana2025(){
            setBounds(2, 2, 350, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            JPanel p = new JPanel();
            p.add(boton1);
            p.add(boton2);
            p.add(boton3);
            add(texto,BorderLayout.NORTH);
            add(p,BorderLayout.CENTER);
            Escuchador miescuchador = new Escuchador();
            boton1.addActionListener(miescuchador);
            boton3.addActionListener(miescuchador);
            //Clase anonima
            boton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    texto.setText("");
                    texto.requestFocus();
                }
            });
            setVisible(true);
    }
    public static void main(String[] args) {
        new Ventana2025();
    }
}