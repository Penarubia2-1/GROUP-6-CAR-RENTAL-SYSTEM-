/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author IMPERIAL JURIE
 */
public class ClientAdmin {
   JFrame frame = new JFrame("Client/Admin");
    private JLabel lblYouAreA = new JLabel();
    private JButton btnClient,btnAdmin;
    private JLabel lbltitle;
    
   ClientAdmin(){
       
     frame.setSize(600,500);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     lbltitle = new JLabel("WELCOME TO OUR CAR RENTAL SYSTEM ");
     lbltitle.setBounds(80, 50, 450,20);
     lbltitle.setFont(new Font("Arial", Font.BOLD,20));
     
     lblYouAreA = new JLabel("Are You A??");
     lblYouAreA.setBounds(230, 100, 150,20);
     lblYouAreA.setFont(new Font("Arial", Font.BOLD,20));
     
     btnClient = new JButton("CLIENT");
     btnClient.setBounds(200,170,180,40);
     btnClient.setFont(new Font("Arial", Font.BOLD,20));
     
     btnAdmin = new JButton("ADMIN");
     btnAdmin.setBounds(200, 230, 180, 40);
     btnAdmin.setFont(new Font("Arial", Font.BOLD,20));
     
     
     frame.add(lbltitle);
     frame.add(lblYouAreA);
     frame.add(btnClient);
     frame.add(btnAdmin);
     frame.setVisible(true);
     frame.setResizable(false);
     
     
     
       
   }
    
}