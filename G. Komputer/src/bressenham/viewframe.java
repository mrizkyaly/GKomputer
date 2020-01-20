/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bressenham;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author ALAN
 */
public class viewframe {
    public viewframe(){
        JFrame jf = new JFrame("BUNDERR");
        jf.setSize(600, 600);
        JButton back = new JButton("kembali");
        back.setBounds(30,520,100,30);
        back.setBackground(Color.red);
        back.setForeground(Color.WHITE);
        jf.add(back);
        jf.add(statik.algoritma);
        back.addKeyListener(new KeyAdapter(){
      		public void keyPressed(KeyEvent key){
	      		if(key.getKeyChar() == KeyEvent.VK_ENTER)
	      			back.doClick();
	      	}
	});
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
               jf.setVisible(false);
            }
        });
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    
}
