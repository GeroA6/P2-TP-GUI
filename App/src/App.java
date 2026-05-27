import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
        
        //componentes:
        JFrame jFrame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JMenu archivoMenu = new JMenu("Archivo");
        JMenuItem menuItemLimpiar = new JMenuItem("Limpiar texto");
        JMenuItem menuItemSalir = new JMenuItem("Salir");
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        //asignacion:
        jFrame.setJMenuBar(menuBar);
        
        menuBar.add(archivoMenu);

        archivoMenu.add(menuItemLimpiar);
        
        archivoMenu.add(menuItemSalir);

        jFrame.add(scrollPane);

        //interactividad
        menuItemLimpiar.addActionListener(e -> textArea.setText(""));

        menuItemSalir.addActionListener(e -> System.exit(0));

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);

    }
}
