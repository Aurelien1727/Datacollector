package com.example.datacollector.Reservation;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        new MainGUI();
    }
}
package com.example.datacollector.Reservation;
        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
public class MainGUI {
    private JPanel mainPanel;
    private JButton NORMALButton;
    private JButton RINGSIDEButton;
    private JButton ENDSTANDSButton;
    JFrame mainframe = new JFrame();
    public MainGUI(){
        mainframe.setDefaultCloseOperation(mainframe.EXIT_ON_CLOSE);
        mainframe.setContentPane(mainPanel);
        mainframe.pack();
        mainframe.setLocationRelativeTo(null);
        mainframe.setVisible(true);
        NORMALButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainframe.dispose();
                new Normal();
            }
        });
        RINGSIDEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainframe.dispose();
                new RingSide();
            }
        });
        ENDSTANDSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainframe.dispose();
                new EndStands();
            }
        });
    }
}
package com.company;
        import com.toedter.calendar.JDateChooser;
        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.text.DateFormat;
        import java.util.Random;
public class Normal {
    private JPanel normal;
    private JButton BOOKNOWButton;
    private JButton HOMEButton;
    private JPanel datePanel;
    private JLabel seats2;
    private static int a =100;
    JDateChooser dateChooser = new JDateChooser();
    JFrame normalF = new JFrame();
    public Normal(){
        normalF.setDefaultCloseOperation(normalF.EXIT_ON_CLOSE);
        normalF.setContentPane(normal);
        normalF.pack();
        normalF.setLocationRelativeTo(null);
        normalF.setVisible(true);
        datePanel.add(dateChooser);
        seats2.setText(String.valueOf(a));
        HOMEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                normalF.dispose();
                new MainGUI();
            }
        });
        BOOKNOWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dateChooser.getDate()==null){
                    JOptionPane.showMessageDialog(null,"PLEASE CHOOSE A DATE");
                }else {
                    String strDate = DateFormat.getDateInstance().format(dateChooser.getDate());
                    JOptionPane.showMessageDialog(null, "TICKETS BOOKED SUCCESSFULLY!");
                    JOptionPane.showMessageDialog(null, "MATCH IS ON: " + strDate + " & YOUR SEAT NO IS: " + seatNo());
                    a--;
                    String a1 = String.valueOf(a);
                    seats2.setText(a1);
                }
            }
        });
    }
    public String seatNo(){
        Random random = new Random();
        int a = random.nextInt(100);
        return String.valueOf(a);
    }
}
package com.company;
        import com.toedter.calendar.JDateChooser;
        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.text.DateFormat;
        import java.util.Random;
public class EndStands {
    private JPanel endStand;
    private JButton HOMEButton;
    private JButton BOOKNOWButton;
    private JPanel endDate;
    private JLabel seats1;
    private static int a=100;
    JFrame endF = new JFrame();
    JDateChooser endDate1 = new JDateChooser();
    public EndStands() {
        endF.setDefaultCloseOperation(endF.EXIT_ON_CLOSE);
        endF.setContentPane(this.endStand);
        endF.pack();
        endF.setLocationRelativeTo(null);
        endF.setVisible(true);
        endDate.add(endDate1);
        seats1.setText(String.valueOf(a));
        HOMEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endF.dispose();
                new MainGUI();
            }
        });
        BOOKNOWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(endDate1.getDate()==null){
                    JOptionPane.showMessageDialog(null,"PLEASE CHOOSE A DATE");
                }else {
                    String strDate = DateFormat.getDateInstance().format(endDate1.getDate());
                    JOptionPane.showMessageDialog(null, "TICKETS BOOKED SUCCESSFULLY!");
                    JOptionPane.showMessageDialog(null, "MATCH IS ON: " + strDate + " & YOUR SEAT NO IS: " + seatNo());
                    a--;
                    String a1 = String.valueOf(a);
                    seats1.setText(a1);
                }
            }
        });
    }
    public String seatNo(){
        Random random = new Random();
        int a = random.nextInt(100);
        return String.valueOf(a);
    }
}
 package com.company;
         import com.toedter.calendar.JDateChooser;
         import javax.swing.*;
         import java.awt.event.ActionEvent;
         import java.awt.event.ActionListener;
         import java.text.DateFormat;
         import java.util.Random;
public class RingSide {
    private JPanel ringSide;
    private JButton HOMEButton;
    private JButton BOOKNOWButton;
    private JPanel ringdate;
    private JLabel seats;
    private static int a =100;
    JFrame ringF = new JFrame();
    JDateChooser ringDate = new JDateChooser();
    public RingSide() {
        ringF.setDefaultCloseOperation(ringF.EXIT_ON_CLOSE);
        ringF.setContentPane(ringSide);
        ringF.pack();
        ringF.setLocationRelativeTo(null);
        ringF.setVisible(true);
        ringdate.add(ringDate);
        seats.setText(String.valueOf(a));
        HOMEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ringF.dispose();
                new MainGUI();
            }
        });
        BOOKNOWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ringDate.getDate()==null){
                    JOptionPane.showMessageDialog(null,"PLEASE CHOOSE A DATE ");
                }
                String strDate = DateFormat.getDateInstance().format(ringDate.getDate());
                JOptionPane.showMessageDialog(null,"TICKETS BOOKED SUCCESSFULLY!");
                JOptionPane.showMessageDialog(null,"MATCH IS ON: "+strDate+" & YOUR SEAT NO IS: "+seatNo());
                a--;
                String a1 = String.valueOf(a);
                seats.setText(a1);
            }
        });
    }
    public String seatNo(){
        Random random = new Random();
        int a = random.nextInt(100);
        return String.valueOf(a);
    }
}
