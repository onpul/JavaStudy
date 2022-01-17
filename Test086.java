// 20220117 월
// ▶배열
//-------------------------------------------------------------------------------------------------
// 배열의 기본적 활용

// ●과제
//   사용자로부터 임의의 학생 수를 입력받고
//   그만큼의 점수(정수 형태)를 입력받아
//   전체 학생 점수의 합, 평균, 편차를 구하여
//   결과를 출력하는 프로그램을 구현한다.
//   단, 배열을 활용하여 처리할 수 있도록 한다.

//   실행 예)
//   학생 수 입력 : 5
//   1번 학생의 점수 입력 : 90
//   2번 학생의 점수 입력 : 82
//   3번 학생의 점수 입력 : 64
//   4번 학생의 점수 입력 : 36
//   5번 학생의 점수 입력 : 98

//   >> 합 : 370
//   >> 평균 : 74.0
//   >> 편차 : 
//   90 : -16.0
//   82 : -8.0
//   64 : 10.0
//   36 : 38.0
//   98 : -24.0
//   계속하려면 아무 키나. . .
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.io.IOException;

public class Test086
{
	public static void main(String[] args) throws IOException
	{
		// 스캐너 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		int num; // 학생 수
		int[] arr; // 배열
		int sum=0; // 합계
		double aver, devi; // 평균, 편차
		aver=devi=0;

		// 사용자로부터 학생 수 입력받기
		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();

		// 학생 수만큼 배열 길이 설정
		arr = new int[num];

		// 배열 길이만큼(학생 수만큼 점수 입력받기, 배열에 저장)
		for (int i=0; i<num; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", (i+1));
			arr[i] = sc.nextInt();
		}		

		// 테스트 (배열 전체 출력)
		/*
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		*/

		// 합계, 평균 구하기
		for (int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
			aver=sum/arr.length;
		}
		// 테스트 
		//System.out.println("합계: " + sum);
		//System.out.println("평균: " + aver);

		// 출력
		System.out.printf(">> 합 : %d%n", sum);
		System.out.printf(">> 평균 : %.1f%n", aver);
		System.out.println(">> 편차 : ");


		// 편차 구하기 + 출력
		for (int i=0; i<arr.length; i++)
		{
			devi = aver-arr[i];
			System.out.printf("%d : %.1f%n", arr[i], devi);
		}
	}
}
//-------------------------------------------------------------------------------------------------
// 실행 결과
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98
>> 합 : 370
>> 평균 : 74.0
>> 편차 :
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
계속하려면 아무 키나 누르십시오 . . .
*/