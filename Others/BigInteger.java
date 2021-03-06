import java.io.*;  
import java.math.BigInteger;  
import java.util.*;  
public class Main {  
  
    public static void main(String[] args) {  
//声明和赋值  
        Scanner cin=new Scanner(System.in);//在import java.util.*;包中，  
        //实现了大整数输入的方法   cin.nextBigInteger()  
          
        BigInteger big1=BigInteger.ZERO;//0 声明一个大整数并常数值赋值0  
        BigInteger big2=BigInteger.ONE;//1  
        BigInteger big3=BigInteger.TEN;//10  
          
        BigInteger big4 =new BigInteger("1000");//赋除了0，1，10之外的常数值的方法一  
        BigInteger big5= BigInteger.valueOf(1000);//没有new赋除了之外的常数值的方法二  
        //BigInteger bi1 =  new BigInteger(55,new Random());  生成一个个随机的大整数  
          
        BigInteger [] a=new BigInteger [1005];//声明大整数数组，并赋值  
        a[1]=BigInteger.ZERO;  
        a[2]=BigInteger.ONE;  
        a[3]=a[2];  
        a[4]= BigInteger.valueOf(3);//a[4]=a[2].add(a[2].add(a[2]));  
        int n = cin.nextInt();  
        System.out.println(a[n]);  
          
//手动输入  
        int n1=cin.nextInt();//输入一个int型的n1  
        long n2=cin.nextLong();//输入一个long的n2  
          
        BigInteger n3 = cin.nextBigInteger();//声明一个大数，并手动输入这个值  
        BigInteger n4 = cin.nextBigInteger();  
          
//case处理  
        while(cin.hasNext())  
        {  
            //cin.hasNext()输入结束同c++里的while(scanf("%d",&n)!=EOF)  
        }  
        while(cin.hasNextLong())  
        {  
            //同上，这个输入的是long类型时  
        }  
        int test = cin.nextInt();  
        while(test-- >0)  
        {  
            //同c++里的while(scanf(test--))  
        }  
        for(int tt=4;tt<=test;tt++)  
        {  
            //需要记录case++时候  
            System.out.println("Case "+tt+":");//这里不断开，用\n会报错？？  
            System.out.println(big1+" + "+big2+" = "+big1.add(big2));  
        }  
//四则运算及其他  
        System.out.println(n3.add(n4));//n3+n4  
        System.out.println(n3.subtract(n4));//n3-n4  
        System.out.println(n3.multiply(n4));//n3*n4  
        System.out.println(n3.divide(n4));//n3/n4（两个大整数，整除的商  
        System.out.println(n3.remainder(n4));//n3%n4（两个大整数，取余数  
        System.out.println(n3.mod(n4));//同上  
        System.out.println(n3.gcd(n4));//n3和n4的最大公约数  
        System.out.println(n3.abs());//n3取绝对值  
        System.out.println(n3.negate());//n3取相反数  
        System.out.println(n3.min(n4));//n3  
        System.out.println(n3.max(n4));//n3  
        System.out.println(n3.abs());//n3取绝对值  
        System.out.println(n3.pow(2));//n3的2次方（指数  
        System.out.println(n3.toString(2)); // 转化为 x 的 n进制;  
        System.out.println(n3.compareTo(n4)==0); //x和y进行比较  
          if(big1.compareTo(big2) > 0)    
                
              System.out.println("bd1 is greater than bd2");    
   
          else if(big1.compareTo(big2) == 0)    
   
              System.out.println("bd1 is equal to bd2");    
   
          else if(big1.compareTo(big2) < 0)    
   
              System.out.println("bd1 is lower than bd2");    
          
    }  
}  

public class <b>BigInteger</b>
extends Number
implements Comparable<BigInteger>
不可变的任意精度的整数。所有操作中，都以二进制补码形式表示 BigInteger（如 Java 的基本整数类型）。BigInteger 提供所有 Java 的基本整数操作符的对应物，并提供 java.lang.Math 的所有相关方法。另外，BigInteger 还提供以下运算：模算术、GCD 计算、质数测试、素数生成、位操作以及一些其他操作。

