#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void main()
{
	srand(time(0));  // if you remove this than always same random number will be genrated. 
	int n;
	printf("how many number ");
	scanf("%d",&n);
	int low,high;
	printf("enter min value and max value ");
	scanf("%d%d",&low,&high);
	printf("random numbers \n");
	int i=0;
	for(i=0;i<n;i++)
	{
		int randNum=rand()%high+low;
		printf("%d\n",randNum);
	}
}