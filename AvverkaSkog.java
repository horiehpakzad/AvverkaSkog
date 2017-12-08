


public class AvverkaSkog {


	public static final int [] T = {2,1,2,1}; 

	public static final int N = 4;
	public static final int K = 2;
	public static final int M = 1;


	public static void main(String [] args) {
	

	int [][] F = new int [N+1][K+1];


	for (int i=0; i<= N; i++)
		F[i][0] =0;


	for (int j=0; j<= K; j++)
		F[0][j] =0;


	int currentJMax = T[0];
	for (int i=2; i<= N; i++) {

		if (currentJMax < T[i-1]) {

			currentJMax = T[i-1];
		}
		F[i][1] = currentJMax;
	}


	for (int i =1; i<= N; i++)	{


		for (int j =2; i>=j*(M+1); j++ ) {
		System.out.println("value i = " + i + " value j = " + j);

		int tempMax = F[i-1][j];

		int sum = 0;

		for (int x=(i-M); x<=(i-1); x++) { 
				sum += T[x];				
		}
		System.out.println("value wood " + sum);
		int tempMax2= sum + F[i-M-1][j-1];
		if (tempMax > tempMax2)
			F[i][j]= tempMax;
		else 
			F[i][j]= tempMax2;

		}
	}
	System.out.println("Max value of timber is : " + F[N][K]);

	for (int i =0; i<=N; i++) { 
		for (int j =0; j<= K; j++){ 
			System.out.print(F[i][j] + " ");
		}
		System.out.println();
}
 }
}



