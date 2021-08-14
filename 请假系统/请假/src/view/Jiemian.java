package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import model.Student;

public class Jiemian extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JTextField faccount = new JTextField(10);
	private static JPasswordField fpassword = new JPasswordField(10);
	private JButton denglubutton = new JButton("���");
	private static JCheckBox checkBox=new JCheckBox("��ʾ����");
	private JButton chongzhibutton = new JButton("ע��");
	JLabel denglulabel = new JLabel("�û���:");
	JLabel mimalabel = new JLabel("����:");
	Font font=new Font("����",Font.BOLD,20);
	JLabel beijing= new JLabel(new ImageIcon(".\\images\\background.jpg"));
	String password,account;
	int mmjianyan,zhjianyan,identity=0;
	public Jiemian()
	{
		this.setTitle("���ϵͳ");
		this.setLocation(700, 245);
		this.setSize(300, 400);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		checkBox.setBounds(170,185,80,27);
		denglulabel.setFont(font);
		mimalabel.setFont(font);
		denglulabel.setBounds(50, 100, 100, 30);
		faccount.setBounds(150, 100, 100, 30);
		mimalabel.setBounds(70, 150, 100, 30);
		fpassword.setBounds(150, 150, 100, 30);
		denglubutton.setBounds(50, 230, 80, 30);
		chongzhibutton.setBounds(169, 230, 80,30);
		beijing.setBounds(0,0,300,400);
		this.getContentPane().add(fpassword);
		this.getContentPane().add(checkBox);
		this.setIconImage(new ImageIcon(".\\images\\zdnf.png").getImage());//Сͼ��
		this.add(mimalabel);
		this.add(denglulabel);
		this.add(faccount);
		this.add(fpassword);
		this.add(denglubutton);
		this.add(chongzhibutton);
		this.add(beijing);
		//����¼�����
		denglubutton.addActionListener(this);
		chongzhibutton.addActionListener(this);
		fpassword.addActionListener(this);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
	     if(e.getSource()==denglubutton){
			String name=faccount.getText();
			String password=fpassword.getText();
			try {
				Student user=Student.login(name,password);//��student��
				if(user.getType().equals("0")){
					JOptionPane.showMessageDialog(this, "ѧ����½�ɹ�");
					this.dispose();
					new Stuqingjia(user);
				}else if(user.getType().equals("1")){
					JOptionPane.showMessageDialog(this, "��ʦ��¼�ɹ�");
					this.dispose();
					new Chaxun(user);
				}else{
					JOptionPane.showMessageDialog(this, "����Ա��¼�ɹ�");
					this.dispose();
					new Chaxun(user);
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "�ܴa���Ñ����e�`");
			}
			
		}else if(e.getSource()==chongzhibutton){
			this.dispose();
			new Zhuce();
		}
		
	}
	public static void main(String[] args) {
		checkBox.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
					fpassword.setEchoChar((char)0);
				}
				else{fpassword.setEchoChar('*');}}});
		new Jiemian();
	}

}
