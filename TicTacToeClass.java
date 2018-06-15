import java.io.Console;
import java.util.Scanner;

public class TicTacToeClass {

	static int i ;
	static int j;
	static void printMat(char mat[][])
	{
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				System.out.print(mat[a][b]+" ");
			}
			System.out.println();
		}
	}
	static boolean getPosition(int input)
	{
		switch (input) {
		case 1:{
			i=0;
			j=0;
			return true;
		}

		case 2:
		{
			i=0;j=1;
			return true;
		}
		case 3:{
			i=0;j=2;
			return true;
		}
		case 4:
		{i=1;j=0;
		return true;
		}
		case 5:{i=1;j=1;
		return true;
		}
		case 6:{
			i=1;j=2;
			return true;
		}
		case 7:{
			i=2;j=0;
			return true;
		}
		case 8:{
			i=2;j=1;
			return true;
		}
		case 9:{
			i=2;j=2;
			return true;
		}

		default:
			return false;
		}

	}
	static boolean checkForWin(char mat[][],int i,int j,char input)
	{
		if(i==0&&j==0)
		{
			if((mat[0][0]==input)&&(mat[0][1]==input)&&(mat[0][2]==input))
				return true;
			else if((mat[0][0]==input)&&(mat[1][0]==input)&&(mat[2][0]==input))
				return true;
			else if((mat[0][0]==input)&&(mat[1][1]==input)&&(mat[2][2]==input))
				return true;
		}
		if(i==0&&j==1)
		{ 
			if((mat[0][0]==input)&&(mat[0][1]==input)&&(mat[0][2]==input))
				return true;
			else if((mat[0][1]==input)&&(mat[1][1]==input)&&(mat[2][1]==input))
				return true;
		}
		if(i==0&&j==2)
		{
			if((mat[0][0]==input)&&(mat[0][1]==input)&&(mat[0][2]==input))
				return true;
			else if((mat[0][2]==input)&&(mat[1][1]==input)&&(mat[2][0]==input))
				return true;
			else if((mat[0][2]==input)&&(mat[1][2]==input)&&(mat[2][2]==input))
				return true;
		}
		if(i==1&&j==0)
		{
			if((mat[0][0]==input)&&(mat[1][0]==input)&&(mat[2][0]==input))
				return true;
			else if((mat[1][0]==input)&&(mat[1][1]==input)&&(mat[1][2]==input))
				return true;
		}
		if(i==1&&j==1)
		{
			if((mat[0][0]==input)&&(mat[1][1]==input)&&(mat[2][2]==input))
				return true;
			else if((mat[0][2]==input)&&(mat[1][1]==input)&&(mat[2][0]==input))
				return true;
			else if((mat[0][1]==input)&&(mat[1][1]==input)&&(mat[2][1]==input))
				return true;
			else if((mat[1][0]==input)&&(mat[1][1]==input)&&(mat[1][2]==input))
				return true;
		}
		if(i==1&&j==2)
		{

			if((mat[0][2]==input)&&(mat[1][2]==input)&&(mat[2][2]==input))
				return true;
			else if((mat[1][0]==input)&&(mat[1][1]==input)&&(mat[1][2]==input))
				return true;
		}
		if(i==2&&j==0)
		{
			if((mat[2][0]==input)&&(mat[1][1]==input)&&(mat[0][2]==input))
				return true;
			else if((mat[2][0]==input)&&(mat[1][0]==input)&&(mat[0][0]==input))
				return true;
			else if((mat[2][0]==input)&&(mat[2][1]==input)&&(mat[2][2]==input))
				return true;
		}
		if(i==2&&j==1)
		{
			if((mat[2][1]==input)&&(mat[1][1]==input)&&(mat[0][1]==input))
				return true;
			else if((mat[2][0]==input)&&(mat[2][1]==input)&&(mat[2][2]==input))
				return true;
		}
		if(i==2&&j==2)
		{
			if((mat[2][2]==input)&&(mat[1][1]==input)&&(mat[0][0]==input))
				return true;
			else if((mat[2][1]==input)&&(mat[1][0]==input)&&(mat[2][0]==input))
				return true;
			else if((mat[2][2]==input)&&(mat[1][2]==input)&&(mat[0][2]==input))
				return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		char mat[][]=
			{
					{'1','2','3'},
					{'4','5','6'},
					{'7','8','9'},
			};

		int NoOfTurns=0;
		char player='X';
		while(true)
		{
			
			printMat(mat);
			while(true){
				System.out.print("Enter Player"+player+"(1-9) :");
				char inputX=new Scanner(System.in).nextLine().charAt(0);
				if(inputX-'0'>=1 && inputX-'0'<=9)
				{
					getPosition(inputX-'0');
					if(mat[i][j]=='X' || mat[i][j]=='O')
					{
						System.out.println("Please choos position not taken");
						continue;
					}
					break;
				}
			}
			mat[i][j]=player;
			NoOfTurns++;
			
			if(checkForWin(mat,i,j,player)==true)
			{ 
				printMat(mat);
				System.out.println("player "+player+" wins");
				break;
			}
			if(NoOfTurns==9)
			{
				System.out.println("No One Wins");
				break;
			}
			if(player=='X')player='O';
			else player='X';

		}
	}


}
