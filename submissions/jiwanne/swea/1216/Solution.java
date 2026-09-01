import java.util.Scanner;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = 10;


		for(int test_case = 1; test_case <= T; test_case++)
		{
            char [][] arr = new char[100][100];
            int answer = 0;

            int num = sc.nextInt();
            for(int i = 0; i < 100; i++) {
                String str = sc.next();

                for(int j = 0; j < 100; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

           for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {
                    for(int k = 1; k <= 100 - j; k++) {

                        String str = "";
                        
                        for(int l = 0; l < k; l++) {
                            str += arr[i][j + l];
                        }

                        StringBuilder sb = new StringBuilder(str);
                        if(str.equals(sb.reverse().toString())) {
                            answer = Math.max(answer, k);
                        }
                    }
                }
            }

            for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {

                    for(int k = 1; k <= 100 - j; k++) {

                        String str = "";

                        for(int l = 0; l < k; l++) {
                            str += arr[j+l][i];
                        }

                        StringBuilder sb = new StringBuilder(str);
                        if(str.equals(sb.reverse().toString())) {
                            answer = Math.max(answer, k);
                        }
                    }
                }
            }




            System.out.println("#" + num + " " + answer);
		}
	}
}