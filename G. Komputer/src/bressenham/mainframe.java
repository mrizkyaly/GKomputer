/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bressenham;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
/**
 *
 * @author ALAN
 */
public class mainframe {
    public mainframe(){
        JFrame mainframe = new JFrame("UAS");
        mainframe.setSize(500,350);
        mainframe.getContentPane().setBackground(Color.BLACK);
        mainframe.getContentPane().setForeground(Color.WHITE);
        
        JLabel judul = new JLabel("LINGKARAN BRESSENHAM");
        judul.setFont(new Font("Times New Roman",Font.BOLD,30));
        judul.setForeground(Color.WHITE);
        judul.setBounds(30,30,450,30);
        mainframe.add(judul);
        
//        JLabel identity = new JLabel("NAMA =    ACHMAD FADLAN BHAHREISY ");
//        identity.setFont(new Font("Times New Roman",Font.BOLD,20));
//        identity.setBounds(30,65,450,30);
//        identity.setForeground(Color.WHITE);
//        mainframe.add(identity);
//        
//        JLabel npm = new JLabel("NPM    =     06.2018.1.06992");
//        npm.setFont(new Font("Times New Roman",Font.BOLD,20));
//        npm.setForeground(Color.WHITE);
//        npm.setBounds(30,100,300,30);
//        mainframe.add(npm);
        
        JLabel x = new JLabel("X0");
        JLabel y = new JLabel("Y0");
        JLabel jari = new JLabel("JARI2");
        
        x.setBounds(30,135,40,30);
        x.setForeground(Color.WHITE);
        mainframe.add(x);
        
        y.setBounds(30,170,40,30);
        y.setForeground(Color.WHITE);
        mainframe.add(y);
        
        jari.setBounds(30,205,40,30);
        jari.setForeground(Color.WHITE);
        mainframe.add(jari);
        
        JTextField xtext = new JTextField();
        xtext.setBackground(Color.CYAN);
        xtext.setForeground(Color.BLACK);
        xtext.setBounds(75,135,300,30);
        mainframe.add(xtext);
        
        JTextField ytext = new JTextField();
        ytext.setBackground(Color.CYAN);
        ytext.setForeground(Color.BLACK);
        ytext.setBounds(75,170,300,30);
        mainframe.add(ytext);
        
        JTextField jaritext = new JTextField();
        jaritext.setBackground(Color.CYAN);
        jaritext.setForeground(Color.BLACK);
        jaritext.setBounds(75,205,300,30);
        mainframe.add(jaritext);
        
        JButton tombol = new JButton("excecute");
        tombol.setBounds(180,250,100,40);
        tombol.setBackground(Color.GREEN);
        tombol.setForeground(Color.WHITE);
        mainframe.add(tombol);
        
        tombol.addKeyListener(new KeyAdapter(){
      		public void keyPressed(KeyEvent key){
	      		if(key.getKeyChar() == KeyEvent.VK_ENTER)
	      			tombol.doClick();
	      	}
	});

        
        tombol.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
               try{
               statik.algoritma.setxo(Integer.parseInt(xtext.getText()));
               statik.algoritma.setyo(Integer.parseInt(ytext.getText()));
               statik.algoritma.setjari2(Integer.parseInt(jaritext.getText()));
               viewframe alh = new viewframe();
               xtext.setText(null);
               ytext.setText(null);
               jaritext.setText(null);
               }
               catch(Exception e){
                   JOptionPane.showMessageDialog(null, "input harus angka");
               }
            }
        });
        
        mainframe.setLayout(null);
        mainframe.setVisible(true);
        mainframe.setLocationRelativeTo(null);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
