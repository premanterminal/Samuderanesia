import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Help extends JFrame
{
	private JPanel panelHelp,panelIsi;
	protected JLabel labelCopyright;
	private JButton btnBack;
	private Container c;
	
	public Help()
	{
		super("SAMUDERANESIA");
        setSize(800, 600);
        setLocation(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        	
        panelIsi = new JPanel();
        panelIsi.setBounds(30,60,740,400);
        panelIsi.setBackground(Color.WHITE);
        panelIsi.setOpaque(true);
        
		btnBack = new JButton("KEMBALI");
		btnBack.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnBack.setBounds(350,470,100,40);
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
		
		labelCopyright = new JLabel("Copyright ? AFTer, IT USU 2015");
		labelCopyright.setFont(new Font("Calibri",Font.PLAIN,12));
		labelCopyright.setForeground(Color.WHITE);
		labelCopyright.setBounds(325,530,600,40);
		labelCopyright.setOpaque(false);
		
        //Memasukkan ke panel
		panelHelp = new bgHelp();
		panelHelp.setLayout(null);
		panelHelp.add(btnBack);
		panelHelp.add(labelCopyright);
		panelHelp.add(panelIsi);
		panelHelp.setOpaque(false);
		panelHelp.setSize(750, 500);
		panelHelp.setBackground(Color.WHITE);
        
        //Memasukkan ke container
        c = new Container();
        c = getContentPane();
        c.add(panelHelp);
 
        setVisible(true);
	}
}
