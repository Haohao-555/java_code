package PipedStream_demo;
//该程序实现两个线程在管道流上实现信息的发送与接收
import java.io.*;

public class JavaAPIdemo_one {
	   public static void main(String[] args) throws Exception {
		SendThread send=new SendThread();
		ReceiveThread recevie=new ReceiveThread();
		send.getOutput().connect(recevie.getInput());
		//发送方的输出流连接接收方的输入流
		new Thread(send,"消息发送方").start();
		new Thread(recevie,"消息接收方").start();
  }
}

//发送方
class SendThread implements Runnable{
	private PipedOutputStream output;//管道输出流
	
	public SendThread() {
		this.output = new PipedOutputStream();
	}
    
	public PipedOutputStream getOutput() {
		return output;
	}

	public void setOutput(PipedOutputStream output) {
		this.output = output;
	}

	@Override
	public void run() {
		
			try {//利用管道进行信息发送
				this.output.write(("信息发送-"+Thread.currentThread().getName()+"www").getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try {
			this.output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
//接收方
class ReceiveThread implements Runnable{
	private PipedInputStream input;//管道输入流
	
	public ReceiveThread() {
		super();
		this.input = new PipedInputStream();
	}

	public PipedInputStream getInput() {
		return input;
	}

	public void setInput(PipedInputStream input) {
		this.input = input;
	}

	@Override
	public void run() {
		
			byte data[]=new byte[1024];
			try {
				int len=this.input.read(data);
				System.out.println(Thread.currentThread().getName()+"  接收消息为："+new String(data,0,len));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		try {
			this.input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  }


