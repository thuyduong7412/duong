package manage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SearchFile {
		
		public static ArrayList<MyFile> lookFor(String s,ArrayList<MyFile> lstF) throws FileNotFoundException{
			ArrayList<MyFile> result= new ArrayList<MyFile>();
			for(MyFile tmp:lstF) {
				FileReader f =new FileReader(tmp.getFullPath());
				BufferedReader read= new BufferedReader(f);
				String line;
				try {
					while((line=read.readLine())!=null) {
						if(line.contains(s)) {
							result.add(tmp);
							break;			//phai break
						}
					}
					read.close();
				} catch (IOException e) {
					System.out.println("Program had error: "+e);
				}
			}
			if(result.size()!=0) {
			System.out.println("The files found are: ");
			for(MyFile mf: result) {
				System.out.print("   "+mf.getName()+ ",");
			}
			System.out.println();
			} else {
				System.out.println("Not found.");
			}
			System.out.println("SEARCH DONE. ");
			return result;
		}
}

