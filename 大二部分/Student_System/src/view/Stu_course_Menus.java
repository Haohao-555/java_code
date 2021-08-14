/*
 * Stu_course_Menus.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import untity.Student_Impl;

import entity.Full_class_grade;
import entity.Student;

/**
 *
 * @author  __USER__
 */
public class Stu_course_Menus extends javax.swing.JFrame {
	Student stu;
	ArrayList<Full_class_grade> full_class_grade = new ArrayList<Full_class_grade>();
	String x_id;//当前下拉框序号

	/** Creates new form Stu_course_Menus */
	private void init1() {
		Object title[] = { "序号", "课程", "学分", "教师", "上课地点及时间" };
		Object detail[][] = new Object[full_class_grade.size()][5];
		this.jTable1.setModel(new DefaultTableModel(detail, title));
	}

	private void init() throws Exception {
		full_class_grade = Student_Impl.select_class(stu.getName());
		Object title[] = { "序号", "课程", "学分", "教师", "上课地点及时间" };
		Object detail[][] = new Object[full_class_grade.size()][5];
		for (int i = 0; i < full_class_grade.size(); i++) {
			detail[i][0] = Integer.toString(i + 1);
			detail[i][1] = full_class_grade.get(i).getCourse();
			detail[i][2] = full_class_grade.get(i).getCredit();
			detail[i][3] = full_class_grade.get(i).getTeacher();
			detail[i][4] = full_class_grade.get(i).getCo_time();
		}
		this.jTable1.setModel(new DefaultTableModel(detail, title));
		//下拉框初始化
		this.jComboBox1.removeAllItems();//清空下拉框的内容
		this.jComboBox1.addItem("请选择序号");
		for (int i = 0; i < full_class_grade.size(); i++) {
			this.jComboBox1.addItem(Integer.toString(i + 1));
		}
		this.jTable1.setEnabled(false);
		//已选学分
		this.jTextField1.setText(Integer.toString(Student_Impl.select_credit(stu.getName())));
		this.jTextField1.setEditable(false);
	}

	public Stu_course_Menus(Student st) {
		stu = st;
		initComponents();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		init1();
		try {
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ImageIcon bk = new ImageIcon(this.getClass().getResource("../背景.jpg"));
		jLabel1.setIcon(bk);
		jLabel1.setBounds(0, 0, 700, 500);
		this.getLayeredPane().add(jLabel1, new Integer(Integer.MIN_VALUE));
		Container panel = this.getContentPane();
		((JPanel) panel).setOpaque(false);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jScrollPane1 = new javax.swing.JScrollPane();
jTable1 = new javax.swing.JTable();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jLabel3 = new javax.swing.JLabel();
jComboBox1 = new javax.swing.JComboBox();
jButton3 = new javax.swing.JButton();
jLabel4 = new javax.swing.JLabel();
jTextField1 = new javax.swing.JTextField();

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

jLabel1.setText("jLabel1");

jLabel2.setFont(new java.awt.Font("宋体", 0, 24));
jLabel2.setText("\u6211\u7684\u8bfe\u8868");

jTable1.setModel(new javax.swing.table.DefaultTableModel(
	new Object [][] {
		{null, null, null, null},
		{null, null, null, null},
		{null, null, null, null},
		{null, null, null, null}
	},
	new String [] {
		"Title 1", "Title 2", "Title 3", "Title 4"
	}
));
jScrollPane1.setViewportView(jTable1);

jButton1.setText("\u5237\u65b0");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

jButton2.setText("\u8fd4\u56de");
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});

jLabel3.setText("\u53d6\u6d88\u8bfe\u7a0b");


jComboBox1.addItemListener(new java.awt.event.ItemListener() {
public void itemStateChanged(java.awt.event.ItemEvent evt) {
jComboBox1ItemStateChanged(evt);
}
});

jButton3.setText("\u786e\u5b9a");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});

jLabel4.setText("\u5df2\u9009\u5b66\u5206\uff1a");

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel2)
.addGap(161, 161, 161)))
.addComponent(jButton1))
.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
.addGroup(layout.createSequentialGroup()
.addComponent(jButton2)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
.addComponent(jLabel4)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(48, 48, 48))
.addGroup(layout.createSequentialGroup()
.addGap(125, 125, 125)
.addComponent(jLabel3)
.addGap(31, 31, 31)
.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(45, 45, 45)
.addComponent(jButton3)
.addContainerGap(157, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel1)
.addComponent(jButton1))
.addGap(44, 44, 44))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel2)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jButton2)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel4)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton3))
.addContainerGap(39, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

	//GEN-END:initComponents
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		if (x_id.matches("[0-9]+")) {
			int id = Integer.parseInt(x_id);
			//获取课程id
			int co_id = full_class_grade.get(id - 1).getCo_id();
			if(full_class_grade.get(id-1).getFlag()==0){
				try {
					
					Student_Impl.delete_course(stu.getId(), co_id);
					JOptionPane.showMessageDialog(this, "已取消课程"
							+ full_class_grade.get(id - 1).getCourse());
					Student_Impl.course_jia1(co_id);
					init();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				JOptionPane.showMessageDialog(this, "该课程"
						+ full_class_grade.get(id - 1).getCourse()+"成绩已出，不能取消");
			}
		}
	}

	private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			x_id = (String) this.jComboBox1.getSelectedItem();
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new Student_Menus(stu).setVisible(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}