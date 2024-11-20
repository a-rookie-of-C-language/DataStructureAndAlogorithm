本排序算法实现了常见的10中算法
<br>
要使用这个api你需要创建一个Sort对象,我给出了三个构造函数
<br>
public Sort();
<br>
这个构造函数默认使用冒泡排序
<br>
public Sort(SortType sortType);
SortType是一个枚举类,
<br>
这个枚举类的定义如下
<br>
public enum SortType {
<br>
&emsp;Bubble,// 冒泡排序
<br>
&emsp;Insertion,//插入排序
<br>
&emsp;Selection,//选择排序
<br>
&emsp;Quick,//快速排序
<br>
&emsp;Heap,//堆排序
<br>
&emsp;Merge//归并排序
<br>
&emsp;Shell,//希尔排序
<br>
&emsp;Bucket,//桶排序
<br>
&emsp;Counting,//计数排序
<br>
&emsp;Radix//基数排序
<br>
}
<br>
public Sort(SortInterface sort);
<br>
这个构造函数用来让您自定义排序算法,您只需要实现一个SortInterface接口的对象即可
<br>
关于调用函数时的IdealArrayIsNull接口:
这个接口的定义如下:
<br>
@FunctionalInterface
<br>
public interface IdealArrayIsNull {
<br>
&emsp;void toIdealArrayIsNull();
<br>
}
<br>
这个接口被FunctionalInterface注解所以可以使用lambda表达式实现接口
<br>
我在写api时调用函数时最常见的看到的函数声明如下:
<br>
public <T extends Comparable<T<T>>> void sort(T[] array, int start, int end, IdealArrayIsNull ifArrayIsNull, IdealArrayIsNull ifArrayElementIsNull)
<br>
这里的ifArrayIsNull与ifArrayElementIsNull都是IdealArrayIsNull接口的对象
<br>
ifArrayIsNull用于处理如果数组为null应该怎么做
<br>
ifArrayElementIsNull用于处理数组中我元素为null时怎么做
<br>
public <T extends Comparable<T<T>>> void sort(T[] array, int start, int end, IdealArrayIsNull ifArrayIsNull)
<br>
对于只传入一个IdealArrayIsNull对象,则当数组为空或数组元素为空都会调用这个接口对象
<br>
public <T extends Comparable<T<T>>> void sort(T[] array, int start, int end)
<br>
对于没有传入IdealArrayIsNull的方法,将调用默认方法处理
<br>
public static IdealArrayIsNull toIdealArrayIsNull = () -> {
<br>
&emsp;System.out.println("Array is null");
<br>
};
<br>
public static IdealArrayIsNull toIdealArrayElementIsNull = () -> {
<br>
&emsp;System.out.println("Array element is null");
<br>
};
<br>
注:
<br>
使用默认方法时如果数组为空则只会打印语句
<br>
如果数组元素有null时则不会进行排序,也只是打印语句.
