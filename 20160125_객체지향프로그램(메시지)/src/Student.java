
public class Student {
    private int hakbun;
    private String name;
    private String sex;
    private String subject;
    private int kor;
    private int math;
    private int eng;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
		// �������     �������� 
		// this�� ������ �����ϴ� => ���������� ���� �̸��̸� ������ �� ����
		// this : �ڽ��� ��Ÿ���ִ� ��ü�� 
		/*
		 *  this => �����Ǵ� ���� 
		 *     Student s=new Student();
		 *     this=s; (JVM)
		 *     �����ġ 
		 *       => ����޼ҵ�ȿ���,
		 *          �����ڿ����� ����� �����ϴ� 
		 */
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	   
   // �б�,���� 
   
   
}
