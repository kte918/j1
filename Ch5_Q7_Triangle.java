class Ch5_Q7_Triangle {
void drawTriangleSymbol(){
	StringBuffer sbuf = new StringBuffer();
	String blank =" ";
	String s="*";
	for (int i=0; i<6; i++ ) {
			for(int j=0;j<6-i;j++){
				sbuf.append(blank);
				}
			for (int j=0; j<i*2+1; j++ ){
				sbuf.append(s);
				}
			System.out.printf("%s\n",sbuf.toString());
			sbuf.delete(0,sbuf.length());
		}
}
public static void main(String[] args) {
Ch5_Q7_Triangle t = new Ch5_Q7_Triangle();
t.drawTriangleSymbol();
}
}