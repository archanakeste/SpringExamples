package service;

public class PrivateMessageServiceImpl implements MessageService {
	
	@Override
	public void sendMessage(String msg, String rec) {
		System.out.println("SMS "+msg +"SMS REC "+rec);
	}

}
