package com.gec.l31;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewCode extends HttpServlet {
	private Random random=new Random();//���������
    private int width=140;
    private int height=30;
    private int fontsize=18;
    private String str="+-*/";
    private int value=-1;//���������
    
    private String randCode(){
    	int one=random.nextInt(100);
    	int two=random.nextInt(100);
    	char op=str.charAt(random.nextInt(str.length()));
    	switch (op) {
		case '+':
			value=one+two;
			break;
        case '-':
        	value=one-two;
			break;
        case '*':
           value=one*two;
	       break;
        case '/':
           value=one-two;
	       break;
		default:
			break;
		}
    	return ""+one+op+two+"=?";
    }
    //���������ɫ
    private Color randColor() {
    	//��ԭɫ�����ֵΪ255��random.nextInt(256)��ȡֵ��Χ��0~255
		int r=random.nextInt(256);
		int g=random.nextInt(256);
		int b=random.nextInt(256);
		return new Color(r,g,b);

	}
    
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 //1 ��������
	    BufferedImage img=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	  //2 ��������
	    Graphics2D pen=(Graphics2D)img.getGraphics();
	  //3 ����������ݣ���ͬ��ɫ���ַ�
	    String code=randCode();
	    request.getSession().setAttribute("valicode", value);
	  //4 ��������
	    //4.1���û�������
	      pen.fillRect(0, 0, width, height);
	    //4.2��������
	      pen.setFont(new Font("΢���ź�",Font.BOLD,fontsize));
	    //4.3��˳����������ַ�
	      for(int i=0;i<code.length();i++){
	    	  pen.setColor(randColor());
	    	  //�����ַ�  code.chatAr(i)���Ƶ�����
	    	  pen.drawString(code.charAt(i)+"", 5+i*fontsize, (fontsize+height)/2);
	      }
	    //4.4����������
	      for(int i=0;i<2;i++){
	    	  pen.setColor(randColor());
	    	  pen.setStroke(new BasicStroke(3));//����������ϸΪ3px
	    	  pen.drawLine(random.nextInt(width/2), random.nextInt(height), 
	    			  random.nextInt(width), random.nextInt(height));//��ʼ���굽�յ�����
	      }
	  //5 c��ΪͼƬ���ͣ�ImageIO.write(����,ͼƬ���ͣ������)
	ServletOutputStream out=response.getOutputStream();
	ImageIO.write(img,"png",out);
	out.flush();
	out.close();

	
	}

}
