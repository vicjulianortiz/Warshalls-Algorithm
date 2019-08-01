import java.io.*;
import java.util.*;

public class fileReader{

	private int numOfRow;
	private int numOfCol;
	Scanner inputFile;
	Scanner sc = new Scanner(System.in);

	public fileReader(int num1, int num2){
		numOfRow = num1;
		numOfCol = num2;
	}

	public boolean[][] readFile(){
		System.out.println("Reading file...");

		boolean[][] arr = new boolean[numOfRow][numOfCol];

		while(inputFile.hasNext()){
			for(int i = 0; i < numOfRow; i ++){
				for(int j = 0; j < numOfCol; j++){
					String temp = inputFile.next();
					if(temp.equals("true"))
						arr[i][j] = true;
					else
						arr[i][j] = false;
				}
			}
		}
		return arr;
	}

	public void openFile(){
		try{
			inputFile = new Scanner(new File("coptioninput.txt"));
		}

		catch(Exception e){
			System.out.println("This file was not able to be opened.");
		}
	}

	public void fileClose(){
		inputFile.close();
	}
}