import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author penarubia
 */
public class availablevehicles extends JFrame {
        public JLabel lblAvailableVehicle, lblTypes, lblChoose;  
        public JButton btnMuscle,btnSUV,btnVan,btnHatchback,btnPickup;
        public JFrame fr=new JFrame("Available Vehicle");

       availablevehicles(){
       fr.setSize(500,500);
       fr.getContentPane().setBackground(Color.gray);
       fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       
       lblAvailableVehicle=new JLabel("AVAILABLE TYPES OF VEHICLE");
       lblAvailableVehicle.setBounds(110,20,300,30);
       lblAvailableVehicle.setFont(new Font("Arial", Font.BOLD,18));
       lblAvailableVehicle.setForeground(Color.WHITE);
       
       lblTypes=new JLabel("CHOOSE WHAT TYPE OF CAR:");
       lblTypes.setBounds(146,45,190,50);
       lblTypes.setFont(new Font("Arial", Font.BOLD,10));
       lblTypes.setForeground(Color.WHITE);

       
       //buttons
       btnMuscle = new JButton("MUSCLE CAR");
       btnMuscle.setBounds(142,85,160,50);
       btnMuscle.setBackground(Color.BLACK);
       btnMuscle.setForeground(Color.WHITE);

       btnSUV = new JButton("SUV CAR");
       btnSUV.setBounds(142,145,160,50); 
       btnSUV.setBackground(Color.BLACK);
       btnSUV.setForeground(Color.WHITE);

       
       btnVan = new JButton("VAN CAR");
       btnVan.setBounds(142,205,160,50);
       btnVan.setBackground(Color.BLACK);
       btnVan.setForeground(Color.WHITE);
       
       btnHatchback = new JButton("HATCHBACK CAR");
       btnHatchback.setBounds(142,265,160,50);
       btnHatchback.setBackground(Color.BLACK);
       btnHatchback.setForeground(Color.WHITE);
       
       btnPickup = new JButton("PICKUP CAR");
       btnPickup.setBounds(142,325,160,50);
       btnPickup.setBackground(Color.BLACK);
       btnPickup.setForeground(Color.WHITE);

       

       //f.add
       fr.add(lblAvailableVehicle);
       fr.add(lblTypes);
       fr.add(btnMuscle);
       fr.add(btnSUV);
       fr.add(btnVan);
       fr.add(btnHatchback);
       fr.add(btnPickup);
       //f.set
       fr.setLayout(null);
       fr.setVisible(true);
           fr.setResizable(false);

 
   
   }

public  void actionPerformed(ActionEvent e){
    
}

}