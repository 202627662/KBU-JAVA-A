import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] weight = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};   // 곱할 값
        int[] jumin = new int[13];                 // 주민등록 번호 13자리
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String input;
        boolean valid = true;
        int i, count = 0;

        System.out.print("주민등록 번호 입력 (예 : 660510-1321611) : ");
        input = keyboard.nextLine();

        for (i = 0; i < input.length(); i++) {     // 숫자만 배열에 저장 ('-' 제외)
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                if (count < 13)
                    jumin[count] = ch - '0';
                count++;
            } else if (ch != '-') {
                valid = false;                     // 숫자, '-' 이외의 문자
            }
        }

        if (count != 13) {
            System.out.println("ERROR : 숫자 13자리를 입력하여야 합니다.");
            valid = false;
        }

        if (valid) {
            /* 성별 코드로 출생 연도 구하기 */
            int century = 0;
            switch (jumin[6]) {
                case 9: case 0: century = 1800; break;
                case 1: case 2: case 5: case 6: century = 1900; break;
                default: century = 2000;           // 3, 4, 7, 8
            }
            int year = century + jumin[0] * 10 + jumin[1];
            int month = jumin[2] * 10 + jumin[3];
            int day = jumin[4] * 10 + jumin[5];

            /* 생년월일 검사 */
            boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            boolean dateOk = false;
            if (month >= 1 && month <= 12) {
                int last = monthDays[month - 1];
                if (month == 2 && leap)
                    last = 29;
                if (day >= 1 && day <= last)
                    dateOk = true;
            }

            /* 지역 코드 검사 */
            int area = jumin[7] * 10 + jumin[8];
            String areaName;
            if (area <= 8) areaName = "서울특별시";
            else if (area <= 12) areaName = "부산광역시";
            else if (area <= 15) areaName = "인천광역시";
            else if (area <= 25) areaName = "경기도";
            else if (area <= 34) areaName = "강원도";
            else if (area <= 39) areaName = "충청북도";
            else if (area == 40) areaName = "대전광역시";
            else if (area == 44) areaName = "세종특별자치시";
            else if (area <= 47) areaName = "충청남도";
            else if (area <= 54) areaName = "전라북도";
            else if (area <= 64) areaName = "전라남도";
            else if (area <= 66) areaName = "광주광역시";
            else if (area <= 70) areaName = "대구광역시";
            else if (area <= 80) areaName = "경상북도";
            else if (area == 85) areaName = "울산광역시";
            else if (area <= 90) areaName = "경상남도";   // 81~84, 86~90
            else if (area <= 95) areaName = "제주특별자치도";
            else if (area == 96) areaName = "세종특별자치시";
            else areaName = "알 수 없음";

            /* 검증 코드 계산 */
            int sum = 0;
            for (i = 0; i < weight.length; i++)
                sum += jumin[i] * weight[i];
            int check = 11 - (sum % 11);
            if (check >= 10)
                check -= 10;

            System.out.println();
            System.out.printf("생년월일 : %d년 %d월 %d일 (%s)\n", year, month, day,
                    dateOk ? "정상" : "오류");
            System.out.printf("지역 코드 : %02d (%s)\n", area, areaName);
            System.out.printf("가중치 합계 : %d, 계산된 검증 코드 : %d, 입력된 검증 코드 : %d\n",
                    sum, check, jumin[12]);

            if (!dateOk || areaName.equals("알 수 없음") || check != jumin[12])
                valid = false;
        }

        if (valid)
            System.out.println("==> 올바른 주민등록 번호입니다.");
        else
            System.out.println("==> 올바르지 않은 주민등록 번호입니다.");
    }
}
