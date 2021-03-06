// 20220117 월
// ▶배열
//-------------------------------------------------------------------------------------------------
// 배열의 기본적 활용

// ●과제
//   사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
//   입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
//   단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수   : 12
// 데이터 입력(공백 구분) : 74 65 13 91 5 67 33 41 2 50 11 38 
// >> 가장 큰 수 → 91
// 계속하려면 아무 키나 누르세요...
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.io.IOException;

public class Test085
{
	public static void main(String[] args) throws IOException
	{
		// 스캐너 인스턴스 생성
		Scanner sc = new Scanner(System.in); // 공백 구분이니까 스캐너로 입력 받기

		// 변수, 배열 선언
		int num; // 사용자가 입력할 데이터의 갯수
		int[] arr; // 배열
		int max=0; // 가장 큰 수
	
		// 1. 사용자에게 입력 받아 배열 길이 설정
		System.out.print("입력할 데이터의 갯수   : ");
		num=sc.nextInt();
		// System.out.print(num); // (테스트)

		arr = new int[num]; // 사용자가 입력한 갯수만큼 배열 길이 설정
		// System.out.print(arr.length); // (테스트)

		// 2. 갯수만큼의 데이터 입력 받기, 배열에 저장
		System.out.print("데이터 입력(공백 구분) : ");
		
		for (int i=0; i<num; i++) // i는 0부터 데이터 갯수만큼(0부터니까 포함X)
		{
			arr[i]=sc.nextInt();
		}
	
		// 배열 출력 테스트
		/*
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		*/
		
		// 3. 가장 큰 수 찾기
		for (int i=0; i<num; i++) // 배열 길이만큼 반복
		{
			if (arr[i] > max) // 배열 순서대로 max값에 들어가며 비교
			{
				max = arr[i];
			}
		}
		System.out.println(">> 가장 큰 수 → " + max);
	}
}
//-------------------------------------------------------------------------------------------------
// 실행 결과
/*
입력할 데이터의 갯수   : 12
데이터 입력(공백 구분) : 74 65 13 91 5 67 33 41 2 50 11 38
>> 가장 큰 수 → 91
계속하려면 아무 키나 누르십시오 . . .
*/