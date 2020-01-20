/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bressenham;

/**
 *
 * @author ALAN
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class bunder extends JPanel{    
    int xo,yo,jari2;

    public bunder(){
        
    }
    
    public void setxo(int x) {
        xo = x;
    }
    public void setyo(int y) {
        yo = y;
    }
    public void setjari2(int jari2) {
        this.jari2 = jari2;
    }

    @Override
    public void paint(Graphics koordinat) {     
        int pk =  1-jari2;
        int x=0; 
        int y = jari2;
        
        super.paint(koordinat);
        this.setBackground(Color.BLACK);
        koordinat.setColor(Color.WHITE);
        
        do{
            x++;
            if(pk<0){
               pk=pk+2*x+1;
            }else{
                y--;
                pk=pk+2*(x-y)+1;
            }
           
            koordinat.drawRect(xo+x, yo+y, 5, 5);
            koordinat.drawRect(xo-x, yo+y, 5, 5);
            koordinat.drawRect(xo+x, yo-y, 5, 5);
            koordinat.drawRect(xo-x, yo-y, 5, 5);
            koordinat.drawRect(xo+y, yo+x, 5, 5);
            koordinat.drawRect(xo-y, yo+x, 5, 5);
            koordinat.drawRect(xo+y, yo-x, 5, 5);
            koordinat.drawRect(xo-y, yo-x, 5, 5);
        }while(x<=y);
    }
    
}
