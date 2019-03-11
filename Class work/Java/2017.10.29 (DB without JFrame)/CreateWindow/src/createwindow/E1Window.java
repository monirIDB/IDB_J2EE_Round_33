package createwindow;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class E1Window {
    
    static JFrame aWindow = new JFrame("This is the Window Title");
   
    TextField tf;

    public static void main(String[] args) {
         E1Window mw=new E1Window();
        int windowWidth = 200;
        int windowHeight = 300;
        Container c = aWindow.getContentPane();
        aWindow.setBounds(300, 200, windowWidth, windowHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Color myColor=new Color(234,123,243);
        JButton jb = new JButton("Submit");
        JButton jb1 = new JButton("Close");
        jb.setBounds(400,200,23,34);
        jb.setBackground(myColor);
        jb.setForeground(Color.white);
        c.add(jb);
        c.add(jb1);
        c.setBackground(Color.red);
        JTextField tf = new JTextField(20);
         c.add(tf);
        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Hellow");
                tf.setBackground(Color.red);
                tf.setForeground(Color.white);
            }
    
    
        });
        
        jb1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(null);
                tf.setBackground(Color.green);
            }
    
    
        });
        
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        ButtonGroup bg=new ButtonGroup();
        JCheckBox cb = new JCheckBox("HTML");
        cb.setBackground(Color.blue);
        cb.setForeground(Color.white);
        JCheckBox cb1 = new JCheckBox("CSS");
        JCheckBox cb2 = new JCheckBox("PHP");
        JCheckBox cb3 = new JCheckBox("Java");
        bg.add(cb1);
        bg.add(cb2);
        bg.add(cb3);
        c.add(cb);
        c.add(cb1);
        c.add(cb2);
        c.add(cb3);
        aWindow.pack();
        
        JRadioButton rb = new JRadioButton("Male");
        JRadioButton rb1 = new JRadioButton("Female");
        bg.add(rb);
        bg.add(rb1);
        c.add(rb);
        c.add(rb1);

        
       
        Cursor myCursor = new Cursor(Cursor.HAND_CURSOR);
        jb.setCursor(myCursor);
        cb.setCursor(myCursor);
        JTable jt=new JTable(3,3);
        c.add(jt);
        JToggleButton tb=new JToggleButton("Toggle");
        c.add(tb);
        
        aWindow.setVisible(true);
    }

    

    
}
