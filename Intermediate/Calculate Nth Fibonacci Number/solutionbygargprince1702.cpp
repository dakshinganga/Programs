// A Program to calculate Nth Number in Fibonacci Series.
#include<iostream>
using namespace std;
int fact(int n)
{
    	  int fact[n];
	   fact[0]=0,fact[1]=1;
	for(int i=2;i<n;i++)
	{
	        fact[i]=fact[i-1]+fact[i-2];
	}
 	cout<<fact[n-1]<<" ";
}
int main()
{
	cout<<"Enter N =";
	int n;
	cin>>n;
	fact(n);
}
//This code is contributed by gargprince1702
