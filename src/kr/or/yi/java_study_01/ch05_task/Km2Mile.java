package kr.or.yi.java_study_01.ch05_task;

class Km2Mile extends Converter{

	public Km2Mile (double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "km";
	}

	@Override
	protected String getDesString() {
		// TODO Auto-generated method stub
		return "mile";
	}

   
}
