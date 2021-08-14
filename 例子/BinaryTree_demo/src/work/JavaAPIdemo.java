package work;

import java.util.Arrays;

public class JavaAPIdemo {
	   public static void main(String[] args) {
		BinaryTree<Person> tree=new BinaryTree<Person>();
		tree.add(new Person("Сǿ-80",80));
		tree.add(new Person("Сǿ-100",100));
		tree.add(new Person("Сǿ-60",60));
		tree.add(new Person("Сǿ-90",90));
		System.out.println(Arrays.toString(tree.toArray()));
	}
	}


//ʵ�ֶ����������ݲ���
class BinaryTree <T extends Comparable<T>>{
	//�ڲ��ࣨ�ڵ㣩
	private class Node{//������
		private Comparable<T> data;//���Comparable,���ԱȽϴ�С
		private Node parent;//��Ÿ��ڵ�
		private Node left;//���������
		private Node right;//���������
		public Node(Comparable<T> data){//���췽��ֱ�Ӹ���������ݵĴ洢
			this.data=data;
		}
		
		
		
		/**
		 *ʵ�ֽڵ����ݵ��ʵ�λ�õĴ洢
		 *@param newNode �������½ڵ� 
		 * */
		public void addNode(Node newNode){
			if(newNode.data.compareTo((T)this.data)<=0){//�ȵ�ǰ�ڵ�����С
				if(this.left==null){
					this.left=newNode;
					newNode.parent=this;//���游�ڵ�
				}else{//���������ж�
					this.left.addNode(newNode);//���������ж�
				}
			}else{
				if(this.right==null){
					this.right=newNode;
					newNode.parent=this;
				}else{
					this.right.addNode(newNode);
				}
			}
			
		}
		
		
		
		/**
		 * ʵ���������ݵĻ�ȡ�������������������ʽ�����
		 * */
		public void toArrayNode(){
			if(this.left!=null){
				this.left.toArrayNode();
			}
			BinaryTree.this.returnData[BinaryTree.this.foot++]=this.data;
			if(this.right!=null){
				this.right.toArrayNode();
			}
			
		}
	}
	
	
	//-------------------����Ϊ�������Ĺ���ʵ��-------------------
	private Node root;//������ڵ�
	private int count;//�������ݵĸ���
	private int foot=0;//�ű����
	private Object []returnData;//���ص�����
	
	
	
	
	/**
	 * �������ݱ���
	 * @param data Ҫ���������
	 * @exception NullPointerException ���������Ϊ��ʱ�׳����쳣
	 * 
	 * */
	public void add(Comparable<T> data){
		if(data==null){
			throw new NullPointerException("��������ݲ���Ϊ��");
		}
		//���е����ݱ����߱��нڵ��ϵ��ƥ�䣬��ôһ��Ҫ�����װ��Node��֮��
		Node newNode=new Node(data);//����ڵ�
		if(this.root==null){//����û�и��ڵ㣬���һ���ڵ���Ϊ���ڵ�
			this.root=newNode;
		}else{//��ҪΪ�䱣�浽һ�����ʵĽڵ�
			this.root.addNode(newNode);//����Node�ദ��
			
		}
		this.count++;
	}
	
	
	/**
	 * �Զ����������ʽ����ȫ�����ݣ����û�����ݷ���null
	 * @return ȫ������
	 * */
	public Object[] toArray(){
		if(this.count==0){
			return null;
		}
		this.returnData=new Object[this.count];//���泤��Ϊ���鳤��
		this.foot=0;//�ű�����
		this.root.toArrayNode();//ֱ��ͨ��Node�ฺ��
		return this.returnData;//��������
	}
	
	
}


//���ݽṹ
class Person implements Comparable<Person> {
	private String name;
	private int age;
    public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
    @Override
    public int compareTo(Person per) {
    	return this.age-per.age;
    }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Person�����]������" + this.name + "�����䣺" + this.age + "\n";
	}
}

