import java.io.*;
import java.util.*;

public class coption
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter how many rows you would like your array to have.");
		int numOfRow = sc.nextInt();

		System.out.println("Please enter how many columns you would like your array to have.");
		int numOfCol = sc.nextInt();

		fileReader a1 = new fileReader(numOfRow, numOfCol);
		a1.openFile();
		boolean[][] inputArray = a1.readFile();
		a1.fileClose();

		for( int i = 0; i < numOfRow; i++)
				{
					for(int j = 0; j < numOfCol; j++)
					{
						System.out.print(inputArray[i][j] + " ");
						if(j == (numOfCol - 1))
							System.out.println();
					}
		}

		warshallAlgorithm b1 = new warshallAlgorithm(numOfRow, numOfCol);
		boolean[][] resultArray = b1.computeMatrix(inputArray);

		fileCreator c1 = new fileCreator(resultArray, numOfRow, numOfCol);
		c1.openFile();
		c1.addRecords();
		c1.closeFile();

		for( int i = 0; i < numOfRow; i++)
		{
			for(int j = 0; j < numOfCol; j++)
			{
				System.out.print(resultArray[i][j] + " ");
				if(j == (numOfCol - 1))
					System.out.println();
			}
		}
	System.out.println();
	}
}