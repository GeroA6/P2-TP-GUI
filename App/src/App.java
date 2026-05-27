import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        JFrame jFrame = new JFrame();
        jFrame.setSize(400, 200);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Opciones seleccionadas: Ninguna");
        JButton button = new JButton("Configurar Preferencias");

        jFrame.add(panel);
        panel.add(label);
        panel.add(button);

        // Instanciamos el diálogo y le pasamos el label
        DialogoPreferencias dialogoPreferencias = new DialogoPreferencias(label);
        
        // Abre el diálogo al pulsar el botón
        button.addActionListener(e -> dialogoPreferencias.setVisible(true));

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);






    }
}
