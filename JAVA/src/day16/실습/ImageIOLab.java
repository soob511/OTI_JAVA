package day16.실습;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ImageIOLab {

    public static void main(String[] args) {
        // 이미지 저장 디렉토리 확인 및 생성
        String dirPath = "c:/iotest/myimage";
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        try (FileReader reader = new FileReader("c:/iotest/list.txt");
             BufferedReader br = new BufferedReader(reader)) {
            String data;
            while ((data = br.readLine()) != null) {
                String[] parts = data.split(",");
                if (parts.length < 2) {
                    continue;
                }
                
                String name = parts[0];
                String urlStr = parts[1];

                try {
                    URL req = new URL(urlStr); 
                    InputStream is = req.openStream();
                    String fileName = dirPath + "/" + name + ".jpg";
                    
                    try (FileOutputStream fos = new FileOutputStream(fileName)) {
                        int input;
                        while ((input = is.read()) != -1) {
                            fos.write(input);
                        }  
                    }
                    System.out.println(name + ".jpg가 성공적으로 저장되었습니다.");
                 
                } catch (IOException e) {
                    System.out.println("URL을 처리하는 동안 오류가 발생했습니다: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException ioe) {
            System.out.println("파일을 읽을 수 없습니다.");
        }
    }
}
