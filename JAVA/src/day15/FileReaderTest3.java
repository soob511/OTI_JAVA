package day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest3 {
	public static void main(String args[]) {
		try (FileReader reader = new FileReader("src:/iotest/output_ansi.txt");) {
			int data;
			System.out.println(reader.getEncoding());
			while (true) {
				data = reader.read();
				if (data == -1)
					break;
				System.out.print((char) data);
			}
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("sample.txt파일을 찾을 수 없습니다.");
		} catch (IOException ioe) {
			System.out.println("입축력을 처리하는 동안 오류가 발생했습니다.");
		}
	}
}
