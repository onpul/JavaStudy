// 20220127 ��

// �� �ڹ��� �ֿ�(�߿�) Ŭ����

// Wrapper Ŭ����

//-------------------------------------------------------------------------------------------------

public class Test133
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi); // Boolean Ŭ���� ������� �ν��Ͻ� ����
		Boolean wBi = bi; // Boolean ��ü Ÿ�Կ� ������Ƽ�� �� ����
		                  //-- ���� �ڽ�

		int n = 300;
		Integer wrapN = new Integer(n); // Integer Ŭ���� ������� �ν��Ͻ� ����
		int n2 = wrapN;   //-- ���� ��ڽ�

		float f = 300.3f;
		Float wrapF = new Float(f); // Float Ŭ���� ������� �ν��Ͻ� ����

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());
		//--==>> true
		//		 300
		//		 300.3

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);
		//--==>> true
		//		 300
		//		 300.3


		// Integer Ŭ����

		String sn = "12";
		int ni = Integer.parseInt(sn); //parseInt�� ����ƽ �޼ҵ� -> �ν��Ͻ� �������� �ٷ� �� �� ����
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  12

		ni = Integer.parseInt("0101", 2); // �����ε�
		System.out.printf("ni : %3d\n", ni);
        //--==>> ni :   5

		ni = Integer.parseInt("12", 8); // 8����
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  10

		ni = Integer.parseInt("A", 16); // 16����
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  10

        //-------------------------------------------

		sn = Integer.toBinaryString(20); // 2����
		//toBinaryString�� ����ƽ �޼ҵ� -> �ν��Ͻ� �������� �ٷ� �� �� ����
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 10100

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n", sn); // 8����
		//--==>> sn : 37

		sn = Integer.toHexString(31); // 16����
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 1f

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		//--==>> 345

		// to ~~ �� �ַ� ��ȯ�� �����ϴ±���.
		// api doc ���� ���� ã�ƺ���
	}
}