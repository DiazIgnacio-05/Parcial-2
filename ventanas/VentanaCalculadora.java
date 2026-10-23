import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaCalculadora extends JFrame {
    private JTextField num1 = new JTextField(8);
    private JTextField num2 = new JTextField(8);
    private JLabel resultado = new JLabel("Resultado: ");

    private class Operacion implements ActionListener {      // clase interna MIEMBRO
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                String op = e.getActionCommand();
                if (op.equals("/") && b == 0) {
                    resultado.setText("Error: division por cero");
                    return;
                }
                double r = 0;
                switch (op) {
                    case "+": r = a + b; break;
                    case "-": r = a - b; break;
                    case "*": r = a * b; break;
                    case "/": r = a / b; break;
                }
                resultado.setText("Resultado: " + r);
            } catch (NumberFormatException ex) {
                resultado.setText("Error: numero invalido");
            }
        }
    }

    public VentanaCalculadora() {
        super("Calculadora");
        setSize(320, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel numeros = new JPanel();
        numeros.add(num1);
        numeros.add(num2);
        JPanel ops = new JPanel(new GridLayout(1, 4));
        Operacion escucha = new Operacion();                    // CREACION (uno solo)
        for (String t : new String[]{"+", "-", "*", "/"}) {
            JButton b = new JButton(t);
            b.addActionListener(escucha);                       // VINCULACION
            ops.add(b);
        }
        add(numeros, BorderLayout.NORTH);
        add(ops, BorderLayout.CENTER);
        add(resultado, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new VentanaCalculadora().setVisible(true);
    }
}