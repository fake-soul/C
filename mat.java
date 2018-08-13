import java.io.*;
import java.util.*;
public class mat
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int rows=3;
		String str;
		str="ABCDEFGHI";
		int len=str.length();
		if(len%rows!=0)
		{
			int diff=rows-len%rows;
			len=len+diff;
			for(int i=0;i<diff;i++)
				str=str+'z';
		}
		int col=len/rows;
		int[][] key=new int[rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				key[i][j]=0+rand.nextInt(25);
			}
		}
		int[][] charArr = new int[rows][col];
		int k=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				charArr[i][j]=str.charAt(k)-65;
				k++;
			}
		}
		System.out.println(" Keys ");  
		print2D(key,rows,col);
		System.out.println(" char ");
		print2D(charArr,rows,col);
		int temp;
		String str2="";
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				temp=0;
				for(k=0;k<col;k++)
					temp=temp+charArr[i][k]*key[j][k];
				temp=temp%26;
				temp=temp+65;
				str2=str2+(char) temp;
			}
		}
		System.out.println("String "+str2);

	}
	public static void print2D(int[][] mat,int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(" "+mat[i][j]);
			System.out.println();
		}
	}
}
