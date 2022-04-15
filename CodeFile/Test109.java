// 20220124 ��

// �� ����(Sort) �˰�����

/*
�� ����
   : �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
   : ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
     �� ���� ���� �˻��ϱ� ����

�� ������ ����
   : ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ����, ....
   
- ������ ���ҽ� �Ҹ� ���� �۾��̴�
- ����� ��������!
- ex) Ű ��
*/

// ���� ����(Selection Sort)

// ���� ��)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// ����Ϸ��� . . .
//-------------------------------------------------------------------------------------------------

public class Test109
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		42 52 12 62 60
		== --

		12 52 42 62 60
		==    --

		12 52 42 62 60
		==       --

		12 52 42 62 60
		==          --
		---------------------------- 1ȸ��

		12 42 52 62 60
		   == --

		12 42 52 62 60
		   ==    --

		12 42 52 62 60
		   ==       --
		---------------------------- 2ȸ��
		
		12 42 52 62 60
		      == --

	    12 42 52 62 60
		      ==    --
	    ---------------------------- 3ȸ��

		12 42 52 60 62
		         == --
		---------------------------- 4ȸ��
		*/
//-------------------------------------------------------------------------------------------------
		// ���� Ǯ��
		
		int i, j;

		System.out.print("Source Data : ");

		/*
		for (i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/

		// ���� for��(foreach ����)
		// �� �о�� �� ��
		for (int n : a) // �����ʺ��� �ۼ� -> �ڷᱸ�� / ���� -> ������ �� � Ÿ������, ������ �̸��� ��� ��
		{ 
			System.out.print(n + " ");
		}
		System.out.println();
		// a�� ù��°���� ���������� ������ ���� -> 5�� ����.
		// �Ϲ� for��ó�� ��ȣ ���� ����

		// Selection Sort
		for (i=0; i<a.length-1; i++)           // �� ~     �� �� ���� ������          (0    1    2    3)
		{                                      //                                        |    |    |    |
			for (j=i+1; j<a.length; j++)       // ������!  �� �� ��� ������           1234 234  34   4
			{
				// if (a[i] > a[j]) // �������� ����
				if (a[i] > a[j])    // �������� ����
				{
					// �ڸ� �ٲٱ�
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}

		System.out.print("Sorted Data : ");
		/*
		for (i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/
				
		// ���� for��(foreach ����)
		for (int n : a) // �����ʺ���!
		{
			System.out.print(n + " ");
		}
		System.out.println();
//-------------------------------------------------------------------------------------------------
		// �� Ǯ��

		// 52, 42, 12, 62, 60

		/*
		for (int i=0; i+1<a.length; i++)
		{
			if (a[i] > a[i+1])
			{
				a[i+1]=a[i+1]^a[i];
				a[i]=a[i]^a[i+1];
				a[i+1]=a[i+1]^a[i];
			}
		}
		// 42 12 52 60 62

		for (int i=0; i<a.length; i++)
		{
			if (a[i] > a[i+1])
			{
			}
		}

		// ���
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/
	}
}
//-------------------------------------------------------------------------------------------------
// ���� ���
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/