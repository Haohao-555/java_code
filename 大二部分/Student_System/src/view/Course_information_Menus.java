/*
 * Course_information_Menus.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import untity.Admin_Impl;

import entity.Admin;
import entity.Full_course;

/**
 *
 * @author  __USER__
 */
public class Course_information_Menus extends javax.swing.JFrame {
	Admin ad;
	int co_id;//课程id
	int i = 0;//检查文本框那个被修改
	Full_course full_course;

	private void init() {
		this.jTextField1.setEditable(false);
		this.jTextField2.setEditable(false);
		this.jTextField3.setEditable(false);
		this.jTextField4.setEditable(false);
		this.jTextField5.setEditable(false);
	}

	private void init1() {
		try {
			full_course = Admin_Impl.getcourse(co_id);
			this.jTextField1.setText(full_course.getCourse());
			this.jTextField2.setText(full_course.getName());
			this.jTextField3.setText(full_course.getCo_time());
			this.jTextField4.setText(Integer.toString(full_course.getCredit()));
			this.jTextField5.setText(Integer.toString(full_course.getNumber()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** Creates new form Course_information_Menus */
	public Course_information_Menus(Admin a, int id) {
		ad = a;
		co_id = id;
		initComponents();
		init1();
		init();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		ImageIcon bk = new ImageIcon(this.getClass().getResource("../背景.jpg"));
		jLabel1.setIcon(bk);
		jLabel1.setBounds(0, 0, 500, 600);
		this.getLayeredPane().add(jLabel1, new Integer(Integer.MIN_VALUE));
		Container panel = this.getContentPane();
		((JPanel) panel).setOpaque(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("jLabel1");

		jLabel2.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel2.setText("\u8bfe\u7a0b\u4fe1\u606f");

		jLabel3.setFont(new java.awt.Font("宋体", 0, 15));
		jLabel3.setText("\u8bfe\u7a0b\uff1a");

		jLabel4.setText("\u6559\u5e08\uff1a");

		jButton1.setText("\u4fee\u6539");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel5.setText("\u65f6\u95f4\uff1a");

		jButton2.setText("\u4fee\u6539");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel6.setText("\u5b66\u5206\uff1a");

		jButton3.setText("\u4fee\u6539");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel7.setText("\u6570\u76ee\uff1a");

		jButton4.setText("\u4fee\u6539");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setText("\u786e\u5b9a\u4fee\u6539");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setText("\u8fd4\u56de");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel1)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				144,
																				144,
																				144)
																		.addComponent(
																				jLabel2))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				50,
																				50,
																				50)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel3)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jTextField1,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												215,
																												Short.MAX_VALUE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel4)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jTextField2,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												215,
																												Short.MAX_VALUE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel6)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				jTextField4,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				215,
																																				Short.MAX_VALUE))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel5)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				jTextField3,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				215,
																																				Short.MAX_VALUE))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel7)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				jTextField5,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				215,
																																				Short.MAX_VALUE)))))
																		.addGap(
																				23,
																				23,
																				23)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton4)
																						.addComponent(
																								jButton3)
																						.addComponent(
																								jButton2)
																						.addComponent(
																								jButton1))))
										.addContainerGap())
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(92, 92, 92)
										.addComponent(jButton5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												102, Short.MAX_VALUE)
										.addComponent(
												jButton6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												75,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(64, 64, 64)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addGap(29, 29, 29)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(33, 33, 33)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton1))
										.addGap(32, 32, 32)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5)
														.addComponent(jButton2))
										.addGap(38, 38, 38)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton3))
										.addGap(37, 37, 37)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton4))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												50, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton5)
														.addComponent(jButton6))
										.addGap(39, 39, 39)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		String course = this.jTextField1.getText();
		if (i == 2) {//第二个文本框
			String te_name = this.jTextField2.getText();
			if (te_name.length() == 0) {//为空
				JOptionPane.showMessageDialog(this, "请输入教师姓名");
			} else {
				boolean flag = Admin_Impl.isteacher(te_name);
				if (flag == true) {//存在
					//获取教师id
					int new_id = Admin_Impl.select_te_id(te_name);
					Admin_Impl.update_course_teacher(full_course.getTea_id(),
							new_id, course);
					JOptionPane.showMessageDialog(this, "修改成功");
					this.jTextField2.setText(te_name);
					this.jTextField2.setEditable(false);
				} else {
					JOptionPane.showMessageDialog(this, "你选择教师不存在");
				}
			}

		} else if (i == 3) {//第三个文本框
			String co_time = this.jTextField3.getText();
			if (co_time.length() != 0) {
				Admin_Impl.update_cotime(course, co_time);
				JOptionPane.showMessageDialog(this, "修改成功");
				this.jTextField3.setText(co_time);
				this.jTextField3.setEditable(false);
			} else {
				JOptionPane.showMessageDialog(this, "请输入上课地点");
			}

		} else if (i == 4) {//第四个文本框
			String credit = this.jTextField4.getText();
			if (credit.matches("[0-9]") == true) {
				int credits = Integer.parseInt(credit);
				if (credits > 0 && credits < 5) {
					Admin_Impl.update_credit(course, Integer.parseInt(credit));
					JOptionPane.showMessageDialog(this, "修改成功");
					this.jTextField4.setText(credit);
					this.jTextField4.setEditable(false);
				} else {
					JOptionPane.showMessageDialog(this, "学分范围在1~5之间");
				}
			} else {
				JOptionPane.showMessageDialog(this, "请输入正确学分(数字)");
			}

		} else if (i == 5) {//第五个文本框
			String number = this.jTextField5.getText();
			if (number.matches("[0-9]+") == true) {
				int numbers = Integer.parseInt(number);
				if (numbers > 0 && numbers <= 120) {
					Admin_Impl.update_number(course, numbers);
					JOptionPane.showMessageDialog(this, "修改成功");
					this.jTextField5.setText(number);
					this.jTextField5.setEditable(false);
				} else {
					JOptionPane.showMessageDialog(this, "数量范围在1~120之间");
				}

			} else {
				JOptionPane.showMessageDialog(this, "请输入正确数量(数字)");
			}
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextField5.setEditable(true);
		i = 5;
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextField4.setEditable(true);
		i = 4;
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextField3.setEditable(true);
		i = 3;
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextField2.setEditable(true);
		i = 2;

	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new Course_Menus(ad).setVisible(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}