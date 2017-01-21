import java.io.*;
import java.util.*;
import java.net.URL;
import java.util.Scanner;

public class WebSpider {
	public static void main(String[] args){
		try{
			System.out.print("What would you like to search? ");
			Scanner in = new Scanner(System.in);
			String s = in.next();
			HashMap<String, Boolean> map = new HashMap<String, Boolean>();
			ArrayList<URL> urls = new ArrayList<URL>();
			ArrayList<BufferedReader> brs = new ArrayList<BufferedReader>();
			String whitworth = "http://www.whitworth.edu/cms/search/?q="+s+"&cof=FORID%3A11&cx=014952055042930976529%3Ahmzp0oq3gsq";
			URL url = new URL(whitworth);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			int i=100;
			//<a\s*?href="(http:.*?)"
			while((line = br.readLine()) != null && i>0){
				i--;
				//line<a\s*?href="(http:.*?)"
				if(line.contains("http:.*?")==true){
					URL tempURL = new URL(".*?");
					map.put(line, true);
					System.out.printf(line);
					urls.add(tempURL);
					BufferedReader tempBR = new BufferedReader(new InputStreamReader(tempURL.openStream()));
					brs.add(tempBR);}}
			for(int a=0; a<urls.size(); a++){
				int j=100;
				while((line = brs.get(a).readLine()) != null && j>0){
					j--;
					System.out.printf("%s\n", line);}
			}
			}
		catch(Exception ex){
			System.out.printf("Oops: %s", ex.getMessage());}
	}
}
