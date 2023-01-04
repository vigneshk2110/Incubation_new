package sortingAlgorithms;

public class Pattern {

			public static void printPattern(int n)
			{
				helper(1,n);
				return;
			}
			public static void helper(int i,int n)
			{
				if(i>n)
					return;
				for(int j=0;j<i;j++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
				helper(i+1,n);
			}
			public static void main(String[] args) {
				int n=5;
				printPattern(n);

			}

		}