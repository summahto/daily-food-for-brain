package io.streamexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.newfeatures.Hosting;

public class TestListToMapJava8 {

	public static void main(String[] args) {
		
		List<Hosting> list = new ArrayList<>() ;
		
		list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        
        
        Map<Integer, String> result1 = 
        		list.stream().collect(Collectors.toMap(Hosting::getId, h -> h.getName() ));
        
        System.out.println("Result :" +result1 );
        
        List<Long> list2 = list.stream().map(h -> h.getWebsites()).sorted().toList();
        System.out.println(list2);
        
        

	}

}
