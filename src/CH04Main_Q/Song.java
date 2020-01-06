package CH04Main_Q;

public class Song {
	public String title;
	public String artist;
	public int year;
	public String country;
	
	
	
	public Song() {
		// TODO Auto-generated constructor stub //기본생성자
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;    //매개변수로 모든 필드를 초기화하는 생성자
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show() {
		System.out.printf("%d년 %s국적의 %s가 부른 %s", year, country, artist, title );
	}
}

