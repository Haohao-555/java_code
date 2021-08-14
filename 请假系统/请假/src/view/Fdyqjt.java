package view;

import java.awt.Font;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.*;



public class Fdyqjt extends JFrame implements ActionListener{
	Request request=null;
	private JButton affirmbutton= new JButton("批准");
	private JButton cancelbutton = new JButton("驳回");
	private JButton modifiedbutton = new JButton("修 改");
	private JButton backbutton = new JButton("返回");
	JLabel qingjiatiao=new JLabel("请假条");
	JLabel reason=new JLabel("原因:");
	JLabel reason1=null;
	JLabel reason2=new JLabel("希望得到批准");
	JLabel stuid=new JLabel("学号:");
	JLabel stuid1=null;
	JLabel name=new JLabel("姓名:");
	JLabel name1=null;
	JLabel major=new JLabel("课程:");
	JLabel major1=null;
	JLabel time=new JLabel("提交申请时间:");
	JLabel time1=null;
	JLabel coursetime=new JLabel("上课时间:");
	JLabel coursetime1=null;
	JLabel requesttime=new JLabel("需要请假的时间:");
	JLabel requesttime1=null;
	JLabel beijing= new JLabel(new ImageIcon(".\\images\\chaxun.jpg"));
	String [] user=new String[3];
	
	public Fdyqjt(int id,String username,String upassword,String type){
		beijing.setBounds(0,0,800,800);
		user[0]=username;
		user[1]=upassword;
		user[2]=type;
		 try {
			request=Admin.viewrequest(id);
			reason1=new JLabel(request.getBecause());
			stuid1=new JLabel(request.getNumber());
			name1=new JLabel(request.getStudent());
			major1=new JLabel(request.getCourse());
			time1=new JLabel(request.getCtime());
			coursetime1=new JLabel(request.getCoursetime());
			requesttime1=new JLabel(request.getRequesttime());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setTitle("学生请假批阅系统");
		this.setLocation(600, 220);
		this.setSize(600,500);
		this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		qingjiatiao.setBounds(250, 0,80,65);
		affirmbutton.setBounds(0,400,100,60);
		cancelbutton.setBounds(370,400,100,60);
		modifiedbutton.setBounds(250,400,100,60);
		backbutton.setBounds(485,400,100,60);
		stuid.setBounds(0,50,50,50);
		stuid1.setBounds(60, 50, 80, 50);
		name.setBounds(170,50,50,50);
		name1.setBounds(240, 50, 50, 50);
		major.setBounds(340,50,50,50);
		major1.setBounds(400, 50,100,50);
		reason.setBounds(0,90,50,50);
		reason1.setBounds(60, 90, 50, 50);
		reason2.setBounds(115, 90, 500, 50);
		requesttime.setBounds(250, 90, 500, 50);
		requesttime1.setBounds(400, 90, 50, 50);
		coursetime.setBounds(0, 130, 500, 50);
		time.setBounds(0,320,200,50);
		time1.setBounds(130,320,270, 50);
		coursetime1.setBounds(100,130,300, 50);
		qingjiatiao.setFont(new Font("宋体",Font.BOLD, 25));
		stuid.setFont(new Font("宋体",Font.BOLD, 17));
		name.setFont(new Font("宋体",Font.BOLD, 17));
		major.setFont(new Font("宋体",Font.BOLD, 17));
		reason.setFont(new Font("宋体",Font.BOLD, 17));
		time.setFont(new Font("宋体",Font.BOLD, 17));
		requesttime.setFont(new Font("宋体",Font.BOLD, 17));
		coursetime.setFont(new Font("宋体",Font.BOLD, 17));
		
		this.setIconImage(new ImageIcon("./images/zdnf.png").getImage());
		this.add(qingjiatiao);
		this.add(affirmbutton);
		this.add(cancelbutton);
		this.add(modifiedbutton);
		this.add(backbutton);
		this.add(stuid);
		this.add(stuid1);
		this.add(name);
		this.add(name1);
		this.add(major);
		this.add(major1);
		this.add(reason);
		this.add(reason1);
		this.add(reason2);
		this.add(time);
		this.add(time1);
		this.add(requesttime);
		this.add(requesttime1);
		this.add(coursetime);
		this.add(coursetime1);
		this.add(beijing);
		modifiedbutton.setEnabled(false);
		affirmbutton.addActionListener(this);
		cancelbutton.addActionListener(this);
		backbutton.addActionListener(this);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==affirmbutton){
			String situations=null;
			try {
				situations="已批准";
				Admin.Acheckrequest(request.getId(),situations);
				JOptionPane.showMessageDialog(this, "已批准成功");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		if(e.getSource()==cancelbutton){
			String situations=null;
			try {
				situations="已驳回";
				Admin.Acheckrequest(request.getId(),situations);
				JOptionPane.showMessageDialog(this, "已驳回成功");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if(e.getSource()==backbutton){
			Student users=new Student(0,user[0],user[1],user[2],null);
			new Chaxun(users);
			this.setVisible(false);
		}
	}
	
}
