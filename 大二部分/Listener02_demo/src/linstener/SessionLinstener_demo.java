package linstener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionLinstener_demo implements HttpSessionListener{
	 private static int count;

		public void sessionCreated(HttpSessionEvent hse) {
			this.count++;
	       
		}

		public void sessionDestroyed(HttpSessionEvent hse) {
			this.count--;	

		}
	   
		public static int getcount(){
			return count;
		}
}
