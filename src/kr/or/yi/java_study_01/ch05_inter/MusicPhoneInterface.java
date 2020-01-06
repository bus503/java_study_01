package kr.or.yi.java_study_01.ch05_inter;

public interface MusicPhoneInterface extends MP3Interface, MobilePhoneInterface {
	void playMP3RingTone();
}
