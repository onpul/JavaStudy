// 2022-02-04 ��

// �� �÷��� �����ӿ�ũ(Collection Framework)

/*
�� ť (Queue)

   ť(Queue)�� ���Լ���(FIFO, First Input First Output) ������
   ���� �Էµ� �ڷḦ ���� ����ϸ�
   Queue �������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�.

�� Queue �������̽� �ν��Ͻ��� �����ϱ� ���ؼ���
   new �����ڸ� �̿��Ͽ� Queue �������̽��� ������(implements)
   Ŭ������ �����ڸ� ȣ���Ѵ�.

   ex) Queue ob = new LinkedList();

�� �ֿ� �޼ҵ�

   - E element() 
     ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.
   
   - boolean offer(E o)
     ������ ��Ҹ� ť�� �����Ѵ�.
   
   - E peek()
     ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
	 ť �ڷᱸ���� empty�� ��� null�� ��ȯ�Ѵ�.
   
   - E poll()
     ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
	 ť �ڷᱸ���� empty�� ��� null�� ��ȯ�Ѵ�.

   - E remove()
     ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.
*/
// �籸 �p�� �����ϱ�
// �� ����.. ���� ���� �����ϱ�
//-------------------------------------------------------------------------------------------------
import java.util.Queue;
import java.util.LinkedList;

public class Test158
{
	public static void main(String[] args)
	{
		// Queue �ڷᱸ�� ����
		//Queue myQue = new Queue(); //-- ���� �������̽��� �ν��Ͻ� ���� �� ��
		Queue<Object> myQue = new LinkedList<Object>();

		// ������ �غ�
		String str1 = "�����";
		String str2 = "������";
		String str3 = "������";
		String str4 = "������";

		// myQue ��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		//myQue.offer(str4);
		boolean test = myQue.offer(str4);

		// �׽�Ʈ(Ȯ��)
		//System.out.println(myQue); //-- ����
		//--==>> [�����, ������, ������, ������]
		//-- �����͸� ��Ʈ�� �ϴ� ������ν� ��µ� �� �ƴ϶�, ������ '����' ��������
		//   ���� Ȯ���� �� �� �ֵ��� ���� �����ٰ�..~
		
		// Queue �ڷᱸ������ ��Ҹ� �������� �ʰ� head ��� ��ȯ
		System.out.println("��1 : " + (String)myQue.element());
		System.out.println("��2 : " + (String)myQue.element());
		System.out.println("��3 : " + (String)myQue.element());
		System.out.println("��4 : " + (String)myQue.element());
		/*
		��1 : �����
		��2 : �����
		��3 : �����
		��4 : �����
		*/

		System.out.println();

		String val;

		// �� --------------------------------------------------------------------------------------
		// peek()
		//-- ť�� head ��� ��ȯ. ���� �� ��.
		//   ť�� empty�� ��� null�� ��ȯ.
		/*
		while (myQue.peek() != null)
		{
			// poll()
			//-- ť�� head ��� ��ȯ. ������.
			//   ť�� empty�� ��� null�� ��ȯ.
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		*/
		/*
		//--==>>
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/
		
		// �׽�Ʈ
		/*
		while (myQue.poll() != null)
		{
			// poll()
			//-- ť�� head ��� ��ȯ. ������.
			//   ť�� empty�� ��� null�� ��ȯ.
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		*/
		//--==>> 
		/*
		��� : ������
		��� : ������
		*/

		// �� --------------------------------------------------------------------------------------
		/*
		while (true)
		{
			val = (String)myQue.poll(); // �����ϸ鼭

			if (val==null)
				break;
			else
				System.out.println("��� : " + val);
		}
		System.out.println();
		*/
		/*
		//--==>>
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/

		// �� --------------------------------------------------------------------------------------
		/*
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		//--==>>
		*/
		/*
		��� : �����
		��� : ������
		��� : ������
		��� : ������
		*/

	}
}