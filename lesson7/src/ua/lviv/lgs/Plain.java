package ua.lviv.lgs;

public abstract class Plain extends PlainControl{

	private int lenth;
	private int width;
	private int weigth;
	
	
	void enginStart() {
		int time = (int)(Math.random()*(88-20+1)+20);
		System.out.println("˳��� ���� ������� ������� ����� "+time+" ���");
	}

	void plainTake_off() {
		int distance = (int)(Math.random()*1000);
		System.out.println("˳��� ��������� "+distance+" ��");
	}
	
	void plainLanding() {
		System.out.println("˳��� ��� �� �������");
	}

	public Plain(int lenth, int width, int weigth) {
		super();
		this.lenth = lenth;
		this.width = width;
		this.weigth = weigth;
	}
	
}
