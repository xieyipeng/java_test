package test14;

public class q6 {
	public static void main(String args[]) {
		int ans=0;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				for(int q=1;q<=9;q++) {
					for(int a=1;a<=9;a++) {
						if(i==j&&q==a) {
							continue;
						}
						//TODO: 浮点数运算容易出错
//						if(((double)i/(double)j)*((double)q/(double)a)==((double)(i*10+q))/((double)(j*10+a))) {
//							System.out.print(i+" "+j+" "+q+" "+a+"\n");
//							ans++;
//						}
						if(i*q*(j*10+a)==j*a*(i*10+q)) {
							ans++;
						}
					}
				}
			}
		}
		System.out.print(ans);
	}
}
