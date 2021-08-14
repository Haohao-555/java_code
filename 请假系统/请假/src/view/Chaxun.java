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
import model.Teacher;
public class Chaxun extends JFrame implements ActionListener{
	ArrayList<Request> request = new ArrayList<Request>();
	JPanel panel = new JPanel();
	JScrollPane jscrollpane = new JScrollPane();
	Object[] columnNames = new Object[]{"���","����","ʱ��","���"};//����
	Object[][] rowData = new Object[10][3];//����������
	JTable table = new JTable();
    DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
	private JButton search= new JButton("ˢ��");
	private JButton details= new JButton("����");
	JLabel beijing= new JLabel(new ImageIcon(".\\images\\chaxun.jpg"));
	private Icon refresh=new ImageIcon(".\\images\\refresh.png");
	private Icon house=new ImageIcon(".\\images\\home_house.png");
	private Icon more=new ImageIcon(".\\images\\more.png");
	private JButton back= new JButton("������ҳ");
	String []users=new String [2];
	String []type=new String [1];
	public Chaxun(Student user)
	{
		users[0]=user.getName();
		users[1]=user.getPassword();
		this.setTitle("��ٲ�ѯϵͳ");
		this.setLocation(450,100);
		this.setSize(800, 800);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("./images/zdnf.png").getImage());
	    this.search.setIcon(refresh);
	    this.back.setIcon(house);
	    this.details.setIcon(more);
		creatqingjiatiao();
		jscrollpane.setViewportView(table);
		beijing.setBounds(0,0,800,800);
		jscrollpane.setBounds(145,100,500,500);
		search.setBounds(180,650,100,50);
		details.setBounds(320,650,100,50);
		back.setBounds(500,650,100,50);
		table.setRowHeight(35); 
		this.add(jscrollpane);
		this.add(search);
		this.add(details);
		this.add(back);
		this.add(beijing);
		
		search.addActionListener(this);
		details.addActionListener(this);
		back.addActionListener(this);
		setResizable(false);
		this.setVisible(true);
		adddatil();

	}
	public void creatqingjiatiao(){   
		tableModel.addColumn("���");
		tableModel.addColumn("����");
		tableModel.addColumn("���ʱ��");
		tableModel.addColumn("���");
	}
	
	
	private  void adddatil(){
		Student user=null;
		String username=users[0];
		String upassword=users[1];
		String id="";
		String name="";
		String ctime="";
		String  situations ="";
	
		try {
			user=Student.login(username, upassword);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		tableModel.setRowCount(0);//��ձ������
		if(user.getType().equals("2")){
		try {
			type[0]="2";
			request=Admin.viewAllrequest();
			if(request.size()==0){
				String jiatiao1[]={id,name,ctime,situations};
				tableModel.addRow(jiatiao1);
				JOptionPane.showMessageDialog(this, "û��ѧ�����");
			}
			Object[][] rowData = new Object[request.size()][4];
			for (int i = 0; i < request.size(); i++){
				 id=String.valueOf(request.get(i).getId());
				 name=request.get(i).getStudent();
				 ctime=request.get(i).getCtime();
				  situations=request.get(i).getSituations();
				 String jiatiao[]={id,name,ctime,situations};
				tableModel.addRow(jiatiao);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		}else if(user.getType().equals("1")){
			type[0]="1";
			String course = JOptionPane.showInputDialog("���������Ŀγ�");
			try {
				
				request=Teacher.viewAllrequest(course);
				if(request.size()==0){
					String jiatiao1[]={id,name,ctime,situations};
					tableModel.addRow(jiatiao1);
					JOptionPane.showMessageDialog(this, "�ÿγ�û��ѧ�����");
				}
				Object[][] rowData = new Object[request.size()][4];
				for (int i = 0; i < request.size(); i++){
					 id=String.valueOf(request.get(i).getId());
					 name=request.get(i).getStudent();
				     ctime=request.get(i).getCtime();
					 situations=request.get(i).getSituations();
				    String jiatiao[]={id,name,ctime,situations};
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
	}	
		
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==search)//��ѯ
		{
			
			adddatil();
		}
		else if(e.getSource()==details)
		{
			int selectedRow = table.getSelectedRow();
			if (selectedRow < 0) 
			{
				JOptionPane.showMessageDialog(this, "��ѡ���������ѡ��");
			} else {
				//��ȡ��ǰid
				int id = Integer.parseInt((String) this.tableModel.getValueAt(selectedRow, 0));
				String username=users[0];
				String upassword=users[1];
				this.dispose();
				new Fdyqjt(id,username,upassword,type[0]);
			
			}
		}
		if(e.getSource()==back){//������ҳ
			new Jiemian();
			this.dispose();
		}
	}
}
