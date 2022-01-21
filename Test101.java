// 20220119 수
// ▶클래스와 인스턴스
//-------------------------------------------------------------------------------------------------
// 클래스 설계
// 배열 활용
// 접근제어지시자와 정보은닉

// 사용자로부터 년, 월, 일을 입력받아 
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(Calendar)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다. (→ WeekDay 클래스 설계)
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
// 최종적으로 WeekDay 클래스 설계를 통해
// Test101 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

// ※ 1년 1월 1일 → "월요일"

// 실행 예)
// 년 월 일 입력(공백 구분) : 2022 1 19
// >> 2022년 1월 19일 → 수요일
// 계속하려면 . . .

// 년 월 일 입력(공백 구분) : 2022 5 4
// >> 2000년 5월 4일 → 목요일
// 계속하려면 . . .
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;

class WeekDay
{
	// 내 풀이
	/*
	int year,month,day;
	int sum;
	char yoil;
	//int[][] jan,fav,mar,apr,may,jun,july,aug,sep,oct,nov,dec = new int[7][5];
	//int n=1;

	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();		
	}
	char yoil()
	{
		// 년 합계 구하기
		for (int i=1; i<year; i++)
		{
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) // 윤년
			{
				sum+=366;
			}
			else // 평년
			{
				sum+=365;
			}
		}

		// 월 별 일 수 더하기
		for (int i=1; i<month; i++)
		{
			if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
			{
				sum+=31;
			}
			else if (i==2)
			{
				if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
				{
					sum+=29;
				}
				else
				{
					sum+=28;
				}
			}
			else
				sum+=30;
		}
		// 요일 구하기
		if (sum%7==0)
		{
			yoil='월';
		}
		else if (sum%7==1)
		{
			yoil='화';
		}
		else if (sum%7==2)
		{
			yoil='수';
		}
		else if (sum%7==3)
		{
			yoil='목';
		}
		else if (sum%7==4)
		{
			yoil='금';
		}
		else if (sum%7==5)
		{
			yoil='토';
		}
		else if (sum%7==6)
		{
			yoil='일';
		}
		//테스트	
		//System.out.print(yoil);
		return yoil;
	}
	void print()
	{
		System.out.printf("%d년 %d월 %d일 → %c요일%n", year, month, day, yoil);
	}
	*/

	// 수업 풀이

	// 주요 변수 선언
	private int y, m, d; //-- 사용자가 입력한 연, 월, 일을 담아낼 변수

	// 메소드 정의 → 기능 : 연, 월, 일 입력받기
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	// 메소드 정의 → 기능 : 요일 산출하기
	//public void week()
	public String week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// 테스트
		//System.out.println(months.length);
		//--==> 12

		// 요일 이름에 대한 배열 구성
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};

		// 날 수를 종합할 변수
		int nalsu;

		// 윤년에 따른 2월의 날 수 계산
		// 입력 년도가 윤년이라면... 2월의 마지막 날짜를 29일로 설정
		// 입력 년도가 평년이라면... 2월의 마지막 날짜를 28일로 설정
		if (y%4==0 && y%100!=0 || y%400==0) //-- 입력 년도가 윤년이라면... 
		{
			// 2월의 마지막 날짜를 29일로 설정
			months[1] = 29;
		}
		else //-- 입력 년도가 평년이라면...
		{
			// 2월의 마지막 날짜를 28일로 설정
			months[1] = 28;
		}

		// ① 1년 1월 1일부터 입력받은 년도의 이전 년도 12월 31일까지의 날 수 계산
		//                    -------------
		//                          y
		//                    -------------------------
		//                               y-1

		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		//      ----------
		//     1년 기본주기
		//                 ---------
		//                 4년마다+1
		//                             ---------
		//                           100년마다+1(Ⅹ)
		//                                        -----------
		//                                        400년마다+1

		// 테스트
		//System.out.println("날 수 : " + nalsu);
		//--==> 년 월 일 입력(공백 구분) : 2022 6 20
		//      날 수 : 738155
		//              ------
		//              1.1.1~2021.12.31의 총 날 수

		// ② 입력받은 월의 이전 월까지의 날 수 계산 후
		//    이 계산 결과를 1번 결과에 더하는 연산
		for (int i=0; i<(m-1); i++)
		{
			nalsu += months[i];
		}
		
		// 테스트
		//System.out.println("날 수 : " + nalsu);
		//--==> 년 월 일 입력(공백 구분) : 2022 6 20
		//      날 수 : 738306


		// ③ 입력받은 일의 날짜만큼 날 수 계산 후
		//    2번 결과에 더하는 연산
		nalsu += d;

		// 테스트
		//System.out.println("날 수 : " + nalsu);
		//--==> 년 월 일 입력(공백 구분) : 2022 6 20
		//      날 수 : 738326

		//---------------------------------------------------- 여기까지 수행하면 날 수 연산 끝!!!

		// 무슨 요일인지 확인하기 위한 연산
		int w = nalsu % 7;  //-- 전체날수 % 7 == 0 → 일요일
						    //-- 전체날수 % 7 == 1 → 월요일
							//-- 전체날수 % 7 == 2 → 화요일
							//              :
		//테스트
		//System.out.println("W : " + w);
		//--==> 년 월 일 입력(공백 구분) : 2022 6 20
		//      w : 1

		return weekNames[w];

	}
	
	// 메소드 정의 → 기능 : 결과 출력하기
	public void print(String day)
	{
		System.out.printf(">> %d년 %d월 %d일 → %s요일\n",y ,m ,d ,day);
	}	

}

public class Test101
{
	public static void main(String[] args)
	{
		// 내 풀이
		/*
		WeekDay ob = new WeekDay();

		ob.input();
		char yoil = ob.yoil();
		ob.print();
		*/

		// 수업 풀이
		// WeekDay 클래스 기반 인스턴스 생성
		WeekDay wd = new WeekDay();
		
		// 입력 메소드 호출
		wd.input();

		// 요일 산출 메소드 호출 및 결과 확인
		String result = wd.week();
		
		// 최종 결과 출력 메소드 호출
		wd.print(result);
	}
}