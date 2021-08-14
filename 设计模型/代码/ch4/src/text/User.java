package text;

import java.lang.reflect.Constructor;

import entity.Demo5;

public class User {
    //˽�л����캯��
    private User(){ }
 
    //����һ����̬ö����
    static enum SingletonEnum{
        //����һ��ö�ٶ��󣬸ö�������Ϊ����
        INSTANCE;
        private User user;
        //˽�л�ö�ٵĹ��캯��
        private SingletonEnum(){
            user=new User();
        }
        public User getInstnce(){
            return user;
        }
    }
 
    //���Ⱪ¶һ����ȡUser����ľ�̬����
    public static User getInstance(){
        return SingletonEnum.INSTANCE.getInstnce();
    }
    public static void main(String [] args) throws Exception{
        System.out.println(User.getInstance());
        System.out.println(User.getInstance());
        System.out.println(User.getInstance()==User.getInstance());
        

    
}
}


    

