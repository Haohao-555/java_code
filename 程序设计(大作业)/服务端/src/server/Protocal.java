package server;
public interface Protocal {
//�û�
	int A_LOGIN=1001;//��¼����
	int KCHECK=1002;//�鿴�����Ϣ
	int ADVISE=1003;//�Ὠ��
	int KSEND=1004;//�Ŀ��
	int A_ALTERPW=1005;//�޸ĵ�¼����
	int REGISTER=1006;//ע��
	int CKECK_KNUMBER=1007;//��ȡȡ����
	int CHECK_JMESSAGE=10008;//�鿴�ļ������
	int UPDATE=1009;//���¼ļ�����Ϣ
	
//�����
	int INSERT=2001;//����Ա��
	int DELETE_WORKER=2002;//ɾ��Ա��
	int APPROVER=2003;//����Ա�����
	int CHECK_SUGGEST=2004;//�鿴�û�������Ͷ��
	int CHECK_ALL_SUGGEST=2005;//��ʾ�û�ȫ��������Ͷ��
	int ARRANGE=2006;//����Ա�����
	int CHECK_ALL_REQUEST=2007;//�鿴ȫ��Ա�����
	int UPDATE_REQUEST=2008;//����������
	int CHECK_WORKER=2009;//��ʾ����Ա��
	int CHECK_OW=2010;//��ʾĳ��Ա����Ϣ
//������
	int LEAVE=3001;//���
	int CHECK_WORK=3002;//�鿴���
	int CHECK_REQUEST=3003;//�鿴������
	int KIN=3004;//������
	int KOUT=3005;//��ݳ���
	int GAINK=3006;//�����ȡ
	int W_ALTERPW=3007;//�޸ĵ�¼����
	int W_LOGIN=3008;//��¼
	int GAIN_ALL_K=3009;//��ʾȫ����ݵ�
	int GAIN_K_MESSAGE=3010;//�鿴�ļ���ϸ��Ϣ
}
