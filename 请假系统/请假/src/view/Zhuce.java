package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.sql.SQLException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.Student;

public class Zhuce extends JFrame implements ActionListener{

	/**
	 * @param args
	 */
	private JTextField faccount = new JTextField(10);
	private JPasswordField fpassword = new JPasswordField(10);
	private JTextField fstuid = new JTextField(10);
	private JButton back = new JButton("返回");
	private JButton zhuce = new JButton("注册");
	JLabel zhanghaolabel = new JLabel("用户名");
	JLabel mimalabel = new JLabel("密码");
	Font font=new Font("宋体",Font.BOLD,20);
	JLabel stuid = new JLabel("学号");
	JLabel beijing= new JLabel(new ImageIcon(".\\images\\zhuce.png"));
	private Icon Back=new ImageIcon(".\\images\\return.png");
	public Zhuce()
	{
		this.setTitle("注册");
		this.setLocation(700,245);
		this.setSize(400, 400);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		beijing.setBounds(0,0,400,400);
		zhanghaolabel.setBounds(100,50, 100, 30);
		faccount.setBounds(150,50, 100, 30);
		mimalabel.setBounds(100,100, 100, 30);
		fpassword.setBounds(150,100, 100, 30);
		stuid.setBounds(100,150, 100, 30);
		fstuid.setBounds(150,150, 100, 30);
		zhuce.setBounds(50,200, 100, 30);
		back.setBounds(200,200, 100, 30);
		this.setIconImage(new ImageIcon("./images/zdnf.png").getImage());
		this.back.setIcon(Back);
		zhuce.addActionListener(this);
		back.addActionListener(this);
		this.add(zhanghaolabel);
		this.add(mimalabel);
		this.add(faccount);
		this.add(fpassword);
		this.add(stuid);
		this.add(fstuid);
		this.add(zhuce);
		this.add(back);
		this.add(beijing);
		setResizable(false);
		this.setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==zhuce){
		String name=faccount.getText();
		String password=fpassword.getText();
		String number=fstuid.getText();
		try {
			Student.zhuce(name, password, number);
			this.dispose();
			JOptionPane.showMessageDialog(this, "学生注册成功");
			new Jiemian();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
else if(e.getSource()==back){
	new Jiemian();
	this.dispose();
}
}
}