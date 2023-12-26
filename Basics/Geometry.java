package Basics;
import java.util.*;

public class Geometry {
public static void main(String args[]) {
Map <Integer,String> map = new HashMap<Integer,String>();
map.put(1, "circle");
map.put(2, "eclipse");
map.put(3, "parabola");
String k2 = map.get(1);
boolean key = map.containsValue(k2);
System.out.print(key);
}
}