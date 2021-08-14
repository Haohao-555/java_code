package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Student;

public class Stuqingjia extends JFrame implements ActionListener{

	/**
	 * @param args
	 */
	private JButton found = new JButton("≤È—Ø");
	private JButton qingjia = new JButton("«ÎºŸ");
	String []users=new String [2];
	JLabel beijing= new JLabel(new ImageIcon(".\\images\\zhujiemian.jpg"));
	public Stuqingjia(Student user)
	{
		users[0]=user.getName();
		users[1]=user.getNumber();
		this.setTitle("«ÎºŸœµÕ≥");
		this.setLocation(700, 245);
		this.setSize(300, 400);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		found.setBounds(90,100, 100, 30);
		beijing.setBounds(0,0,300,400);
		this.setIconImage(new ImageIcon("./images/zdnf.png").getImage());
		qingjia.setBounds(90,200, 100, 30);
		this.add(found);
		this.add(qingjia);
		this.add(beijing);
		found.addActionListener(this);
		qingjia.addActionListener(this);
		setResizable(false);
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==qingjia)
		{
			new Stuqingjiatiao(users[0],users[1]);
			this.dispose();
		}
		else if(e.getSource()==found)
		{
			new CheckrequestMenu(users[0],users[1]);
			this.dispose();
		}
	}

}
