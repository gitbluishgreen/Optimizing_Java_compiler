class T2 {
public static void main(String [] args){
B __local_0;
int __local_1;
__local_0 = new B();
__local_1 = __local_0.funCall();
System.out.println(__local_1);
}
}
class A{
int x1;
int x2;
public int funCall(){
A __local_2;
int __local_3;
int __local_4;
int __local_5;
int __local_6;
A fn_local1;
int fn_local2;
int fn_local3;
int n;
__local_2 = this;
__local_3 = 10;
x1 = __local_3;
System.out.println(x1);
__local_4 = 20;
x2 = __local_4;
System.out.println(x2);
fn_local1 = __local_2;
System.out.println(fn_local1.x1);
System.out.println(fn_local1.x2);
fn_local2 = fn_local1.f2();
fn_local3 = fn_local2;
__local_5 = fn_local2;
n = __local_5;
__local_6 = 1;
return __local_6;
}
public int f1(){
A __local_7;
int __local_8;
int n;
__local_7 = this;
System.out.println(x1);
System.out.println(x2);
__local_8 = __local_7.f2();
n = __local_8;
return n;
}
public int f2(){
A __local_9;
__local_9 = this;
System.out.println(x1);
System.out.println(x2);
return x2;
}
}
class B extends A{
int x1;
public int f3(){
B __local_10;
int __local_11;
__local_10 = this;
__local_11 = 100;
x1 = __local_11;
System.out.println(x1);
System.out.println(x2);
return x1;
}
public int f2(){
B __local_12;
int __local_13;
int n;
B fn_local1;
__local_12 = this;
fn_local1 = __local_12;
fn_local1.x1 = 100;
System.out.println(fn_local1.x1);
System.out.println(fn_local1.x1);
__local_13 = fn_local.x1;
n = __local_13;
System.out.println(x1);
return x1;
}
}
