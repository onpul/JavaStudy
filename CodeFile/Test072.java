// 20220113 ��
// ��Ŭ������ �ν��Ͻ�
//-------------------------------------------------------------------------------------------------
// ���簢�� Ŭ���� ���� �ǽ�

/*
���簢���� ���̿� �ѷ� ��� �� Ŭ���� ǥ��

Ŭ������ ��ü�� �� ���簢��
Ŭ������ �Ӽ�   �� ����, ���� (, ����, �ѷ�, ����, ����, ����, ����, ...)
Ŭ������ ���   �� ���� ���, �ѷ� ��� (, ���μ��� �Է�, ��� ���, ...)

��ü�� ����     �� ������(�Ӽ�, ����) + ���(����,����)
    ��                    ��                  ��
Ŭ���� ����     ��       ����         +     �޼ҵ� 

//-------------------------------------------------------------------------------------------------
class ���簢��
{
	// ������(�Ӽ�, ����)  �� ���� (���� �ǹ� ����)
	int ����, ����;

	// ���(����, ����)    �� �޼ҵ� (���� �ǹ� ����)
	���μ��� �Է�()
	{
	}

	�ѷ� ���()
	{
	}

	���� ���()
	{
	}

	��� ���()
	{
	}
}
*/
//-------------------------------------------------------------------------------------------------

import java.util.Scanner; // �� ���� Ŭ���� --> �� �� ����� ���� �־�� ��

class Rect // ���簢�� Ŭ���� ����
{
	// ������(�Ӽ�, ����)  �� ����
	int w, h; // ����, ����
	
	// ���(����, ����)    �� �޼ҵ�
	void input() // ���μ��� �Է�()
	{	
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		w = sc.nextInt();

		System.out.print("���� �Է� : ");
		h = sc.nextInt();
	}

	int calLength() // �ѷ� ���() �� (����+����)*2
	{	
		
		int result;
		result = (w+h)*2;
		return result;
		
		// return (w+h)*2; // <-- �̰͵� ����
	}

	int calArea() // ���� ���() �� ����*����
	{	
		// �ֿ� ���� ����
		int result;

		// ���� �� ó�� �� ������ �����鿡 �� ��Ƴ���
		result = w*h;

		// ���� ��� ��ȯ
		return result;

		// return w*h; // <-- �̰͵� ����~!
	}

	void print(int a, int l) // ��� ���() �� ���̿� �ѷ� ����
	{
		// ���� : 10
		// ���� : 20
		// ���� : XXX
		// �ѷ� : XXX
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);
	}
}

// �� �ϳ��� �ڹ� ����(.java)�� ���� ���� Ŭ����(class)�� ������ �� �ִ�!!!
//	  ������, ��public class���� �ϳ��� �� �� �ִ�.
//    ������ ������ ���� �̸���
//    �� ��public class���� �̸����� �����ؾ� �Ѵ�.
//    �Ϲ������δ� �ϳ��� ���Ͽ� Ŭ������ �����Ѵ�.
//    ����, ���� ���� Ŭ������ ����� ������ �������ϰ� �Ǹ�
//    ���ο� ����� Ŭ������ ����ŭ Ŭ���� ����(.class)�� �Ļ��ȴ�. <-- �߿�!!!

public class Test072
{
	public static void main(String[] args)
	{
		// Rect Ŭ���� ����� �ν��Ͻ� ����
		Rect ob = new Rect();
		
		// �Է� �޼ҵ� ȣ��
		ob.input();

		// ���� ���� �޼ҵ� ȣ��
		int area = ob.calArea();

		// �ѷ� ���� �޼ҵ� ȣ��
		int length = ob.calLength(); 

		// ��� �޼ҵ� ȣ��
		ob.print(area, length);
	}
}
// ���� ���
/*
���� �Է� : 20
���� �Է� : 30
���� : 20
���� : 30
���� : 600
�ѷ� : 100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/