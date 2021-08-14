package PipedStream_demo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class JavaAPIdemo_two {
	   public static void main(String[] args) throws Exception {
		SendThreads send=new SendThreads();
		ReceiveThreads recevie=new ReceiveThreads();
		send.getOutput().connect(recevie.getInput());
		//发送方的输出流连接接收方的输入流
		new Thread(send,"消息发送方").start();
		new Thread(recevie,"消息接收方").start();
}
}

//发送方
class SendThreads implements Runnable{
	private PipedOutputStream output;//管道输出流
	
	public SendThreads() {
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
		    for(int x=0;x<10;x++){
		    	try {//利用管道进行信息发送
					this.output.write(("第"+(x+1)+"次信息发送-"+Thread.currentThread().getName()+"www\r\n").getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
class ReceiveThreads implements Runnable{
	private PipedInputStream input;//管道输入流
	
	public ReceiveThreads() {
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
		    int len=0;
			byte data[]=new byte[1024];
			ByteArrayOutputStream bos=new ByteArrayOutputStream();//将所有消息保存在内存输出流
			try {
				while((len=this.input.read(data))!=-1){
					bos.write(data,0,len);
				}
				this.input.read(data);
				System.out.println(Thread.currentThread().getName()+"  接收消息为：");
				System.out.println(new String(bos.toByteArray()));
				bos.close();
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
