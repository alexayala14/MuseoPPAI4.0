package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PantallaRegistrarVentaDeEntradas  extends JFrame {
    public JButton registrarVentaDeEntradasButton;
    public JPanel panel2;
    public JMenuBar menuBar;
    public   JMenu archivo;
    public JMenuItem salir;

    public PantallaRegistrarVentaDeEntradas() {
        super("Registrar Venta de Entrada");
        setContentPane(panel2);
        menuBar = new JMenuBar();
        archivo = new JMenu();
        salir = new JMenuItem();
        menuBar.add(archivo);
        archivo.add(salir);
        setJMenuBar(menuBar);
        registrarVentaDeEntradasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame jFrame=new PantallaDeVentaDeEntradas();
                        jFrame.setSize(600,600);
                        jFrame.setVisible(true);
                    }
                });
            }
        });
    }
}
