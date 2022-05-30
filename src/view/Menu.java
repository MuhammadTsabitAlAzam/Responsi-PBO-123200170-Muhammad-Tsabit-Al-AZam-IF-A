/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.kontrol;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import koneksi.connection;
import model.modelKaryawan;
import view.Tampil;
/**
 *
 * @author ASUS
 */
public class Menu extends JFrame implements ActionListener{

     JLabel ljudul = new JLabel(" Main Menu ");

   public JButton btambah = new JButton("Tambah Karyawan");
   public JButton blihat = new JButton("Lihat Karyawan");
   private Object ScrollPane;


    public Menu(){
        setSize(200,160);
        setLayout(null);
        add(ljudul);
        add(blihat);
        add(btambah);

        ljudul.setBounds(35,5,200,20);


        btambah.setBounds(0,25,150,20);
        blihat.setBounds(0,45,150,20);
        
        btambah.addActionListener(this);
        blihat.addActionListener(this);


        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btambah){
           Tampil tam = new Tampil();
           tam.dispose();
           dispose();
           Input in = new Input();
           Edit edit = new Edit();
           edit.dispose();
           modelKaryawan model = new modelKaryawan();
           kontrol ct = new kontrol(tam, model,in,edit);
          
        }
        if(e.getSource() == blihat){
            Tampil tam = new Tampil();
           Input in = new Input();
           in.dispose();
           Edit edit = new Edit();
           edit.dispose();
           modelKaryawan model = new modelKaryawan();
           kontrol ct = new kontrol(tam, model,in,edit);
        }

    }
}
