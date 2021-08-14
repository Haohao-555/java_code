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
	private Random random=new Random();//随机数对象
    private int width=140;
    private int height=30;
    private int fontsize=18;
    private String str="+-*/";
    private int value=-1;//保存计算结果
    
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
    //生成随机颜色
    private Color randColor() {
    	//三原色的最大值为255，random.nextInt(256)的取值范围是0~255
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
		 //1 创建画板
	    BufferedImage img=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	  //2 创建画笔
	    Graphics2D pen=(Graphics2D)img.getGraphics();
	  //3 随机生成内容：不同颜色的字符
	    String code=randCode();
	    request.getSession().setAttribute("valicode", value);
	  //4 绘制内容
	    //4.1设置绘制区域
	      pen.fillRect(0, 0, width, height);
	    //4.2设置字体
	      pen.setFont(new Font("微软雅黑",Font.BOLD,fontsize));
	    //4.3按顺序逐个绘制字符
	      for(int i=0;i<code.length();i++){
	    	  pen.setColor(randColor());
	    	  //绘制字符  code.chatAr(i)绘制的内容
	    	  pen.drawString(code.charAt(i)+"", 5+i*fontsize, (fontsize+height)/2);
	      }
	    //4.4绘制噪音线
	      for(int i=0;i<2;i++){
	    	  pen.setColor(randColor());
	    	  pen.setStroke(new BasicStroke(3));//设置线条粗细为3px
	    	  pen.drawLine(random.nextInt(width/2), random.nextInt(height), 
	    			  random.nextInt(width), random.nextInt(height));//起始坐标到终点坐标
	      }
	  //5 c存为图片发送：ImageIO.write(画板,图片类型，输出流)
	ServletOutputStream out=response.getOutputStream();
	ImageIO.write(img,"png",out);
	out.flush();
	out.close();

	
	}

}
