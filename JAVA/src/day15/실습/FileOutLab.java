package day15.실습;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {

	public static void main(String[] args) {
		String path = "C:/Temp";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}
		try (FileWriter writer = new FileWriter("C:/Temp/event.txt", true);
				PrintWriter out = new PrintWriter(writer);) {
			LocalDate targetDate = LocalDate.of(2024, 5, 5);
			int year  = targetDate.getYear();
			int month = targetDate.getMonthValue();
			int day = targetDate.getDayOfMonth();
			String korday = targetDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);
			out.printf("%d년 %d월 %d일은 %s입니다.\r\n",year,month,day,korday);
			targetDate = LocalDate.of(2024, 8, 15);
			korday = targetDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);
			out.printf("2024년 8월 15일은 %s입니다.\r\n",korday);
			System.out.println("저장이 완료되었습니다.");
		} catch (Exception e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}

}
