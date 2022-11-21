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

		//���丮 �� ��� ���� �̸��� ������
		String[] filenames = dir.list();
		for (String filename : filenames) {
			System.out.println("filename : " + filename);
		}
		
		//���Ͽ� ����
		 try {
			 
	            // 1. ���� ��ü ����
	            File file = new File(path+"\\FileList.txt");
	 
	            // 2. ���� ���翩�� üũ �� ����
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	 
	            // 3. Buffer�� ����ؼ� File�� write�� �� �ִ� BufferedWriter ����
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter writer = new BufferedWriter(fw);
	 
	            // 4. ���Ͽ� ����
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
