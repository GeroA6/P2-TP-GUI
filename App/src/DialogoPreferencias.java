import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class DialogoPreferencias extends JDialog {

    private JLabel labelPrincipal;

    public DialogoPreferencias(JLabel label) {
        this.labelPrincipal = label;
        
        // 1. Configuramos la ventana secundaria
        setTitle("Preferencias");
        setSize(350, 150);
        setModal(true); // Bloquea la interacción con la ventana principal
        setLayout(new FlowLayout()); // Acomoda los componentes en línea
        
        // 2. Instanciamos las casillas de verificación y el botón
        JCheckBox checkOscuro = new JCheckBox("Modo Oscuro");
        JCheckBox checkNotificaciones = new JCheckBox("Notificaciones");
        JCheckBox checkAutoguardado = new JCheckBox("Autoguardado");
        JButton btnAceptar = new JButton("Aceptar");
        
        // 3. Añadimos los componentes al JDialog
        add(checkOscuro);
        add(checkNotificaciones);
        add(checkAutoguardado);
        add(btnAceptar);
        
        // 4. Interacción: Procesar Opciones
        btnAceptar.addActionListener(e -> {
            String seleccion = "";
            
            if (checkOscuro.isSelected()) {
                seleccion += "Modo Oscuro, ";
            }
            if (checkNotificaciones.isSelected()) {
                seleccion += "Notificaciones, ";
            }
            if (checkAutoguardado.isSelected()) {
                seleccion += "Autoguardado, ";
            }
            
            // Evaluamos si no se marcó nada o si hay que quitar la última coma
            if (seleccion.isEmpty()) {
                seleccion = "Ninguna";
            } else {
                seleccion = seleccion.substring(0, seleccion.length() - 2);
            }
            
            // Actualizamos la etiqueta principal y cerramos la ventana
            labelPrincipal.setText("Opciones seleccionadas: " + seleccion);
            dispose();
        });
    }
}

