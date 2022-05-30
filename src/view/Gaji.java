/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author ASUS
 */
public class Gaji extends JFrame{
  JLabel ljudul = new JLabel("Update Data Karyawan");
    
    JLabel lnama = new JLabel("Nama");
    public final JTextField fnama = new JTextField(10);
    
    public final JTextField fcek = new JTextField(10);
    
    JLabel lusia = new JLabel("Usia");
    public final JTextField fusia= new JTextField(10);
    
    JLabel lgaji = new JLabel("Gaji");
    public final JTextField fgaji = new JTextField(10);
    
    JLabel llembur = new JLabel("Lembur");
    public final JTextField flembur = new JTextField(10);
    
    public JButton btotal = new JButton("Total Gaji");
    public JButton bhapus = new JButton("Hapus");
    
    public JButton bkembali = new JButton("Kembali");
    
     public Gaji(){
        setTitle("Update Karyawan");
        setSize(300,230);
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(fnama);
        add(lusia);
        add(fusia);
        add(lgaji);
        add(fgaji);
        add(llembur);
        add(flembur);
        add(btotal);
        add(bhapus); 
        add(bkembali);
        
        
        
        ljudul.setBounds(15,5,200,20);
        lnama.setBounds(15,30,120,20);
        fnama.setBounds(55,30,200,20);
        
        
        
        lusia.setBounds(15,60,120,20);
        fusia.setBounds(55,60,200,20);
        
        
        
        lgaji.setBounds(15,90,120,20);
        fgaji.setBounds(55,90,200,20);
        
        
        llembur.setBounds(15,120,120,20);
        flembur.setBounds(55,120,200,20);
        
        
        btotal.setBounds(55,130,90,20);
        btotal.setBackground(Color.green);
        btotal.setForeground(Color.white);
        bhapus.setBounds(155,130,90,20);
        bhapus.setBackground(Color.red);
        bhapus.setForeground(Color.white);
        bkembali.setBounds(15,165,250,20);
        bkembali.setBackground(Color.blue);
        bkembali.setForeground(Color.white);
        
        
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
      
}
