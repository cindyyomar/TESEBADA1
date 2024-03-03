package src.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class PanConfig extends JPanel implements ComponentListener {
    private JLabel lblNombreTabla;
    private JTextField txtNombreTabla;
    private JTable tableConfig;
    private DefaultTableModel modelo;
    private String[] columnNames = {"Fragmento", "Base Datos", "Criterio", "Atributos"};
    private String[][] data ={
            {"","","",""},
            {"","","",""},
            {"","","",""},
            {"","","",""}
    };
    public PanConfig(){
        modelo = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return true;
            }
        };
        setLayout(null);
        tableConfig = new JTable(modelo);
        lblNombreTabla= new JLabel("Nombre de la tabla distribuida");
        txtNombreTabla = new JTextField();
    }
    public void hazInterfaz(){
        int h = getHeight(), w =getWidth();
        if(h==0 || w==0)
            return;
        lblNombreTabla.setBounds((int)(w*0.05), (int)(h*0.03),(int)(w*0.2), (int)(h*0.07));
        txtNombreTabla.setBounds((int)(w*0.25), (int)(h*0.03),(int)(w*0.2), (int)(h*0.07));
        tableConfig.setBounds((int)(w*0.05), (int)(h*0.03),(int)(w*0.4), (int)(h*0.5));
    }

    @Override
    public void componentResized(ComponentEvent e) {

    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
