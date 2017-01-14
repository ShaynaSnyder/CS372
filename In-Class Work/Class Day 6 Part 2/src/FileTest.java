import java.io.*;

public class FileTest {
	public static void main(String[] args){
		String curdir = System.getProperty("user.dir") + "\\src";
		File cd = new File(curdir);
		File[] files = cd.listFiles();
		for(File f: files){
			if(f.getName().endsWith(".java")){
				try(FileInputStream is = new FileInputStream(f)){
					InputStreamReader ir = new InputStreamReader(is);
					BufferedReader rdr = new BufferedReader(ir);
					String line = rdr.readLine();
					while(line != null){
						if(line.contains("\"")){
							System.out.printf("");
						}
						line = rdr.readLine();}
					System.out.printf("%s: %s\n", f.getName(), line);}
				catch(Exception ex){System.out.printf("Failed for %s\n", f.getName());}
			}
		}
	}
}
