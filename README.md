# 我的第一个GitHub project!(java基础知识点)
1.字符串
字符串可以使用字符直接量or字符数组创建一个字符串对象。
例如：
String newString  = new newString("welcome to java!");
String newString ="welcome to java!";

char[] charArray = {'W','e','l','c','o','m','e','!'};

String newString = new String(charArray);

2.	String变量中存放的是String对象的引用，而String对象中存储的才是字符串值。

3.	String对象是不可变的，他的内容是不能改变的。
String s = "java";
s="html";//表示新建立了一个String对象，而s存储的引用变成了对"html"字符串的引用，s不再是"java"字符串的引用，会被JVM回收。

4.	对于具有相同字符串序列的字符串直接量使用的是同一个实例。
String s1 = "welcome";//s1==s3;
String s2 = new String("welcome");//s2!=s1 && s2!=s3;
String s3 = "welcome";//s3==s1;