算术运算的语义完全模仿 Java 整数算术运算符的语义，如 The Java Language Specification 中所定义的。例如，以零作为除数的除法抛出 ArithmeticException，而负数除以正数的除法则产生一个负（或零）的余数。Spec 中关于溢出的细节都被忽略了，因为 BigIntegers 所设置的实际大小能适应操作结果的需要。

位移操作的语义扩展了 Java 的位移操作符的语义以允许产生负位移距离。带有负位移距离的右移操作会导致左移操作，反之亦然。忽略无符号的右位移运算符（>>>），因为该操作与由此类提供的“无穷大的词大小”抽象结合使用时毫无意义。

逐位逻辑运算的语义完全模仿 Java 的逐位整数运算符的语义。在执行操作之前，二进制运算符（and、or、xor）对两个操作数中的较短操作数隐式执行符号扩展。

比较操作执行有符号的整数比较，类似于 Java 的关系运算符和相等性运算符执行的比较。

提供的模算术操作用来计算余数、求幂和乘法可逆元。这些方法始终返回非负结果，范围在 0 和 (modulus - 1)（包括）之间。

位操作对其操作数的二进制补码表示形式的单个位进行操作。如有必要，操作数会通过扩展符号来包含指定的位。单一位操作不能产生与正在被操作的 BigInteger 符号不同的 BigInteger，因为它们仅仅影响单个位，并且此类提供的“无穷大词大小”抽象可保证在每个 BigInteger 前存在无穷多的“虚拟符号位”数。

为了简洁明了，在整个 BigInteger 方法的描述中都使用了伪代码。伪代码表达式 (i + j) 是“其值为 BigInteger i 加 BigInteger j 的 BigInteger”的简写。伪代码表达式 (i == j) 是“当且仅当 BigInteger i 表示与 BigInteger j 相同的值时，才为 true”的简写。可以类似地解释其他伪代码表达式。

当为任何输入参数传递 null 对象引用时，此类中的所有方法和构造方法都将抛出 NullPointerException。

从以下版本开始：
JDK1.1
另请参见：
BigDecimal, 序列化表格

字段摘要
static BigInteger	ONE 
          BigInteger 的常量 1。
static BigInteger	TEN 
          BigInteger 的常量 10。
static BigInteger	ZERO 
          BigInteger 的常量 0。

构造方法摘要
BigInteger(byte[] val) 
          将包含 BigInteger 的二进制补码表示形式的 byte 数组转换为 BigInteger。
BigInteger(int signum, byte[] magnitude) 
          将 BigInteger 的符号-数量表示形式转换为 BigInteger。
BigInteger(int bitLength, int certainty, Random rnd) 
          构造一个随机生成的正 BigInteger，它可能是一个具有指定 bitLength 的素数。
BigInteger(int numBits, Random rnd) 
          构造一个随机生成的 BigInteger，它是在 0 到 (2numBits - 1)（包括）范围内均匀分布的值。
BigInteger(String val) 
          将 BigInteger 的十进制字符串表示形式转换为 BigInteger。
BigInteger(String val, int radix) 
          将指定基数的 BigInteger 的字符串表示形式转换为 BigInteger。

