import java.io.*;
import java.lang.*;
import java.util.*;

public class fileCreator{

	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private boolean[][] arr;
	private int numOfRow;
	private int numOfCol;

	public fileCreator(boolean[][] arr, int num1, int num2){
		this.arr = arr;
		numOfRow = num1;
		numOfCol = num2;
	}

	public void openFile(){
		try{
			fileWriter = new FileWriter("coptionouput.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
		}
		catch(Exception e){
			System.out.println("This method was not able to create the file");
		}
	}
	public void addRecords(){
		System.out.println("Writing to file...");

		for(int i = 0; i < numOfRow; i++){
			for(int j = 0;  j < numOfCol; j++){
				if(arr[i][j] == true){
					try{
						bufferedWriter.write("true " );
					}
					catch(Exception e){
						System.out.println("There was a problem writing to the file.");
					}
				}
				else{
					try{
						bufferedWriter.write("false ");
					}
					catch(Exception e){
						System.out.println("There was a problem writing to the file.");
					}
				}
				if(j == 6){
					try{
						bufferedWriter.newLine();
					}
					catch(Exception e){
						System.out.println("There was a problem writing to the file.");
					}
				}
			}
		}
	}

	public void closeFile(){
		try{
			bufferedWriter.close();
		}
		catch(Exception e){
			System.out.println("There was a problem closing the file.");
		}
	}
}
