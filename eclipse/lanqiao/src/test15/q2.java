package test15;

public class q2 {
	static int num=0;
	public static void main(String[] args) {
		for(int i=1;i<999;i++) {
			
			int n3=i*i*i;
			System.out.println(i+" n3 == "+n3);
			String temp=String.valueOf(n3);
//			System.out.println("String == "+temp);
			char[] n1=temp.toCharArray();
//			for(int j=0;j<n1.length;j++) {
//				System.out.print(n1[j]+" ");
//			}
//			System.out.println();
			int add=0;
			for(int j=0;j<n1.length;j++) {
//				int pow=(int) Math.pow(10, n1.length-j-1);
				int val=Integer.valueOf(n1[j])-48;
				int a=(int) (val);
				System.out.println("add: "+val);
				add+=a;
			}
			
			if(add==i) {
				num++;
				System.out.println(i+" ========== "+add);
			}
			
			System.out.println("--------");
		}
		System.out.println(num);
	}
}
