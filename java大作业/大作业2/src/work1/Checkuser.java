/*
 * Checkuser.java
 *
 * Created on __DATE__, __TIME__
 */

package work1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *
 * @author  __USER__
 */
public class Checkuser extends javax.swing.JFrame {

	/** Creates new form Checkuser */
	public void update() {
		try {
			FileReader fr = new FileReader("file6.txt");
			BufferedReader r = new BufferedReader(fr);
			String s;
			for (s = r.readLine(); s != null; s = r.readLine())
				this.jTextField2.setText(s);
			jTextField2.setEditable(false);
			r.close();
		} catch (IOException e) {
			System.err.println("发生异常:" + e);
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}
public void updatex(){
	String r="小明";
	this.jTextField1.setText(r);
	jTextField1.setEditable(false);
}
	public Checkuser() {
		initComponents();
		update();
		updatex();
		this.setLocationRelativeTo(null);
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
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("黑体", 0, 24));
		jLabel1.setText("\u5df2\u6ce8\u518c\u7528\u6237");

		jLabel2.setText("1.\u6ce8\u518c\u540d\uff1a");

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jLabel4.setText("2.\u6ce8\u518c\u540d\uff1a");

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jLabel5
				.setText("\u8bf7\u8f93\u5165\u4f60\u8981\u5220\u9664\u6ce8\u518c\u540d\u7684\u5e8f\u53f7\uff1a");

		jButton1.setText("\u786e\u5b9a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u9000\u51fa");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
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
										.addGap(33, 33, 33)
										.addComponent(jLabel5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jTextField3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												84,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												24, Short.MAX_VALUE)
										.addComponent(jButton1).addGap(37, 37,
												37))
						.addGroup(
								layout.createSequentialGroup().addGap(173, 173,
										173).addComponent(jButton2)
										.addContainerGap(230, Short.MAX_VALUE))
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(125, 125, 125)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel2)
														.addComponent(jLabel4))
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
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				109,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel3))
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																109,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(147, Short.MAX_VALUE))
						.addGroup(
								layout.createSequentialGroup().addGap(156, 156,
										156).addComponent(jLabel1)
										.addContainerGap(190, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(25, 25, 25)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4))
										.addGap(47, 47, 47)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												29, Short.MAX_VALUE)
										.addComponent(jButton2)
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		System.exit(0);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		JOptionPane.showMessageDialog(this, "已删除你选择的注册名");

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Checkuser().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}