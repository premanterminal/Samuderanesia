import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class About extends JFrame
{
	private JPanel panelAbout;
	protected JLabel labelCopyright;
	private JButton btnBack;
	private Container c;
	
	public About()
	{
		super("SAMUDERANESIA");
        setSize(800, 600);
        setLocation(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        	
		btnBack = new JButton("KEMBALI");
		btnBack.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnBack.setBounds(350,450,100,40);
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
		panelAbout = new bgAbout();
		panelAbout.setLayout(null);
		panelAbout.add(btnBack);
		panelAbout.add(labelCopyright);
		panelAbout.setOpaque(false);
		panelAbout.setSize(750, 500);
		panelAbout.setBackground(Color.WHITE);
        
        //Memasukkan ke container
        c = new Container();
        c = getContentPane();
        c.add(panelAbout);
 
        setVisible(true);
	}
}
