package practice_code;

import java.util.HashSet;
import java.util.Set;

public class Setincollection {

public static void main(String[] args) {
	
	
//int a[] = {1,2,3,4,5};

Set<Integer> aa = new HashSet<Integer>();
Set<Integer> bb = new HashSet<Integer>();
aa.add(1);
aa.add(2);
aa.add(3);
aa.add(4);
aa.add(1);
bb.add(1);
bb.add(18);
bb.add(16);
bb.add(14);
bb.add(13);
bb.add(13);

System.out.println(aa.size());//size
System.out.println(aa);
aa.equals(bb);//equal
System.out.println(aa);
aa.remove(4);//remove
System.out.println(aa.size());//size
System.out.println(aa);

System.out.println(aa.contains(1));//contains

System.out.println(aa.removeAll(bb)+"yes am printed");//removeall
System.out.println(aa);
System.out.println(aa.equals(bb)+"haiiii hello");//equals

System.out.println(aa);
aa.clear();//clear
System.out.println(aa);
	
aa.isEmpty();   //is empty
System.out.println(aa);
   }	
}