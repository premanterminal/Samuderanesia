import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Options extends JFrame
{
	private JPanel panelOptions;
	protected JLabel labelCopyright, labelMusic, labelSounds, labelLanguage;
	private JButton btnBack,btnSave;
	private JComboBox cmbLanguage;
	private Container c;
	
	public Options()
	{
		super("SAMUDERANESIA");
        setSize(800, 600);
        setLocation(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        labelMusic = new JLabel("Musik");
        labelMusic.setFont(new Font("Vivaldi",Font.BOLD,32));
        labelMusic.setForeground(Color.BLACK);
        labelMusic.setBounds(220,180,600,40);
        labelMusic.setOpaque(false);
        
        labelSounds = new JLabel("Suara");
        labelSounds.setFont(new Font("Vivaldi",Font.BOLD,32));
        labelSounds.setForeground(Color.BLACK);
        labelSounds.setBounds(220,255,600,40);
        labelSounds.setOpaque(false);
        
        labelLanguage = new JLabel("Bahasa");
        labelLanguage.setFont(new Font("Vivaldi",Font.BOLD,32));
        labelLanguage.setForeground(Color.BLACK);
        labelLanguage.setBounds(220,330,600,40);
        labelLanguage.setOpaque(false);
        
        cmbLanguage = new JComboBox();
        cmbLanguage.addItem("Indonesia");
        cmbLanguage.addItem("English");
        cmbLanguage.setFont(new Font("Vivaldi",Font.BOLD,22));
        cmbLanguage.setForeground(Color.BLACK);
        cmbLanguage.setBounds(370,330,200,40);
        
        btnSave = new JButton("UBAH");
        btnSave.setFont(new Font("Comic Sans MS",Font.BOLD,14));
        btnSave.setBounds(270,450,100,40);
        btnSave.setForeground(Color.WHITE);
        btnSave.setBackground(Color.BLUE);
        btnSave.setOpaque(true);
        /*btnSave.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
				new Home().setVisible(true);
			}
		});*/
        
		btnBack = new JButton("KEMBALI");
		btnBack.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnBack.setBounds(450,450,100,40);
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.BLUE);
		btnBack.setOpaque(true);
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
				new Home().setVisible(true);
			}
		});
		
		labelCopyright = new JLabel("Copyright © AFTer, IT USU 2015");
		labelCopyright.setFont(new Font("Calibri",Font.PLAIN,12));
		labelCopyright.setForeground(Color.BLACK);
		labelCopyright.setBounds(325,540,600,40);
		labelCopyright.setOpaque(false);
		
        //Memasukkan ke panel
		panelOptions = new bgOptions();
		panelOptions.setLayout(null);
		panelOptions.add(btnBack);
		panelOptions.add(btnSave);
		panelOptions.add(labelMusic);
		panelOptions.add(labelSounds);
		panelOptions.add(labelLanguage);
		panelOptions.add(cmbLanguage);
		panelOptions.add(labelCopyright);
		panelOptions.setOpaque(false);
		panelOptions.setSize(750, 500);
		panelOptions.setBackground(Color.WHITE);
        
        //Memasukkan ke container
        c = new Container();
        c = getContentPane();
        c.add(panelOptions);
 
        setVisible(true);
	}
}
