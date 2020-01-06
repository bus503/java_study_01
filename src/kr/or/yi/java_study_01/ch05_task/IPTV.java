package kr.or.yi.java_study_01.ch05_task;

class IPTV extends ColorTV {
    

	String ip;
     
      public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
      
      void printProperty() {
  		System.out.print("나의 IPTV는"+ip+" ");
  		super.printProperty();
  	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}  
      
      
      
}
