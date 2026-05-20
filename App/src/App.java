import javax.swing.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // caja principal (ventana)
        JFrame jFrame = new JFrame();

        jFrame.setSize(800, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // contenedor intermedio (donde van los botones y texto)
        JPanel jPanel = new JPanel();
        
        // el jPanel va dentro del jFrame
        jFrame.add(jPanel);
        
        // componentes dentro del jPanel
        JLabel jLabel = new JLabel("Introduce tu nombre:");

        JTextField jTextField = new JTextField();
        jTextField.setColumns(20);
        
        JLabel jLabel2 = new JLabel();
        
        JButton jButton = new JButton("Saludar");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // lógica que ocurre cuando se hace clic
                String nombre = jTextField.getText();
                jLabel2.setText("¡Hola, " + nombre + "!");
            }
        });
        
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        jPanel.add(jLabel2);
        
        jFrame.setVisible(true);
        
        
        

        
        










    }
}
