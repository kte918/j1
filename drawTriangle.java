class drawTriangle {
public static void main(String[] args)
{
String s = "*";
StringBuffer sbuf = new StringBuffer();
for(int i = 1; i<12; i++) {
	for(int j=0; j<i; j++)
	{
	sbuf.append(s);
	}
	System.out.printf("%d %s\n ",i,sbuf.toString());
	sbuf.delete(0, sbuf.length());
}
}
}