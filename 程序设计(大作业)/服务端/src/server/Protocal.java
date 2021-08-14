package server;
public interface Protocal {
//用户
	int A_LOGIN=1001;//登录功能
	int KCHECK=1002;//查看快递信息
	int ADVISE=1003;//提建议
	int KSEND=1004;//寄快递
	int A_ALTERPW=1005;//修改登录密码
	int REGISTER=1006;//注册
	int CKECK_KNUMBER=1007;//获取取件码
	int CHECK_JMESSAGE=10008;//查看寄件单情况
	int UPDATE=1009;//更新寄件单信息
	
//管理层
	int INSERT=2001;//增加员工
	int DELETE_WORKER=2002;//删除员工
	int APPROVER=2003;//审批员工请假
	int CHECK_SUGGEST=2004;//查看用户建议与投诉
	int CHECK_ALL_SUGGEST=2005;//显示用户全部建议与投诉
	int ARRANGE=2006;//安排员工班表
	int CHECK_ALL_REQUEST=2007;//查看全部员工请假
	int UPDATE_REQUEST=2008;//更新请假情况
	int CHECK_WORKER=2009;//显示所有员工
	int CHECK_OW=2010;//显示某个员工信息
//基础层
	int LEAVE=3001;//请假
	int CHECK_WORK=3002;//查看班表
	int CHECK_REQUEST=3003;//查看请假情况
	int KIN=3004;//快递入库
	int KOUT=3005;//快递出库
	int GAINK=3006;//快递收取
	int W_ALTERPW=3007;//修改登录密码
	int W_LOGIN=3008;//登录
	int GAIN_ALL_K=3009;//显示全部快递单
	int GAIN_K_MESSAGE=3010;//查看寄件详细信息
}
