/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

/**
 *
 * @author RadwaN RomY
 */
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        splashscreen ob = new splashscreen();
        ob.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
            Thread.sleep(0x3c);
            ob.lbl.setText(Integer.toString(i)+"%");
            ob.bar.setValue(i);
            login lg= new login();
            if(i==100){
                System.out.println("Welcome To Our Admin Panel");
                lg.setVisible(true);
                ob.setVisible(false);
            }
       }
    }catch(Exception e){}
    }  
}
