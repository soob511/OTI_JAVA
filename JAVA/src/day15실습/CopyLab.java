package day15실습;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CopyLab {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("c:/iotest/sample.txt");
        		FileWriter writer = new FileWriter(String.format("c:/iotest/sample_%tY_%1$tm_%1$td.txt", LocalDate.now()), true)) {
            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data); 
            }
            writer.write("\n");
            System.out.println("저장 완료되었습니다.");
        } catch (FileNotFoundException fnfe) {
            System.out.println("sample.txt 파일을 찾을 수 없습니다.");
        } catch (IOException ioe) {
            System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
        }
    }

}
