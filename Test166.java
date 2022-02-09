// 2022-02-08 ȭ

// �� �÷��� �����ӿ�ũ(Collection Framework)

/*
�� Enumeration �� Iterator �������̽�
   
   Collection Framework ����
   Enumeration �� Iterator ��� �������̽��� �ִ�.
   �������� �ǹ̷δ� �ݺ�, ��ȯ �̶�� �ǹ̸� ������ ������
   � ��ü���� ������ ���� ��, 
   �� ��ü���� � ������ ���� �ϳ��� �����Ͽ� ����ϱ� ����
   �������̽���� �� �� �ִ�.

   - java.util.Enumeration<E> �������̽�
     : �� �������̽��� ���� �� ���� �޼ҵ常�� �����ϸ�
	   ��hasMoreElements()�� �޼ҵ带 ����
	   �������̽� �ȿ� ���� ��Ұ� �ִ����� ���� ���Ǹ� �Ѵ�.
	   ���� true�� ��ȯ�Ǿ��ٸ� ���� �ε����� ��Ұ� �����Ѵٴ� �ǹ��̸�
	   ��nextElement()�� �޼ҵ�� ���� ��Ҹ� ������ ����ϸ� �Ǵ� ���̴�.

	 ex) // v ��� ���� ������ ����� ��� ��� ���
	     for (Enumeration e = v.elements(); e.hasMoreElements();)
		 {
	          System.out.println(e.nextElement());
		 }

   - java.util.Iterator<E> �������̽�
     : Enumeration ���� �������� ���� ��remove()�� �޼ҵ尡 �߰��� �� ���̴�.
	   Iterator �� ������ �ִ� ��hasNext()���� ��next()�� �޼ҵ��
	   �̸��� �ణ �ٸ� �� Enumeration �������̽��� ������ �ִ�
	   ��hasMoreElements()���� ��nextElement()����
	   ��Ȯ�� ��ġ�ϴ� ����� �����Ѵ�.
	   Enumeration ��� Iterator �� JDK 1.2 ���� �߰��Ͽ� ����ϰ� �� ������ 
	   Enumeration �������̽��� ���� ������ ��Ҹ� ������ ����� ���� ������
	   �̸� �����ϱ� ���� ���� ���� Iterator �������̽��̴�.
*/
// Enumeration �� Iterator �������̽��� �Ȱ��ٰ� ���� �ȴ�.
// Iterator�� remove�� �ǹ����� ���� �� ���� ����.
// Enumeration�� 1.1�� Iterator�� 1.2�� ����
// �÷��� ������ ���� ȣȯ�Ǵ� �� �޶� �� �� ����ؾ� ��
// Enumeration - hasMoreElements(), nextElements()
// Iterator    - hasNext(), next(), remove()
//-------------------------------------------------------------------------------------------------
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class Test166
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� �ν��Ͻ� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v�� ��� �߰�
		v.add("Java");
		v.add("Oracle");
		v.add("Jsp");
		v.add("Servlet");
		v.add("Spring");

		// �� Enumeration
		//    - hasMoreElements()
		//    - nextElement()
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println();
		//--==>>
		/*
		Java
		Oracle
		Jsp
		Servlet
		Spring
		*/

		System.out.println("-----------------------------------------------------------------------");
		
		// �� Iterator
		//    - hasNext()
		//    - next()
		Iterator<String> it = v.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		//--==>>
		/*
		Java
		Oracle
		Jsp
		Servlet
		Spring
		*/
	}
}