方法摘要
 BigInteger	abs() 
          返回其值是此 BigInteger 的绝对值的 BigInteger。
 BigInteger	add(BigInteger val) 
          返回其值为 (this + val) 的 BigInteger。
 BigInteger	and(BigInteger val) 
          返回其值为 (this & val) 的 BigInteger。
 BigInteger	andNot(BigInteger val) 
          返回其值为 (this & ~val) 的 BigInteger。
 int	bitCount() 
          返回此 BigInteger 的二进制补码表示形式中与符号不同的位的数量。
 int	bitLength() 
          返回此 BigInteger 的最小的二进制补码表示形式的位数，不包括 符号位。
 BigInteger	clearBit(int n) 
          返回其值与清除了指定位的此 BigInteger 等效的 BigInteger。
 int	compareTo(BigInteger val) 
          将此 BigInteger 与指定的 BigInteger 进行比较。
 BigInteger	divide(BigInteger val) 
          返回其值为 (this / val) 的 BigInteger。
 BigInteger[]	divideAndRemainder(BigInteger val) 
          返回包含 (this / val) 后跟 (this % val) 的两个 BigInteger 的数组。
 double	doubleValue() 
          将此 BigInteger 转换为 double。
 boolean	equals(Object x) 
          比较此 BigInteger 与指定的 Object 的相等性。
 BigInteger	flipBit(int n) 
          返回其值与对此 BigInteger 进行指定位翻转后的值等效的 BigInteger。
 float	floatValue() 
          将此 BigInteger 转换为 float。
 BigInteger	gcd(BigInteger val) 
          返回一个 BigInteger，其值是 abs(this) 和 abs(val) 的最大公约数。
 int	getLowestSetBit() 
          返回此 BigInteger 最右端（最低位）1 比特的索引（即从此字节的右端开始到本字节中最右端 1 比特之间的 0 比特的位数）。
 int	hashCode() 
          返回此 BigInteger 的哈希码。
 int	intValue() 
          将此 BigInteger 转换为 int。
 boolean	isProbablePrime(int certainty) 
          如果此 BigInteger 可能为素数，则返回 true，如果它一定为合数，则返回 false。
 long	longValue() 
          将此 BigInteger 转换为 long。
 BigInteger	max(BigInteger val) 
          返回此 BigInteger 和 val 的最大值。
 BigInteger	min(BigInteger val) 
          返回此 BigInteger 和 val 的最小值。
 BigInteger	mod(BigInteger m) 
          返回其值为 (this mod m) 的 BigInteger。
 BigInteger	modInverse(BigInteger m) 
          返回其值为 (this-1 mod m) 的 BigInteger。
 BigInteger	modPow(BigInteger exponent, BigInteger m) 
          返回其值为 (thisexponent mod m) 的 BigInteger。
 BigInteger	multiply(BigInteger val) 
          返回其值为 (this * val) 的 BigInteger。
 BigInteger	negate() 
          返回其值是 (-this) 的 BigInteger。
 BigInteger	nextProbablePrime() 
          返回大于此 BigInteger 的可能为素数的第一个整数。
 BigInteger	not() 
          返回其值为 (~this) 的 BigInteger。
 BigInteger	or(BigInteger val) 
          返回其值为 (this | val) 的 BigInteger。
 BigInteger	pow(int exponent) 
          返回其值为 (thisexponent) 的 BigInteger。
static BigInteger	probablePrime(int bitLength, Random rnd) 
          返回有可能是素数的、具有指定长度的正 BigInteger。
 BigInteger	remainder(BigInteger val) 
          返回其值为 (this % val) 的 BigInteger。
 BigInteger	setBit(int n) 
          返回其值与设置了指定位的此 BigInteger 等效的 BigInteger。
 BigInteger	shiftLeft(int n) 
          返回其值为 (this << n) 的 BigInteger。
 BigInteger	shiftRight(int n) 
          返回其值为 (this >> n) 的 BigInteger。
 int	signum() 
          返回此 BigInteger 的正负号函数。
 BigInteger	subtract(BigInteger val) 
          返回其值为 (this - val) 的 BigInteger。
 boolean	testBit(int n) 
          当且仅当设置了指定的位时，返回 true。
 byte[]	toByteArray() 
          返回一个 byte 数组，该数组包含此 BigInteger 的二进制补码表示形式。
 String	toString() 
          返回此 BigInteger 的十进制字符串表示形式。
 String	toString(int radix) 
          返回此 BigInteger 的给定基数的字符串表示形式。
static BigInteger	valueOf(long val) 
          返回其值等于指定 long 的值的 BigInteger。
 BigInteger	xor(BigInteger val) 
          返回其值为 (this ^ val) 的 BigInteger。
