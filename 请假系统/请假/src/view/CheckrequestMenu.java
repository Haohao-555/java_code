package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.Admin;
import model.Request;
import model.Student;

public class CheckrequestMenu extends  JFrame implements ActionListener {
	ArrayList<Request> request = new ArrayList<Request>();
	JPanel panel = new JPanel();
	JScrollPane jscrollpane = new JScrollPane();
	Object[] columnNames = new Object[]{"����","ʱ��","���","�γ�"};//����
	Object[][] rowData = new Object[10][4];//����������
	JTable table = new JTable();
    DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
    JLabel beijing= new JLabel(new ImageIcon(".\\images\\chaxun.jpg"));
    private Icon refresh=new ImageIcon(".\\images\\reresh.png");
    private Icon returnt=new ImageIcon(".\\images\\return.png");
    private JButton search= new JButton("��ѯ");
    private JButton back= new JButton("����");
    String []users=new String [2];
public CheckrequestMenu(String name,String number){
	users[0]=name;
	users[1]=number;
	    this.setTitle("��ٲ�ѯϵͳ");
	    this.setLocation(450,100);
	    this.setSize(800, 800);
	    this.setLayout(null);
	    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    this.setIconImage(new ImageIcon("./images/zdnf.png").getImage());
	    this.back.setIcon(returnt);
	    this.search.setIcon(refresh);
	    creatqingjiatiao();
	    jscrollpane.setViewportView(table);
	    jscrollpane.setBounds(145,100,500,500);
	    beijing.setBounds(0,0,800,800);
	    table.setRowHeight(35);
	    search.setBounds(450,650,100,50);
	    back.setBounds(250,650,100,50);
	    search.addActionListener(this);
	    back.addActionListener(this);
	    this.add(jscrollpane);
	    this.add(search);
	    this.add(back);
	    this.add(beijing);
	    setResizable(false);
	    this.setVisible(true);
	    
}
public void creatqingjiatiao(){   
	
	tableModel.addColumn("����");
	tableModel.addColumn("�ύ���ʱ��");
	tableModel.addColumn("�γ�");
	tableModel.addColumn("���");
}
private  void adddatil(){
	tableModel.setRowCount(0);//��ձ������
	try {
		request=Student.viewAllrequest(users[0]);
		Object[][] rowData = new Object[request.size()][4];
		for (int i = 0; i < request.size(); i++){
			
			String name=request.get(i).getStudent();
			String ctime=request.get(i).getCtime();
			String course=request.get(i).getCourse();
			String  situations=request.get(i).getSituations();
			String jiatiao[]={name,ctime,course,situations};
			tableModel.addRow(jiatiao);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==search){
	   adddatil();
	}else if(e.getSource()==back){
		Student user=new Student(0,users[0],"111","0",users[1]);
		this.dispose();
		new Stuqingjia(user);
	}
}
}
