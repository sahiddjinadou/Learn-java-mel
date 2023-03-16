package mypack;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame {
    public static void main(String[] args) {
        System.out.println("From package");
        //JFrame
        JFrame f = new JFrame("Ma fenêtre");
        
        //JLabel
        JLabel monLabel = new JLabel("Ma todo-List", JLabel.CENTER);
        f.add(monLabel);

        //Tableau pour le select
        String[] todoState = {"A faire", "En cours", "Fini"};
        
        //Panel
        JPanel myPanel = new JPanel();

        //JMenuBar
        JMenuBar menu = new JMenuBar();
        JMenu filter = new JMenu("Filtrer🔽");
        // JMenu add = new JMenu("Ajouter ➕");
        JMenuItem notDone = new JMenu("A faire");
        JMenuItem onGoing = new JMenu("En cours");
        JMenuItem done = new JMenu("Fini");
        filter.add(notDone);
        filter.add(onGoing);
        filter.add(done);
        menu.add(filter);

        //JTextField 
        JTextField inp = new JTextField();
        // inp.setBounds(20, 40, 200, 28);
        inp.setSize(10, 50);



        //Button
        JButton btn1 = new JButton("Ajouter");
        // JButton btn2 = new JButton("Remove");

        //JCombobox pour créer un champ select
        // JComboBox select = new JComboBox(todoState);

        //Ajout des butons au panel
        myPanel.add(btn1);
        myPanel.add(inp);
        // myPanel.add(btn2);

        //Ajout des composants à frame
        f.setLayout(new GridLayout(5, 1));
        f.add(menu);
        f.add(monLabel);
        f.add(myPanel);
        f.add(inp);

        //Réglages sur le frame
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 350);
        f.setVisible(true);

    }



    
}
