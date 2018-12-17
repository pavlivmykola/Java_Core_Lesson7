package ua.lviv.lgs;

public class CY_27 extends Plain implements Stels, TurboAcceleration, NuclearStrike{
	
	private int maxSpeed;
	private String color;
	
	public CY_27(int lenth, int width, int weigth, int maxSpeed, String color) {
		super(lenth, width, weigth);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void nuclearStrike() {
		int number=(int)(Math.random()*10+1);
		System.out.println("������� "+number+" ���������");
	}

	@Override
	public void turboAcceleration() {
		int acceleration = (int)(Math.random()*100);
		System.out.println("�������� ����� "+(maxSpeed+acceleration)+" ��/���");
		
	}

	@Override
	public void stelsTechnology() {
		int time = (int)(Math.random()*60);
		System.out.println("˳��� �� ���� ����� �������� "+time+" ���");
		
	}
	

}
