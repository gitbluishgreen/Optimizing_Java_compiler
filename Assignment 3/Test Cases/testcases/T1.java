class T1 {
public static void main(String [] args){
MergeSort __local_0;
int __local_1;
int __local_2;
__local_0 = new MergeSort();
__local_1 = 1000;
__local_2 = __local_0.solve(__local_1);
System.out.println(__local_2);
}
}
class MergeSort{
int[] arr;
int[] arr_aux;
int size;
int ret1;
int ret2;
int ret3;
public int init(int N){
MergeSort __local_3;
int[] __local_4;
int __local_5;
boolean __local_6;
int __local_7;
int __local_8;
int __local_9;
boolean __local_10;
int __local_11;
int i;
__local_3 = this;
size = N;
__local_4 = new int[N];
arr = __local_4;
__local_5 = 0;
i = __local_5;
__local_6 = i < N;
while(__local_6){
{
__local_7 = N - i;
arr[i] = __local_7;
}
__local_8 = 1;
__local_9 = i + __local_8;
i = __local_9;
__local_10 = i < N;
__local_6 = __local_10;
}
__local_11 = 0;
return __local_11;
}
public int mergeSort(int low,int high){
MergeSort __local_12;
boolean __local_13;
int __local_14;
int __local_15;
int __local_16;
boolean __local_17;
int __local_18;
int __local_19;
int __local_20;
int __local_21;
boolean __local_22;
int __local_23;
int __local_24;
int __local_25;
int __local_26;
int __local_27;
int __local_28;
int __local_29;
int __local_30;
int __local_31;
int mid;
__local_12 = this;
__local_13 = low < high;
if(__local_13){
{
__local_14 = 0;
mid = __local_14;
__local_15 = mid + mid;
__local_16 = low + high;
__local_17 = __local_15 < __local_16;
while(__local_17){
{
__local_18 = 1;
__local_19 = mid + __local_18;
mid = __local_19;
}
__local_20 = mid + mid;
__local_21 = low + high;
__local_22 = __local_20 < __local_21;
__local_17 = __local_22;
}
__local_23 = 1;
__local_24 = mid - __local_23;
mid = __local_24;
__local_25 = __local_12.mergeSort(low,mid);
__local_12.ret1 = __local_25;
__local_26 = 1;
__local_27 = mid + __local_26;
__local_28 = __local_12.mergeSort(__local_27,high);
__local_12.ret2 = __local_28;
__local_29 = __local_12.merge(low,mid,high);
ret3 = __local_29;
}
}
else{
__local_30 = 0;
ret1 = __local_30;
}
__local_31 = 0;
return __local_31;
}
public int merge(int low,int mid,int high){
MergeSort __local_32;
int __local_33;
int __local_34;
int __local_35;
int[] __local_36;
int __local_37;
int __local_38;
int __local_39;
int __local_40;
int __local_41;
boolean __local_42;
int __local_43;
int __local_44;
boolean __local_45;
boolean __local_46;
int __local_47;
int __local_48;
boolean __local_49;
int __local_50;
int __local_51;
int __local_52;
int __local_53;
int __local_54;
int __local_55;
int __local_56;
int __local_57;
int __local_58;
int __local_59;
boolean __local_60;
int __local_61;
int __local_62;
boolean __local_63;
boolean __local_64;
int __local_65;
int __local_66;
boolean __local_67;
int __local_68;
int __local_69;
int __local_70;
int __local_71;
int __local_72;
int __local_73;
int __local_74;
boolean __local_75;
int __local_76;
int __local_77;
boolean __local_78;
int __local_79;
int __local_80;
int __local_81;
int __local_82;
int __local_83;
int __local_84;
int __local_85;
boolean __local_86;
int __local_87;
int __local_88;
int __local_89;
int __local_90;
boolean __local_91;
int __local_92;
int __local_93;
int __local_94;
int __local_95;
int __local_96;
int __local_97;
int __local_98;
boolean __local_99;
int __local_100;
int i;
int j;
int k;
__local_32 = this;
__local_33 = high - low;
__local_34 = 1;
__local_35 = __local_33 + __local_34;
__local_36 = new int[__local_35];
arr_aux = __local_36;
i = low;
__local_37 = 1;
__local_38 = mid + __local_37;
j = __local_38;
__local_39 = 0;
k = __local_39;
__local_40 = 1;
__local_41 = mid + __local_40;
__local_42 = i < __local_41;
__local_43 = 1;
__local_44 = high + __local_43;
__local_45 = j < __local_44;
__local_46 = __local_42 & __local_45;
while(__local_46){
{
__local_47 = arr[i];
__local_48 = arr[j];
__local_49 = __local_47 < __local_48;
if(__local_49){
{
__local_50 = arr[i];
arr_aux[k] = __local_50;
__local_51 = 1;
__local_52 = i + __local_51;
i = __local_52;
}
}
else{
{
__local_53 = arr[j];
arr_aux[k] = __local_53;
__local_54 = 1;
__local_55 = j + __local_54;
j = __local_55;
}
}
__local_56 = 1;
__local_57 = k + __local_56;
k = __local_57;
}
__local_58 = 1;
__local_59 = mid + __local_58;
__local_60 = i < __local_59;
__local_61 = 1;
__local_62 = high + __local_61;
__local_63 = j < __local_62;
__local_64 = __local_60 & __local_63;
__local_46 = __local_64;
}
__local_65 = 1;
__local_66 = mid + __local_65;
__local_67 = i < __local_66;
while(__local_67){
{
__local_68 = arr[i];
arr_aux[k] = __local_68;
__local_69 = 1;
__local_70 = k + __local_69;
k = __local_70;
__local_71 = 1;
__local_72 = i + __local_71;
i = __local_72;
}
__local_73 = 1;
__local_74 = mid + __local_73;
__local_75 = i < __local_74;
__local_67 = __local_75;
}
__local_76 = 1;
__local_77 = high + __local_76;
__local_78 = j < __local_77;
while(__local_78){
{
__local_79 = arr[j];
arr_aux[k] = __local_79;
__local_80 = 1;
__local_81 = k + __local_80;
k = __local_81;
__local_82 = 1;
__local_83 = j + __local_82;
j = __local_83;
}
__local_84 = 1;
__local_85 = high + __local_84;
__local_86 = j < __local_85;
__local_78 = __local_86;
}
__local_87 = 0;
i = __local_87;
__local_88 = high - low;
__local_89 = 1;
__local_90 = __local_88 + __local_89;
__local_91 = i < __local_90;
while(__local_91){
{
__local_92 = i + low;
__local_93 = arr_aux[i];
arr[__local_92] = __local_93;
}
__local_94 = 1;
__local_95 = i + __local_94;
i = __local_95;
__local_96 = high - low;
__local_97 = 1;
__local_98 = __local_96 + __local_97;
__local_99 = i < __local_98;
__local_91 = __local_99;
}
__local_100 = 0;
return __local_100;
}
public int solve(int N){
MergeSort __local_101;
int __local_102;
int __local_103;
int __local_104;
int __local_105;
int __local_106;
int __local_107;
boolean __local_108;
int __local_109;
int __local_110;
int __local_111;
boolean __local_112;
int __local_113;
int i;
int j;
__local_101 = this;
__local_102 = __local_101.init(N);
i = __local_102;
__local_103 = 0;
__local_104 = 1;
__local_105 = N - __local_104;
__local_106 = __local_101.mergeSort(__local_103,__local_105);
j = __local_106;
__local_107 = 0;
i = __local_107;
__local_108 = i < N;
while(__local_108){
{
__local_109 = arr[i];
System.out.println(__local_109);
}
__local_110 = 1;
__local_111 = i + __local_110;
i = __local_111;
__local_112 = i < N;
__local_108 = __local_112;
}
__local_113 = 0;
return __local_113;
}
}
