import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TTTHome extends JFrame {

	private JPanel contentPane;
	private JTextField txtXcount;
	private JTextField txtOcount;
	private int xcount;
	private int ocount;
	private  String startGame ="X"; 
	private int b1=10;
	private int b2=10;
	private int b3=10;
	private int b4=10;
	private int b5=10;
	private int b6=10;
	private int b7=10;
	private int b8=10;
	private int b9=10;
	private int n=0;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TTTHome frame = new TTTHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
public void winGame()
{
	//For X
	
	if(b1==1 && b2==1 && b3==1)
	{
		JOptionPane.showMessageDialog(null, "Player X is Winner");
		xcount++;
		txtXcount.setText(String.valueOf(xcount));
	}
	else if(b4==1 && b5==1 && b6==1)
	{
		JOptionPane.showMessageDialog(null, "Player X is Winner");
		xcount++;
		txtXcount.setText(String.valueOf(xcount));
	}
	else if(b7==1 && b8==1 && b9==1)
	{
		JOptionPane.showMessageDialog(null, "Player X is Winner");
		xcount++;
		txtXcount.setText(String.valueOf(xcount));
	}
	else if(b1==1 && b4==1 && b7==1)
	{
		JOptionPane.showMessageDialog(null, "Player X is Winner");
		xcount++;
		txtXcount.setText(String.valueOf(xcount));
	}
	else if(b2==4 && b5==1 && b8==1)
	{
		JOptionPane.showMessageDialog(null, "Player X is Winner");
		xcount++;
		txtXcount.setText(String.valueOf(xcount));
	}
	else if(b1==1 && b6==1 && b9==1)
	{
		JOptionPane.showMessageDialog(null, "Player X is Winner");
		xcount++;
		txtXcount.setText(String.valueOf(xcount));
	}
	else if(b1==1 && b5==1 && b9==1)
	{
		JOptionPane.showMessageDialog(null, "Player X is Winner");
		xcount++;
		txtXcount.setText(String.valueOf(xcount));
	}
	else if(b3==1 && b6==1 && b7==1)
	{
		JOptionPane.showMessageDialog(null, "Player X is Winner");
		xcount++;
		txtXcount.setText(String.valueOf(xcount));
	}
	
	//For O
	
	if(b1==0 && b2==0 && b3==0)
	{
		JOptionPane.showMessageDialog(null, "Player O is Winner");
		ocount++;
		txtOcount.setText(String.valueOf(ocount));
	}
	else if(b4==0 && b5==0 && b6==0)
	{
		JOptionPane.showMessageDialog(null, "Player O is Winner");
		ocount++;
		txtOcount.setText(String.valueOf(ocount));
	}
	else if(b7==0 && b8==0 && b9==0)
	{
		JOptionPane.showMessageDialog(null, "Player O is Winner");
		ocount++;
		txtOcount.setText(String.valueOf(ocount));
	}
	else if(b1==0 && b4==0 && b7==0)
	{
		JOptionPane.showMessageDialog(null, "Player O is Winner");
		ocount++;
		txtOcount.setText(String.valueOf(ocount));
	}
	else if(b2==0 && b5==0 && b8==0)
	{
		JOptionPane.showMessageDialog(null, "Player O is Winner");
		ocount++;
		txtOcount.setText(String.valueOf(ocount));
	}
	else if(b1==0 && b6==0 && b9==0)
	{
		JOptionPane.showMessageDialog(null, "Player O is Winner");
		ocount++;
		txtOcount.setText(String.valueOf(ocount));
	}
	else if(b1==0 && b5==0 && b9==0)
	{
		JOptionPane.showMessageDialog(null, "Player O is Winner");
		ocount++;
		txtOcount.setText(String.valueOf(ocount));
	}
	else if(b3==0 && b6==0 && b7==0)
	{
		JOptionPane.showMessageDialog(null, "Player O is Winner");
		ocount++;
		txtOcount.setText(String.valueOf(ocount));
	}
	
	
	else if(n==9)
	{
		
		JOptionPane.showMessageDialog(null, "Its A Tie");
		
	}
		
	
	
	}
	
public 	 void changePlayer()
	{
		
	if(startGame.equalsIgnoreCase("X"))
	{
	startGame="O";
	}
	else {
		startGame="X";
	}
	}
	public TTTHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblPx = new JLabel("Player X");
		lblPx.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPx.setHorizontalAlignment(SwingConstants.CENTER);
		lblPx.setBounds(0, 0, 112, 97);
		panel_8.add(lblPx);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblPo = new JLabel("Player O");
		lblPo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPo.setBounds(0, 0, 112, 97);
		panel_9.add(lblPo);
		
			
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_10);
		panel_10.setLayout(null);
		
		txtOcount = new JTextField("0");
		txtOcount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtOcount.setBounds(0, 0, 112, 97);
		panel_10.add(txtOcount);
		txtOcount.setHorizontalAlignment(SwingConstants.CENTER);
		txtOcount.setColumns(10);
		

		JPanel panel_11 = new JPanel();
		panel.add(panel_11);
		panel_11.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_12);
		panel_12.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_13);
		panel_13.setLayout(null);
		
		txtXcount = new JTextField("0");
		txtXcount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtXcount.setHorizontalAlignment(SwingConstants.CENTER);
		txtXcount.setBounds(0, 0, 112, 97);
		panel_7.add(txtXcount);
		txtXcount.setColumns(10);
		
		JButton btnG7 = new JButton("");
		btnG7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnG7.setBounds(0, 0, 112, 97);
		panel_11.add(btnG7);
		btnG7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnG7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btnG7.setForeground(Color.BLUE);
					b7=1;
					n++;
				}
				else {
					btnG7.setForeground(Color.RED);
					b7=0;
					n++;
				}
				changePlayer();	
				winGame();
			}
		});
		
		
		JButton btnG1 = new JButton("");
		btnG1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnG1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnG1.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btnG1.setForeground(Color.BLUE);
					b1=1;
					n++;
				}
				else {
					btnG1.setForeground(Color.RED);
					b1=0;
					n++;
				}
				changePlayer();
				winGame();
			}
		});
		btnG1.setBounds(0, 0, 112, 97);
		panel_1.add(btnG1);
		
		JButton btnG2 = new JButton("");
		btnG2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnG2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnG2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btnG2.setForeground(Color.BLUE);
					b2=1;
					n++;
				}
				else {
					btnG2.setForeground(Color.RED);
					b2=0;
					n++;
				}
				changePlayer();
				winGame();
			}
		});
		btnG2.setBounds(0, 0, 112, 97);
		panel_5.add(btnG2);
		
		JButton btnG3 = new JButton("");
		btnG3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnG3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnG3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btnG3.setForeground(Color.BLUE);
					b3=1;
					n++;
				}
				else {
					btnG3.setForeground(Color.RED);
					b3=0;
					n++;
				}
				changePlayer();
				winGame();
			}
		});
		btnG3.setBounds(0, 0, 112, 97);
		panel_6.add(btnG3);
		
		JButton btnG4 = new JButton("");
		btnG4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnG4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnG4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btnG4.setForeground(Color.BLUE);
					b4=1;
					n++;
				}
				else {
					btnG4.setForeground(Color.RED);
					b4=0;
					n++;
				}
				changePlayer();
				winGame();
			}
		});
		btnG4.setBounds(0, 0, 112, 97);
	    panel_3.add(btnG4);
		
		JButton btnG5 = new JButton("");
		btnG5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnG5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnG5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btnG5.setForeground(Color.BLUE);
					b5=1;
					n++;
				}
				else {
					btnG5.setForeground(Color.RED);
					b5=0;
					n++;
				}
				changePlayer();
				winGame();
			}
		});
		btnG5.setBounds(0, 0, 112, 97);
		panel_2.add(btnG5);
	    
		JButton btnG6 = new JButton("");
		btnG6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnG6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnG6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btnG6.setForeground(Color.BLUE);
					b6=1;
					n++;
				}
				else {
					btnG6.setForeground(Color.RED);
					b6=0;
					n++;
				}
				changePlayer();
				winGame();
			}
		});
		btnG6.setBounds(0, 0, 112, 97);
		panel_4.add(btnG6);
		
		JButton btnG8 = new JButton("");
		btnG8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnG8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnG8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btnG8.setForeground(Color.BLUE);
					b8=1;
					n++;
				}
				else {
					btnG8.setForeground(Color.RED);
					b8=0;
					n++;
				}
				changePlayer();	
				winGame();
			}
		});
		btnG8.setBounds(0, 0, 112, 97);
		panel_12.add(btnG8);
		
		JButton btnG9 = new JButton("");
		btnG9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnG9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnG9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btnG9.setForeground(Color.BLUE);
					b9=1;
					n++;
				}
				else {
					btnG9.setForeground(Color.RED);
					b9=0;
					n++;
				}
				changePlayer();
				winGame();
			}
		});
		btnG9.setBounds(0, 0, 112, 97);
		
		panel_13.add(btnG9);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_14);
		panel_14.setLayout(null);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnG1.setText(null);
				btnG2.setText(null);
				btnG3.setText(null);
				btnG4.setText(null);
				btnG5.setText(null);
				btnG6.setText(null);
				btnG7.setText(null);
				btnG8.setText(null);
				btnG9.setText(null);
				
				
				b1=10;
				b2=10;
				b3=10;
				b4=10;
				b5=10;
				b6=10;
				b7=10;
				b8=10;
				b9=10;
				
				n=0;
				
			}
		});
		btnReset.setBounds(0, 0, 112, 97);
		panel_14.add(btnReset);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_15);
		panel_15.setLayout(null);
		
		JButton btnEXIT = new JButton("EXIT");
		btnEXIT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int i=	JOptionPane.showConfirmDialog(null, "Want To Exit");
			if(i==0)
			{
				TTTHome.this.dispose();
			}
			}
		});
		btnEXIT.setBounds(0, 0, 112, 97);
		panel_15.add(btnEXIT);
	}
}
