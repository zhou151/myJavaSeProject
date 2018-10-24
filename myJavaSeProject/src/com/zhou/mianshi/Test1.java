package com.zhou.mianshi;

import java.util.Scanner;

public class Test1
{
public static void main(String[] args) {
		
    	System.out.print("请输入所需要的n矩阵的阶数：");	//输入矩阵的阶数
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			
    	int row_number = n;           //矩阵的行数
    	int column_number = n;		  //矩阵的列数（实际上，无论是不是方阵，都可以转置）
    	
    	System.out.println("随机生成的矩阵A为：");
    	create_Matrix(row_number,column_number);	//创建矩阵	
    	
    }
 
 
//生成一个n阶矩阵A,并打印A
	public static int[][] create_Matrix(int row_number,int column_number ) {
 
 
		int matrixA[][] = new int[row_number][column_number];
		for (int i = 0; i <= row_number - 1; i++) {
			for (int j = 0; j <= column_number - 1; j++) {
				matrixA[i][j] = random_number();
				System.out.print(matrixA[i][j] + " ");
			}
			System.out.println();
		}
		return matrixA;
	}
 
 
//产生一个1~100的随机整数，用于自动填入矩阵A的每个位之中 
    public static int random_number(){
    	int number;
    	number = new java.util.Random().nextInt(100)+1;
    	return number;
    }

}
