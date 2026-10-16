import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class VentanaBotones{
    public static void main(String[] args) {
        JFrame ventanaB = new JFrame("Ventana con botones");
        ventanaB.setSize(500, 500);
        ventanaB.setLocationRelativeTo(null);
        ventanaB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaB.setLayout(new BorderLayout());
        JTextArea areaTexto = new JTextArea("");
        ventanaB.add(areaTexto,BorderLayout.CENTER);
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());

        JButton aceptar = new JButton("Aceptar");
        JButton limpiarTexto = new JButton("Limpiar texto");
        JButton salir = new JButton("Salir");
        
        limpiarTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.setText("");
        }
    });
    aceptar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String texto = areaTexto.getText();
            if(texto.trim().isEmpty()){
                JOptionPane.showMessageDialog(ventanaB, "No escribiste nada","Atencion", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(ventanaB, "Ingresaste: " + texto, "Datos capturados." , JOptionPane.INFORMATION_MESSAGE);
            }
        }
    });
    
    salir.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    });
    panelBotones.add(aceptar);
    panelBotones.add(limpiarTexto);
    panelBotones.add(salir);
    ventanaB.add(panelBotones, BorderLayout.SOUTH);

    ventanaB.setVisible(true);
}
}