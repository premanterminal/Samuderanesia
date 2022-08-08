import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class HScore extends JFrame
{
	private JPanel panelHScore;
	protected JLabel labelCopyright;
	private JButton btnBack,btnReset;
	private Container c;
	
	public HScore()
	{
		super("SAMUDERANESIA");
        setSize(800, 600);
        setLocation(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        btnReset = new JButton("RESET");
        btnReset.setFont(new Font("Comic Sans MS",Font.BOLD,14));
        btnReset.setBounds(240,450,100,40);
        btnReset.setForeground(Color.WHITE);
        btnReset.setBackground(Color.BLUE);
        btnReset.setOpaque(true);
        /*btnReset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
				new Home().setVisible(true);
			}
		});*/
        
		btnBack = new JButton("KEMBALI");
		btnBack.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		btnBack.setBounds(420,450,100,40);
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
		labelCopyright.setBounds(305,540,600,40);
		labelCopyright.setOpaque(false);
		
        //Memasukkan ke panel
		panelHScore = new bgHScore();
		panelHScore.setLayout(null);
		panelHScore.add(btnBack);
		panelHScore.add(btnReset);
		panelHScore.add(labelCopyright);
		panelHScore.setOpaque(false);
		panelHScore.setSize(750, 500);
		panelHScore.setBackground(Color.WHITE);
        
        //Memasukkan ke container
        c = new Container();
        c = getContentPane();
        c.add(panelHScore);
 
        setVisible(true);
	}
}
