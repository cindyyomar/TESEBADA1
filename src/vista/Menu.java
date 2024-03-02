package src.vista;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    private JMenuBar menu;
    public Menu() {
        menu= new JMenuBar();
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearMenu();
        hazInterfaz();
        setVisible(true);
    }
    private void crearMenu(){
        JMenu conf= new JMenu("Configuración.");
        JMenu tran = new JMenu("Transacción");
        JMenu con = new JMenu("Consulta");
        JMenu sal = new JMenu("Salir");
        menu.add(conf);
        menu.add(tran);
        menu.add(con);
        menu.add(sal);
        add(menu, BorderLayout.NORTH);
    }
    private void hazInterfaz(){

    }
}