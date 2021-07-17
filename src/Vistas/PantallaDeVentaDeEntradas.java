package Vistas;

import Modelos.Tarifa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaDeVentaDeEntradas extends JFrame{
    public  JComboBox comboBoxTarifas;
    public JButton buttonRegistrarVenta;
    private JPanel panel1;
    private JSpinner spinner1;
    private JButton agregarButton;
    private JTextArea textArea1;
    public static Tarifa[] tarifas;
    public static String pepito2;


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

        //boton agregar entradas

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //list1.add("Prueba",comboBoxTarifas).getBounds();

                int i = comboBoxTarifas.getSelectedIndex();
                String contenido = comboBoxTarifas.getSelectedItem().toString();
                String contenidospinner = spinner1.getValue().toString();
                System.out.println("ESTE ES EL INDICE DEL COMBOBOX: "+i);
                System.out.println("ESTE ES EL CONTENIDO DEL COMBOBOX: "+contenido);
                System.out.println("ESTE ES EL CONTENIDO DE ENTRADAS: "+contenidospinner);
                textArea1.setText(contenido+" "+"Cantidad:"+contenidospinner);
            }
        });


        /*String pepito="pepito1";
        comboBoxTarifas.addItem(pepito);*/
        System.out.println("lA CANTIDAD DE ELEMTOS EN PANTALLA ES "+tarifas.length);
            for (Tarifa e:tarifas){
                comboBoxTarifas.addItem("Tipo Visita:"+e.getTipoVisita().getNombre()+" "+"Tipo Entrada:"+e.getTipoDeEntrada().getNombre()+" "+"Monto:"+e.getMonto()+" "+"Monto Adicional:"+e.getMontoAdicionaGuia());
                System.out.println("ACA VA LA INFO DESDE ṔANTALLA"+e.getTipoVisita().getNombre()+" "+e.getTipoDeEntrada().getNombre()+" "+e.getMonto()+" "+e.getMontoAdicionaGuia());
            }
            //comboBoxTarifas.addItem(tarifas);
       // comboBoxTarifas.addItem(mostrarTarifas());

    }
    public static Tarifa[] mostrarTarifas(Tarifa[] tarifas1){
        //String pepito="pepito1";
        tarifas=tarifas1;

        for (Tarifa e: tarifas){
            System.out.println("Es la tarifa desde la pantalla"+e.getTipoDeEntrada()+" "+e.getTipoVisita());
            //comboBoxTarifas.addItem(e.getTipoVisita());
            pepito2=e.getTipoVisita().getNombre();
        }
        //comboBoxTarifas.addItem(pepito);
        /*return pepito;*/
        return tarifas;
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        SpinnerModel sm = new SpinnerNumberModel(0, 0, 1000, 1);
        spinner1=new JSpinner(sm);
    }
}
