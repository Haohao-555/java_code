package com.gec.controller;

import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.gec.domain.User;
import com.gec.service.UserService;
import com.gec.service.UserServiceImpl;

public  class UserController extends JFrame implements ActionListener{
    JTextField txtUser=new JTextField();
    JTextField txtPs=new JTextField();
    JButton btnLogin=new JButton("登录");
    JButton cancel=new JButton("取消");
    JLabel username=new JLabel("用户名");
    JLabel password=new JLabel("密码");
    JLabel login_head=new JLabel();
    JLabel login_foot=new JLabel();
    ImageIcon bk_head = new ImageIcon(this.getClass().getResource("login_head.png"));
    ImageIcon bk_foot = new ImageIcon(this.getClass().getResource("login_foot.png"));
    Font f=new Font("宋体",Font.PLAIN,18);
	
	public UserController(){
		
		setLayout(null);
		
		//设置字体样式
		username.setFont(f);
		password.setFont(f);
		btnLogin.setFont(f);
		cancel.setFont(f);
		
		//添加图片头部和尾部
		login_head.setIcon(bk_head);
		login_head.setBounds(0,0,500,80);
		login_foot.setIcon(bk_foot);
		login_foot.setBounds(0,320,510,40);
		this.getLayeredPane().add(login_head, new Integer(Integer.MIN_VALUE));
		this.getLayeredPane().add(login_foot, new Integer(Integer.MIN_VALUE));
		Container panel = this.getContentPane();
		((JPanel) panel).setOpaque(false);
		
		
		txtUser.setBounds(160,130,200,35);
		txtPs.setBounds(160,180,200,35);
		
		
		username.setBounds(80,115,60,65);
		password.setBounds(80,180,60,35);
		
		
		btnLogin.setBounds(120,250,100,35);
		cancel.setBounds(270,250,100,35);
		
		btnLogin.addActionListener(this);
		add(txtUser);
		add(txtPs);
		add(username);
		add(password);
		add(btnLogin);
		add(cancel);
		setBounds(100,100,500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//（1）获取事件源
		Object src=e.getSource();
		if(src==btnLogin){
			doLogin();
		}
	}
	//--------------------------------------------处理模块----------------------------------------
	private UserService userService =new UserServiceImpl();
	private void doLogin() {
		// TODO Auto-generated method stub
		//收集用户录入数据
		String username=txtUser.getText();
		String password=txtPs.getText();
		System.out.println(username+" "+password);
		//调用服务层相关方法，并传递数据
		User user=null;
		try{
			user=userService.doLogin(username, password);
			System.out.println("{DEBUG}用户登录成功");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("用户登录失败");
		}finally{
			System.out.println("程序结束....");
		}
	}  
}
