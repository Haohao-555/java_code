package PipedStream_demo;
//�ó���ʵ�������߳��ڹܵ�����ʵ����Ϣ�ķ��������
import java.io.*;

public class JavaAPIdemo_one {
	   public static void main(String[] args) throws Exception {
		SendThread send=new SendThread();
		ReceiveThread recevie=new ReceiveThread();
		send.getOutput().connect(recevie.getInput());
		//���ͷ�����������ӽ��շ���������
		new Thread(send,"��Ϣ���ͷ�").start();
		new Thread(recevie,"��Ϣ���շ�").start();
  }
}

//���ͷ�
class SendThread implements Runnable{
	private PipedOutputStream output;//�ܵ������
	
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
		
			try {//���ùܵ�������Ϣ����
				this.output.write(("��Ϣ����-"+Thread.currentThread().getName()+"www").getBytes());
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
//���շ�
class ReceiveThread implements Runnable{
	private PipedInputStream input;//�ܵ�������
	
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
				System.out.println(Thread.currentThread().getName()+"  ������ϢΪ��"+new String(data,0,len));
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


