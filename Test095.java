// 20220118 ȭ
// ���迭
// �迭�� �迭(2���� �迭)
//-------------------------------------------------------------------------------------------------

// �� ����
//    �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//    ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//    �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
   A
   B  C
   D  E  F
   G  H  I  J
   K  L  M  N  O

����Ϸ��� . . .
*/
//-------------------------------------------------------------------------------------------------
public class Test095
{
	public static void main(String[] args)
	{
		// �迭 �� ���� ����
		char[][] arr = new char[5][5];
		char ch = 'A';
		
		// �迭 ä��� --> �� ��� ��������
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<=i; j++)
			{
				arr[i][j] = ch;
				ch++;
			}
		}

		// ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
//-------------------------------------------------------------------------------------------------
//���� ���
/*
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/