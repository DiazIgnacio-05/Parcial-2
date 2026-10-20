
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
Herramienta de Déficit Calórico
Planteo: Vamos a armar una ventana enfocada en la planificación física. 
El objetivo es que la ventana capture las calorías de mantenimiento y devuelva cuántas consumir para un déficit de definición.
*/
public class Ventana2 extends JFrame{
    private JTextField cuadro = new JTextField();
    private JButton botonDeficit = new JButton("Calcular Déficit");
    private JButton botonCerrar = new JButton("Cerrar");
    public Ventana2(){
        setBounds(0, 0, 450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        JPanel p3 = new JPanel();
        p3.add(botonDeficit);
        p3.add(botonCerrar);
        add(cuadro);
        add(p3);
        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        botonDeficit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String textoIngresado = cuadro.getText();
                Integer calculo = (Integer.parseInt(textoIngresado)) - 500;
                JOptionPane.showMessageDialog(Ventana2.this,"Tu objetivo es: " + calculo + "KLA");
                cuadro.setText("");
            }
        }); 
        setVisible(true); 
    }
    public static void main(String[] args) {
        new Ventana2();
    }
}