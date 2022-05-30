/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import karyawan.karyawan;
import model.modelKaryawan;
import view.Edit;
import view.Input;
import view.Menu;
import view.Tampil;
import view.Gaji;

/**
 *
 * @author ASUS
 */
public class kontrol {
    
    modelKaryawan modell;
    Tampil tampilVieww;
    Input inputt;
    Edit editt;
    
    public kontrol(Tampil tampilview, modelKaryawan model,Input input, Edit edit){
        this.modell = model;
        this.tampilVieww = tampilview;
        this.inputt = input;
        this.editt = edit;
        
        if(modell.getBanyakData()!=0){
            String dataKaryawan[][] = modell.readContact();
            tampilVieww.tabel.setModel((new JTable(dataKaryawan, tampilVieww.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        inputt.bSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = inputt.getNama();
                String usia = inputt.getUsia();
                String gaji =inputt.getGaji();
                model.insert(nama, usia, gaji);
         
                String dataKaryawan[][] = model.readContact();
                tampilVieww.tabel.setModel((new JTable(dataKaryawan, tampilVieww.namaKolom)).getModel());
            }
        });
         inputt.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.dispose();
                Menu m = new Menu();
                   
            }
        });
         
        inputt.bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputt.tNama.setText(null);
                inputt.tUsia.setText(null);  
                inputt.tGaji.setText(null);
            }
        });
        editt.bkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edit.dispose();
                

            }
        });
        tampilVieww.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilVieww.dispose();

            }
        });
        edit.bupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = edit.getNama();
                String cek = edit.getCek();
                String usia = edit.getUsia();
                String gaji =edit.getGaji();
                model.update(nama,cek, usia, gaji);
                edit.dispose();
            }
        });
        edit.bhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cek = edit.getCek();
                model.delete(cek);
                edit.dispose();
            }
        });
              tampilVieww.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = tampilVieww.tabel.getSelectedRow();
                
                String id = tampilVieww.tabel.getValueAt(baris, 0).toString();
                String nama = tampilVieww.tabel.getValueAt(baris, 1).toString();
                String usia = tampilVieww.tabel.getValueAt(baris, 2).toString();
                String gaji = tampilVieww.tabel.getValueAt(baris, 3).toString();
                
                tampilVieww.dispose();
                Edit edit = new Edit();
                edit.fnama.setText(nama);
                edit.fcek.setText(id);
                edit.fusia.setText(usia);
                edit.fgaji.setText(gaji);
                Tampil tam = new Tampil();
                tam.dispose();
                Input in = new Input();
                in.dispose();
                modelKaryawan model = new modelKaryawan();
                kontrol ct = new kontrol(tam,model,in,edit);
                System.out.println("");
                        
            }
        }
        );
    }
    
   
}
    
