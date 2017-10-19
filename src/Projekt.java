

public class Projekt {

	String[][] b;
	
	public Projekt(String[][] a2) {
		b = a2;
	}
	
	public boolean is_sorted(String[] s) {
		boolean test = true;
		int a = s.length;
		for(int i = 0; i< a;i++ ){
			String x = s[i];
		
			for(int i2 = i+1; i2<a;i2++){
				String x2 = s[i2];
			
				
				for(int i3 = 0;i3<b.length;i3++){
					if(b[i3][0]==x2 && b[i3][1]==x){
						test = false;
					}
				}
			}	
		}
		if(a <=1){
			test = false;
		}
		
		return test;
	}
	
	
}
