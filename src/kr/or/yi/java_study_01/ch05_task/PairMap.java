package kr.or.yi.java_study_01.ch05_task;

public abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];

	abstract String get(String key);

	abstract void put(String key, String value);

	abstract String delete(String key);

	abstract int length();

	public PairMap() {
		// TODO Auto-generated constructor stub
	}
	
}
