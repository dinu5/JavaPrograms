class TowerOfHanoi
{
	public static void main(String[] args)
	{
		//char A,B,C;
		int n=3;
		towerMethod(n,'A','C','B');
	}
	
	static void towerMethod(int n,char from_rod,char to_rod,char aux_rod)
	{
		if(n==1)
			System.out.println("The rod "+n+" moved from "+from_rod+" to "+to_rod);
		else
		{
			towerMethod(n-1,from_rod,aux_rod,to_rod);
			System.out.println("moved rod "+n+" from rod "+from_rod+" to rod "+to_rod);
			towerMethod(n-1,aux_rod,to_rod,from_rod);
		}
	}
}