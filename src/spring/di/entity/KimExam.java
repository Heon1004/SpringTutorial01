package spring.di.entity;


public class KimExam implements Exam {
	private int kor;
	private int eng;

	public KimExam() {

	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return 0;
	}

}
