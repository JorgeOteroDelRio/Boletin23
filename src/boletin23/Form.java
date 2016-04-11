/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author jota
 */
public class Form extends JFrame{
    private JPanel panel1_pnl;
    private JLabel nome_lbl;
    private JLabel password_lbl;
    private JTextField nome_txt;
    private JPasswordField password_ptxt;
    private JButton premer_btn;
    private JButton limpar_btn;
    private JPanel panel2_pnl;
    private JList lista_lst;
    private JButton boton_btn;
    private JTextArea area_txtarea;
    
    public Form(){
        this.setLayout(null);
        setTitle("Mi formulario");
        panel1_pnl=new JPanel();
        panel2_pnl=new JPanel();
        panel1_pnl.setBounds(0,0,300, 150);
        panel2_pnl.setBounds(0,150,300, 150);
        panel1_pnl.setLayout(null);
        panel2_pnl.setLayout(null);
        nome_lbl=new JLabel("Nome:");
        password_lbl=new JLabel("Password:");
        premer_btn=new JButton("Premer");
        limpar_btn=new JButton("Limpar");
        nome_txt=new JTextField(15);
        password_ptxt=new JPasswordField(15);
        DefaultListModel model = new DefaultListModel();
        model.addElement("Hola");
        model.addElement(4);
        model.addElement("Hacker");
        lista_lst=new JList(model);
        setBackground(Color.black);
        boton_btn=new JButton("Boton");
        area_txtarea=new JTextArea();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,50,300,300);
        nome_lbl.setBounds(80, 10, 50, 20);
        password_lbl.setBounds(50, 50, 80, 20);
        nome_txt.setBounds(140, 10, 100, 20);
        password_ptxt.setBounds(140, 50, 100, 20);
        premer_btn.setBounds(50, 90, 90, 20);
        limpar_btn.setBounds(150, 90, 90, 20);
        lista_lst.setBounds(20, 10, 80, 100);
        boton_btn.setBounds(110, 50, 90, 20);
        area_txtarea.setBounds(210, 30, 80, 60);
        panel1_pnl.add(nome_lbl);
        panel1_pnl.add(nome_txt);
        panel1_pnl.add(password_lbl);
        panel1_pnl.add(password_ptxt);
        panel1_pnl.add(premer_btn);
        panel1_pnl.add(limpar_btn);
        panel2_pnl.add(lista_lst);
        panel2_pnl.add(boton_btn);
        panel2_pnl.add(area_txtarea);
        add(panel1_pnl);
        add(panel2_pnl);
        setResizable(false);
        setVisible(true);
    }
}
