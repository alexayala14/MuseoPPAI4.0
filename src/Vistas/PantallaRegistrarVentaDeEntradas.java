package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class PantallaRegistrarVentaDeEntradas  extends JFrame {
    public JButton registrarVentaDeEntradasButton;
    public JPanel panel2;
    public JMenuBar menuBar;
    public   JMenu archivo;
    public JMenuItem salir;
    private FondoPanel fondoPanel =new FondoPanel();


    public PantallaRegistrarVentaDeEntradas() {
        super("Registrar Venta de Entrada");
        //setContentPane(fondoPanel);
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
                        jFrame.setSize(1000,1000);
                        jFrame.setVisible(true);
                    }
                });
            }
        });
    }


}

class FondoPanel extends JPanel{
    public Image image;

    @Override
    public void paint(Graphics g) {

        image = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/imagen.jpg"))).getImage();
        g.drawImage(image,0,0,getWidth(),getHeight(),this);

        setOpaque(false);
        super.paint(g);
    }
}
