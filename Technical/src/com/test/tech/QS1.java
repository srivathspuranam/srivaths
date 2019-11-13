package com.test.tech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QS1 {
	public static void main(String[] args) {
		
Map<Integer, String> Dept = new HashMap<Integer, String>();
Dept.put(1,"Devloper");
Dept.put(2,"Operations");
Dept.put(3,"HR");
 
Set<Entry<Integer, String>> set = Dept.entrySet();
 List<Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(set);
 Collections.sort( list, new Comparator<Map.Entry<Integer, String>>()
{
    public int compare( Map.Entry<Integer,String> S1, Map.Entry<Integer, String> S2 )
    {
        return (S2.getValue()).compareTo( S1.getValue() );
    }
} );
    for (Map.Entry<Integer, String> entry :list)
    {
  System.out.println(entry.getKey()+": "+entry.getValue());
}
}
}
