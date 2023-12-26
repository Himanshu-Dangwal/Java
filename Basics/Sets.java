package Basics;
import java.io.*;
import java.util.*;

public interface Sets {
    
    public static void main(String[] args) {
        
        Set<Integer> st = new HashSet<Integer>();
        st.add(10);
        st.add(20);
        st.add(10);

        System.out.println(st);
    }

}
