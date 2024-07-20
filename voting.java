package vote;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class voting extends JFrame implements ActionListener {
    //Button
    JButton submit= new JButton("SUBMIT YOUR VOTE");
    JButton result= new JButton("CHECK  RESULTS");
    // text fields
    JTextField t1,t2;

    JPanel pane = new JPanel();
    // Label for set text
    JLabel Label = new JLabel();
    JLabel Label2 = new JLabel();
    JLabel Label3 = new JLabel();
    JLabel Label4 = new JLabel();

    //Radio Button
    JRadioButton r1=new JRadioButton();
    JRadioButton r2=new JRadioButton();
    JRadioButton r3=new JRadioButton();
    JRadioButton r4=new JRadioButton();
    ButtonGroup bg=new ButtonGroup();

    public static int v1 = 0;
    public static int v2 = 0;
    public static int v3 = 0;
    public static int v5 = 0;


    // voting GUI

    public voting() {
                 super("Voting GUI");
                 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 setResizable(false);

 //              text field

                 Label4.setText("ONLINE VOTING SYSTEM      ");
                 Label4.setBounds(50,100,200,30);
                 Label4.setFont(new Font("Verdana",Font.BOLD,20));
                 pane.add(Label4);

                 Label.setText("CANDIDATE NAME  :-        ");
                 t1=new JTextField("Enter Here     ");
                 t1.setBounds(50,100, 200,30);
                 pane.add(Label);
                 pane.add(t1);


                 Label2.setText("ENTER PHONE  :-          ");
                 t2 = new JTextField("Enter Here      ");
                 t2.setBounds(50,100,200,30);
                 pane.add(Label2);
                 pane.add(t2);
                 Label3.setText("CAST YOUR VOTE HERE                                  ");
                 pane.add(Label3);

                 // Buttons
                 r1.setText("PARTY A                                                    ");
                 r1.setBounds(75,50,100,30);
                 r1.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                         r1ActionListener (evt);
                     }
                 });
                 r2.setText("PARTY B                                                    ");
                 r2.setBounds(75,50,100,30);
                 r2.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                         r2ActionListener (evt);
                     }
                 });
                 r3.setText("PARTY C                                                    ");
                 r3.setBounds(75,50,100,30);
                 r3.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                         r3ActionListener (evt);
                     }
                 });
                 r4.setText("PARTY D                                                    ");
                 r4.setBounds(75,50,100,30);
                 r4.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                         r4ActionListener (evt);
                     }
                 });
                 bg.add(r1);
                 bg.add(r2);
                 bg.add(r3);
                 bg.add(r4);
                 pane.add(r1);
                 pane.add(r2);
                 pane.add(r3);
                 pane.add(r4);

                 pane.add(submit);
                 submit.addActionListener(this);
                 pane.add(result);
                 result.addActionListener(this::performed);
                 setSize(350, 350);
                 add(pane);

//               visible for  GUi

                 setVisible(true);
            }

//radio  Button listener  method
    private void r1ActionListener(ActionEvent actionEvent) {
        if(r1.isSelected())
        {
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);

        }


    }

    private void r2ActionListener(ActionEvent actionEvent) {
        if(r2.isSelected())
        {
            r1.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);

        }

    }
    private void r3ActionListener(ActionEvent actionEvent) {
        if(r3.isSelected())
        {   
            r1.setSelected(false);
            r2.setSelected(false);
            r4.setSelected(false);

        }

    }
    private void r4ActionListener(ActionEvent actionEvent) {
        if(r4.isSelected())
        {
            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);

        }
    

    }

 //    result button

    private void performed(ActionEvent actionEvent) {
        if(v1>v2 && v1>v3 && v1>v5){
            JOptionPane.showMessageDialog(rootPane, "Party A "+v1+"\nParty B "+v2+"\nParty C "+v3+ "\nParty D "+v5+"\n\nPARTY A has a lead");
        }
        else if(v2>v1&&v2>v3 && v2>v5){
            JOptionPane.showMessageDialog(rootPane, "Party A "+v1+"\nParty B "+v2+"\nParty C "+v3+"\nParty D "+v5+"\n\nPARTY B has a lead");
        }
        else if(v3>v1&&v3>v2 && v3>v5){
            JOptionPane.showMessageDialog(rootPane, "Party A "+v1+"\nParty B "+v2+"\nParty C "+v3+"\nParty D "+v5+"\n\nPARTY C has a lead");
        }
        else if(v5>v1 && v5>v2 && v5>v3)
        {
            JOptionPane.showMessageDialog(rootPane, "Party A "+v1+"\nParty B "+v2+"\nParty C "+v3+"\nParty D "+v5+"\n\nPARTY D has a lead");

        }
        else if(v1==v2 && v3==v5 )
        {
            JOptionPane.showMessageDialog(rootPane, "WAITING FOR RESULT");

        }

    }

    private static void setLookAndFeel() {
                 try {
                         UIManager.setLookAndFeel(
                                    "javax.swing.plaf.nimbus.NimbusLookAndFeel"
                         );
                     } catch (Exception exc) {
                         // ignore error
                     }
             }


            public static void main(String[] arguments) {
                 setLookAndFeel();
                voting sf = new voting();
             }

 //    submit button action
    @Override 
    public void actionPerformed(ActionEvent actionEvent) {

            if (r1.isSelected()) {
                v1++;

            }
           else if (r2.isSelected()) {
                v2++;

            }
            else  if (r3.isSelected()) {
             v3++;

            }
            else if (r4.isSelected()) {
              v5++;

            }   
            else {
                JOptionPane.showMessageDialog( rootPane,"PLEASE ENTER NAME AND SELECT PARTY  ");
            }

    }

