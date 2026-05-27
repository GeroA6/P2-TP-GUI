import javax.swing.*;
import java.awt.FlowLayout;

public class App {
    private static final String CONTRASENA = "admin123";
    
    public static void main(String[] args) throws Exception {


        JFrame frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Campo usuario
        JLabel labelUsuario = new JLabel("Usuario:");
        JTextField fieldUsuario = new JTextField(20);

        // Campo contraseña
        JLabel labelContrasena = new JLabel("Contraseña:");
        JPasswordField fieldContrasena = new JPasswordField(20);

        // Oculta la contraseña
        fieldContrasena.setEchoChar('*');

        // Botón de inicio
        JButton btnAcceder = new JButton("Acceder");

        // Se añaden al panel
        panel.add(labelUsuario);
        panel.add(fieldUsuario);
        panel.add(labelContrasena);
        panel.add(fieldContrasena);
        panel.add(btnAcceder);

        frame.add(panel);

        // Validacion
        btnAcceder.addActionListener(e -> {
            // getPassword() devuelve un char[], hay que combertirlo en String para comparar
            char[] caracteresContra = fieldContrasena.getPassword();
            String contraIngresada = new String(caracteresContra);

            if(contraIngresada.equals(CONTRASENA)){
                JOptionPane.showMessageDialog(frame, "Acceso correcto", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Acceso denegado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
