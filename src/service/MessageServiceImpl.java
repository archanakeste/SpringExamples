package service;
public class MessageServiceImpl implements MessageService{

	@Override
	public void sendMessage(String msg, String rec) {
			
		System.out.println(" "+msg +" "+rec);
	}

}
