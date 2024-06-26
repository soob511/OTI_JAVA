package day15실습;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLab {

    public static void main(String[] args) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("C:/iotest/yesterday.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                sb.append((char) data);
            }
            String content = sb.toString().replaceAll("[.,\n]", " ");
            String[] words = content.split("\\s+");
            for (String word : words) {
                if (word.equals("yesterday")) {
                    count++;
                }
            }
            System.out.printf("yesterday 라는 단어는 %d개 있습니다.%n", count);
        } catch (FileNotFoundException fnfe) {
            System.out.println("yesterday.txt 파일을 찾을 수 없습니다.");
        } catch (IOException ioe) {
            System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
        }
    }
}
