package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import model.Request;
import model.Student;



public class Stuqingjiatiao extends JFrame implements ActionListener{
	/**
	 * @param args
	 */
	private JButton affirmbutton= new JButton("ȷ  ��");
	private JButton cancelbutton = new JButton("�� ��");
	private JButton returnbutton = new JButton("�� ��");
	JLabel qingjiatiao=new JLabel("�����");
	JLabel reason=new JLabel("ԭ��:");
	JLabel stuid=new JLabel("ѧ��:");
	JLabel name=new JLabel("����:");
	JLabel course=new JLabel("�γ�:");
	JLabel coursetime=new JLabel("�Ͽ�ʱ��:");
	JLabel courseteacher=new JLabel("�γ���ʦ:");
	JLabel requesttime=new JLabel("���ʱ��:");
	JLabel beijing= new JLabel(new ImageIcon(".\\images\\qingjia.jpg"));
	JTextField reafield = new JTextField(10);
	JTextField stufield = new JTextField(10);
	JTextField namefield = new JTextField(10);
	JTextField coursefield = new JTextField(10);
	JTextArea reasonfield = new JTextArea();
	JTextField courseteacherfield = new JTextField(10);
	JTextField coursetimefield = new JTextField(10);
	JTextField requesttimefield = new JTextField(10);
	String []users=new String [2];
	public Stuqingjiatiao(String username,String number){
		this.setTitle("ѧ�����ϵͳ");
		this.setLocation(600, 220);
		this.setSize(600,500);
		this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		qingjiatiao.setBounds(250, 0,80,65);
		affirmbutton.setBounds(0,400,100,60);
		returnbutton.setBounds(485,400,100,60);
		cancelbutton.setBounds(250,400,100,60);
		beijing.setBounds(0,0,600,500);
		stuid.setBounds(0,50,50,50);
		stufield.setBounds(50,60,100,30);
		name.setBounds(170,50,50,50);
		namefield.setBounds(220,60,80,30);
		course.setBounds(340,50,50,50);
		coursefield.setBounds(390,60,80,30);
		reason.setBounds(0,90,50,50);
		reasonfield.setBounds(50,100,500,200);
		coursetime.setBounds(0,310,100,50);
		coursetimefield.setBounds(90,320,80,30);
		requesttime.setBounds(180,310,100,50);
		requesttimefield.setBounds(260,320,80,30);
		courseteacher.setBounds(350,310,100,50);
		courseteacherfield.setBounds(430,320,80,30);
		namefield.setText(username);
		stufield.setText(number);
		namefield.setEditable(false);
		stufield.setEditable(false);
		qingjiatiao.setFont(new Font("����",Font.BOLD, 25));
		stuid.setFont(new Font("����",Font.BOLD, 17));
		name.setFont(new Font("����",Font.BOLD, 17));
		course.setFont(new Font("����",Font.BOLD, 17));
		reason.setFont(new Font("����",Font.BOLD, 17));
		requesttime.setFont(new Font("����",Font.BOLD, 17));
		coursetime.setFont(new Font("����",Font.BOLD, 17));
		courseteacher.setFont(new Font("����",Font.BOLD, 17));
		this.setIconImage(new ImageIcon("./images/zdnf.png").getImage());
		this.add(qingjiatiao);
		this.add(affirmbutton);
		this.add(cancelbutton);
		this.add(returnbutton);
		this.add(stuid);
		this.add(stufield);
		this.add(name);
		this.add(namefield);
		this.add(course);
		this.add(coursefield);
		this.add(reason);
		this.add(reasonfield);
		this.add(coursetime);
		this.add(coursetimefield);
		this.add(requesttime);
		this.add(requesttimefield);
		this.add(courseteacher);
		this.add(courseteacherfield);
		this.add(beijing);
		coursetimefield.setToolTipText("�磺������12-13");
		setResizable(false);
		this.setVisible(true);
		cancelbutton.addActionListener(this);
		affirmbutton.addActionListener(this);
		returnbutton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cancelbutton)
		{
			 reafield.setText("") ;
			 coursefield.setText("");
			 reasonfield .setText("");
			 courseteacherfield.setText("");
			 coursetimefield.setText("");
			 requesttimefield.setText("");
		}else if(e.getSource()==affirmbutton){
			String name=namefield.getText();
			String number=stufield.getText();
			String course=coursefield.getText();
			String coursetime=coursetimefield.getText();
			String requesttime=requesttimefield.getText();
			String courseteacher=courseteacherfield.getText();
			String because=reasonfield.getText();
			String situations="δ����";
			Request request=new Request(name,course,coursetime,courseteacher,because,requesttime,null,0,situations,number);
			try {
				Student.request(request);
				JOptionPane.showMessageDialog(this, "��ٳɹ�");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==returnbutton){
			Student user=new Student(0,users[0],"111","0",users[1]);
			this.dispose();
			new Stuqingjia(user);
		}
	}
	
}