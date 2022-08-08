import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Tutorial extends JFrame
{
	private JPanel panelTutorial,panelMenu;
	protected JLabel labelCopyright,labelCopyrightb2;
	private JButton btnBack,btnExit,btnHelp,btnOption,btnRetry;
	private Container c;
	
	public Tutorial()
	{
		super("SAMUDERANESIA");
        setSize(800, 600);
        setLocation(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        	
        panelMenu = new JPanel();
        panelMenu.setBounds(665,0,140,600);
        panelMenu.setBackground(Color.WHITE);
        panelMenu.setOpaque(true);
        
		btnBack = new JButton("Menu");
		btnBack.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnBack.setBounds(675,170,110,40);
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.BLUE);
		btnBack.setOpaque(true);
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (JOptionPane.showConfirmDialog(null,"Apakah kamu yakin ingin mengakhiri permainan dan kembali ke menu utama?","SAMUDERANESIA", JOptionPane.YES_OPTION)== JOptionPane.YES_OPTION)
				{
					dispose();
					new Home().setVisible(true);
				}
			}
		});
		
		btnRetry = new JButton("Ulang");
		btnRetry.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnRetry.setBounds(675,225,110,40);
		btnRetry.setForeground(Color.WHITE);
		btnRetry.setBackground(Color.BLUE);
		btnRetry.setOpaque(true);
		btnRetry.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (JOptionPane.showConfirmDialog(null,"Apakah kamu yakin ingin mengulang level ini?","SAMUDERANESIA", JOptionPane.YES_OPTION)== JOptionPane.YES_OPTION)
				{
					dispose();
					new Start().setVisible(true);
				}
			}
		});
		
		btnHelp = new JButton("Bantuan");
		btnHelp.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnHelp.setBounds(675,280,110,40);
		btnHelp.setForeground(Color.WHITE);
		btnHelp.setBackground(Color.BLUE);
		btnHelp.setOpaque(true);
		btnHelp.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
				new Help().setVisible(true);
			}
		});
		
		btnOption = new JButton("Pengaturan");
		btnOption.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnOption.setBounds(675,335,110,40);
		btnOption.setForeground(Color.WHITE);
		btnOption.setBackground(Color.BLUE);
		btnOption.setOpaque(true);
		btnOption.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					dispose();
					Options test = new Options();
					test.setVisible(true);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});	
		
		btnExit = new JButton("Keluar");
		btnExit.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnExit.setBounds(675,390,110,40);
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLUE);
		btnExit.setOpaque(true);
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if ( JOptionPane.showConfirmDialog(null," apakah kamu yakin ingin meninggalkan para nelayan?","GO! GO! Indoensia!", JOptionPane.YES_OPTION)	== JOptionPane.YES_OPTION)
					{
					 	System.exit(0);
					}
			}
		});
		
		labelCopyright = new JLabel("Copyright © AFTer,");
		labelCopyright.setFont(new Font("Calibri",Font.PLAIN,12));
		labelCopyright.setForeground(Color.BLACK);
		labelCopyright.setBounds(685,515,600,40);
		labelCopyright.setOpaque(false);
		
		labelCopyrightb2 = new JLabel("IT USU 2015");
		labelCopyrightb2.setFont(new Font("Calibri",Font.PLAIN,12));
		labelCopyrightb2.setForeground(Color.BLACK);
		labelCopyrightb2.setBounds(700,535,600,40);
		labelCopyrightb2.setOpaque(false);
		
		
        //Memasukkan ke panel
		panelTutorial = new bgTutorial();
		panelTutorial.setLayout(null);
		panelTutorial.add(labelCopyright);
		panelTutorial.add(labelCopyrightb2);
		panelTutorial.add(panelMenu);
		panelTutorial.add(btnBack);
		panelTutorial.add(btnRetry);
		panelTutorial.add(btnHelp);
		panelTutorial.add(btnOption);
		panelTutorial.add(btnExit);
		panelTutorial.setOpaque(false);
		panelTutorial.setSize(750, 500);
		panelTutorial.setBackground(Color.WHITE);
        
        //Memasukkan ke container
        c = new Container();
        c = getContentPane();
        c.add(panelTutorial);
 
        setVisible(true);
	}
}
