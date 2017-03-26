package readConf;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;

public class Conf{ 

	public static String ConfRead(String filePath, String key){
		FileReader fr = null;
		BufferedReader br = null;
		String line;
		String value = "";
		try{
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
	 
			while ((line = br.readLine()) != null) {
				if(line.startsWith(key)){	//前方一致したら
					System.out.println(line);

					String[] parts;
					if(line.matches(".*"+" = "+".*")){
						parts = line.split(" = ",0);
						value = parts[1];
					}

				}

			}

		} catch (FileNotFoundException e) {	//fileが存在しない
			e.printStackTrace();
		} catch (IOException e) {	//IOエラー?
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {	//IOエラー?
				e.printStackTrace();
			}

	    	}
		return value;
	}
}
