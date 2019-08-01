public class warshallAlgorithm{

	private int numOfRow;
	private int numOfCol;

	public warshallAlgorithm(int num1, int num2){
		numOfRow = num1;
		numOfCol = num2;
	}

	public boolean[][] computeMatrix(boolean[][] arr){
		boolean[][] resultArray = arr;

		for(int i = 0; i < numOfRow; i++){
			for(int j = 0; j < numOfCol; j++){
				if (arr[j][i] == true){
					for(int k = 0; k < numOfRow; k++){
							resultArray[j][k] = (arr[j][k] || arr[i][k]);
					}
				}
			}
		}
		return resultArray;
	}
}