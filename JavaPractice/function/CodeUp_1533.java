public class CodeUp_1533 {
//3.14�� ���� %f�� ����ϸ� 3.140000 �� ��µȴ�.
	double longreturn() {
		double ab=3.14;
		return ab;
	}
	
	public static void main(String[] args) {

		CodeUp_1533 a=new CodeUp_1533();
		System.out.printf(String.format("%.6f",a.longreturn()));

	}

}
