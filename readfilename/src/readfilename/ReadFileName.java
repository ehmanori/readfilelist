package readfilename;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
	    System.out.println("Working Directory = " + path);
		
		String DATA_DIRECTORY = path;
		File dir = new File(DATA_DIRECTORY);

		//디렉토리 내 모든 파일 이름만 가져옴
		String[] filenames = dir.list();
		for (String filename : filenames) {
			System.out.println("filename : " + filename);
		}
		
		//파일에 쓰기
		 try {
			 
	            // 1. 파일 객체 생성
	            File file = new File(path+"\\FileList.txt");
	 
	            // 2. 파일 존재여부 체크 및 생성
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	 
	            // 3. Buffer를 사용해서 File에 write할 수 있는 BufferedWriter 생성
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter writer = new BufferedWriter(fw);
	 
	            // 4. 파일에 쓰기
	            for(String filename:filenames) {
	            	writer.write(filename);
	            	writer.write('\n');
	            }
	            
	 
	            // 5. BufferedWriter close
	            writer.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
