// �ڹ� �⺻ ���α׷���

// ������ �ڷ���
// �Ǽ��� ������Ÿ���� ���е� �׽�Ʈ �ǽ�

public class Test022
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		float a = 0;
		double b = 0;


		// ���� �� ó�� �� 100000(�ʸ�)�� �ݺ�
		for (int i=1; i<=100000; i++)
		{
			//System.out.println("���");

			a += 100000;  //-- a �� 100000 ��ŭ �������Ѷ�
			b += 100000;  //-- b �� 100000 ��ŭ �������Ѷ�

		}

		// ��� ���
		System.out.println("float  a: " + a/100000);
		System.out.println("double b: " + b/100000);
	}
}

// ���� ���
/*
float  a: 99996.055
double b: 100000.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/