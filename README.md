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

5.字符类Character
java给每一个基本数据类型都提供了一个包装类。（Character/Boolean/Byte/Short/Integer/Long/Float/Double）
所有这些类都在java.lang包下面，它们把基本类型数据当作对象处理。

（1）用char值创建一个Character对象。
Character character = new Character('a');
 (2)charValue方法返回包装在Character对象中的字符值。



