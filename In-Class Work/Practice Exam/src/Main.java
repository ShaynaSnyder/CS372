import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		try(FileInputStream is = new FileInputStream("Customers.csv")){
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader rdr = new BufferedReader(ir);
			String line = rdr.readLine();
			while(line != null){
				String[] parts = line.split(",");
				for(String p: parts){
					if(p.length()>0 && p.charAt(0) == '"')
						System.out.printf("%s\t", p.substring(1, p.length()-1));
					else
						System.out.printf("%s\t", p);}
				line = rdr.readLine();}}
		catch (Exception ex){System.out.printf("Failed for %s\n", "Customers.csv");}}}
