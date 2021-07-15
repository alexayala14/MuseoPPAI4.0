package Vistas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaDeVentaDeEntradas extends JFrame{
    public JComboBox comboBoxTarifas;
    public JButton buttonRegistrarVenta;
    private JPanel panel1;
    private JSpinner spinner1;

    public PantallaDeVentaDeEntradas(){
        super("Registrar Venta de Entrada");
        setContentPane(panel1);
        buttonRegistrarVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showConfirmDialog(null,"Precione Ok para confirmar venta");
                //JOptionPane.showMessageDialog(null,"Precione Ok para confirmar venta");
                int result = JOptionPane.showConfirmDialog(panel1, "Presione Ok para confirmar venta",
                        "Title", JOptionPane.OK_CANCEL_OPTION);

                if (result  == JOptionPane.OK_OPTION) {
// OK button was pressd
                    System.out.println("CONFIRMO OK");
                    dispose();
                    //System.exit(0);
                } else if (result  == JOptionPane.CANCEL_OPTION) {
// Cancel button was pressed
                    System.out.println("CANCELO OK");
                }

            }
        });
    }


}
