// ������

// ���� ������ == ���� ������

/*
   �ǿ����� ������ �ǿ����� ������ �ǿ�����
   --------        --------        --------
     1��             2��             3��


   �ǿ�����    ?   �ǿ�����    :   �ǿ�����
   --------        --------        --------
     1��             2��             3��


	1���� ���� ��� ��  true  �� 2�� ����
	                ��  false �� 3�� ����
*/


// ����ڷκ��� ������ ������ �Է¹޾� 
// �Է¹��� ������ ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��� �����Ѵ�.
// ��, ���ǿ�����(���׿�����)�� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 255

// ==[�Ǻ� ���]==
// 255 �� Ȧ��
// ===============

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029 
{
	public static void main(String[] args) throws IOException // �����ݷ� �� ��!
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n; // ����ڷκ��� �Է¹��� ������ ������ ��Ƶ� ����
		String strResult; // Ȧ������ ¦�������� ���� �Ǻ� ����� ��� �� ����

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());


		// Ȧ������ ¦�������� ���� �Ǻ� ����
		// _______?_______:_______
		//  ����1   ����2   ����3

		// ����1 : ��(true) �Ǵ� ����(false)�� ��ȯ�� �� �ִ� ���� ���·� �ۼ�
		// ����2 : ����1�� ó�� ����� ��(true)�� ��� �����ϴ� ����
		// ����3 : ����1�� ó�� ����� ����(false)�� ��� �����ϴ� ����

		// �Է¹��� ����(n)�� Ȧ������ ¦������ Ȯ���ϱ� ���� ����
		// �� n�� 2�� ����� �������� 0�̸�      �� ¦��
		// ��                           0�� �ƴϸ� �� Ȧ��

		strResult = (n%2==0) ? "¦��" : "Ȧ��";
		// strResult = (4%2==0) ? "¦��" : "Ȧ��";
		// strResult = (0==0) ? "¦��" : "Ȧ��";
		// strResult = true ? "¦��" : "Ȧ��";
		// strResult = "¦��";

		// ���� ��� ���
		System.out.println();
		System.out.println("==[�Ǻ� ���]==");
		System.out.printf("%d �� %s\n", n, strResult);
		System.out.println("===============");
	}
}
// ���� ���
/*
������ ���� �Է� : 45

==[�Ǻ� ���]==
45 �� Ȧ��
===============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/