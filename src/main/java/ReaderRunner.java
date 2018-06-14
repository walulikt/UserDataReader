import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReaderRunner {

	public static void main(String[] args) {	
		Scanner scanner=null;
		File file = new File("userData.txt");
		DataReader dr = new DataReader();
		DataGenerator dataGenerator = new DataGenerator();
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(scanner.hasNextLine()) {
			String userData=scanner.nextLine();
			dataGenerator.getUsersList().add(dr.stringSpliter(userData));
		}
		dataGenerator.printInfo();
		scanner.close();
	}
}
