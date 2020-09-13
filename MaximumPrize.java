import java.util.*;

class MaximumPrize{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> l = new ArrayList<Integer>();
		int d[][] = new int[n+2][n+2];
		
		for(int i=0; i<n; i++){
			int x = sc.nextInt();
			l.add(x);
		}
		
		l.add(0,0);
		l.add(0);
		
		for(int s=1; s<=n; s++){
			for(int p=1; p<=n-s+1; p++){
				int q = p+s-1;
				for(int i=p; i<=q; i++){
					int a = Math.max(l.get(p-1),l.get(q+1));
					int b = Math.min(l.get(p-1),l.get(q+1));
					int res = 0;
					if(a==0 && b==0)
						res = l.get(i) + d[p][i-1] + d[i+1][q];
					else
						res =  l.get(i) * a + b + d[p][i-1] + d[i+1][q];

					d[p][q] = Math.max(d[p][q], res);
				}
			}
		}

		System.out.println(d[1][n]);
	}
}
