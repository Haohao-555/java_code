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
		//���ͷ�����������ӽ��շ���������
		new Thread(send,"��Ϣ���ͷ�").start();
		new Thread(recevie,"��Ϣ���շ�").start();
}
}

//���ͷ�
class SendThreads implements Runnable{
	private PipedOutputStream output;//�ܵ������
	
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
		    	try {//���ùܵ�������Ϣ����
					this.output.write(("��"+(x+1)+"����Ϣ����-"+Thread.currentThread().getName()+"www\r\n").getBytes());
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
//���շ�
class ReceiveThreads implements Runnable{
	private PipedInputStream input;//�ܵ�������
	
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
			ByteArrayOutputStream bos=new ByteArrayOutputStream();//��������Ϣ�������ڴ������
			try {
				while((len=this.input.read(data))!=-1){
					bos.write(data,0,len);
				}
				this.input.read(data);
				System.out.println(Thread.currentThread().getName()+"  ������ϢΪ��");
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
