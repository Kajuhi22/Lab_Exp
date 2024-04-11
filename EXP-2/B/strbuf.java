class Strbuf{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello World");
        str.delete(6, 11);
        System.out.println(str);
	StringBuffer str2 = new StringBuffer("Hello World");
	str2.delete(0,str2.length());
	System.out.println(str2);
	StringBuffer str3 = new StringBuffer("Hello World");
	str3.deleteCharAt(5);  
	System.out.println(str3);
    }
}
