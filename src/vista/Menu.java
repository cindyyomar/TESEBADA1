package src.vista;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    private JMenuBar menu;
    private JPanel panel;
    private JMenu conf;
    private JMenu tran;
    private JMenu con;
    private JMenu sal;
    public Menu() {

        menu= new JMenuBar();
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearMenu();
        setVisible(true);
    }
    private void crearMenu(){
        conf= new JMenu("Configuración.");
        tran = new JMenu("Transacción");
        con = new JMenu("Consulta");
        sal = new JMenu("Salir");
        menu.add(conf);
        menu.add(tran);
        menu.add(con);
        menu.add(sal);
        add(menu, BorderLayout.NORTH);
    }
    public void anadirPanel(JPanel panel){
        add(panel,BorderLayout.CENTER);
        panel.setVisible(true);
    }

    public JMenu getConf() {
        return conf;
    }

    public JMenu getTran() {
        return tran;
    }

    public JMenu getCon() {
        return con;
    }

    public JMenu getSal() {
        return sal;
    }
}
