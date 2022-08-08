import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.applet.*;
import java.net.*;

class Home extends JFrame
{

    protected static final int JOprionPAne = 0;
	//Inisialisasi
    protected JLabel labelusername,labelCopyright;
    protected JTextField inputNama;
    protected JButton btnSave,btnStart,btnExit,btnHelp,btnAbout,btnHScore,btnOption;
    private JPanel panelHome;
    private Container c;
     
    public Home() 
    {
        super("SAMUDERANESIA");
        setSize(800, 600);
        setLocation(50, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
		//Membuat objek
		//JLABEL        
		labelCopyright = new JLabel("Copyright © AFTer, IT USU 2015");
		labelCopyright.setFont(new Font("Calibri",Font.PLAIN,12));
		labelCopyright.setForeground(Color.BLACK);
		labelCopyright.setBounds(308,530,600,40);
		labelCopyright.setOpaque(false);
		
        btnStart = new JButton("MULAI");
		btnStart.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnStart.setBounds(125,140,180,45);
		btnStart.setForeground(Color.BLUE);
		btnStart.setBackground(Color.white);
		btnStart.setOpaque(true);
		btnStart.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
				 if (JOptionPane.showConfirmDialog(null," apakah kamu ingin mengikuti pelatihan?","SAMUDERANESIA", JOptionPane.YES_OPTION)== JOptionPane.YES_OPTION)
						{
						 	dispose();
							new Tutorial().setVisible(true);
						}
				 else 
						{
						 	dispose();
						 	new Start().setVisible(true);
						}
				

			}
		});
				
		btnHScore = new JButton("NILAI TERTINGGI");
		btnHScore.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnHScore.setBounds(125,195,180,45);
		btnHScore.setForeground(Color.BLUE);
		btnHScore.setBackground(Color.white);
		btnHScore.setOpaque(true);
		btnHScore.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					dispose();
					HScore test = new HScore();
					test.setVisible(true);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		btnHelp = new JButton("BANTUAN");
		btnHelp.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnHelp.setBounds(125,250,180,45);
		btnHelp.setForeground(Color.BLUE);
		btnHelp.setBackground(Color.white);
		btnHelp.setOpaque(true);
		btnHelp.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
				new Help().setVisible(true);
			}
		});
		
		btnOption = new JButton("PENGATURAN");
		btnOption.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnOption.setBounds(125,305,180,45);
		btnOption.setForeground(Color.BLUE);
		btnOption.setBackground(Color.white);
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
		
		
		btnAbout = new JButton("TENTANG KAMI");
		btnAbout.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnAbout.setBounds(125,360,180,45);
		btnAbout.setForeground(Color.BLUE);
		btnAbout.setBackground(Color.white);
		btnAbout.setOpaque(true);
		btnAbout.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					dispose();
					About test = new About();
					test.setVisible(true);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		btnExit = new JButton("KELUAR");
		btnExit.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnExit.setBounds(125,415,180,45);
		btnExit.setForeground(Color.BLUE);
		btnExit.setBackground(Color.white);
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
		
        
		//Memasukkan ke panel
        panelHome = new bgHome();
        panelHome.setLayout(null);
        panelHome.add(labelCopyright);
        panelHome.add(btnStart);
        panelHome.add(btnHelp);
        panelHome.add(btnAbout);
        panelHome.add(btnHScore);
        panelHome.add(btnOption);
        panelHome.add(btnExit);
        panelHome.setOpaque(false);
        
        //Memasukkan ke container
        c = new Container();
        c = getContentPane();
        c.add(panelHome);
 
        setVisible(true);
    }

	protected int Home() {
		// TODO Auto-generated method stub
		return 0;
	}
}