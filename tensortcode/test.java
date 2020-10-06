package aaa;

import java.util.HashMap;

class A {
}

class B extends A {
}

class C extends B {
}


public class test {

    public static void main(String[] args) {
        /*A x = new C();
        System.out.println(x instanceof B);
        Object a=new Object();*/

        HashMap<StringBuffer,StringBuffer> map = new HashMap<>();
        StringBuffer s = new StringBuffer("aaa");
        map.put(s,s);
        System.out.println(map.size());
        System.out.println(map.get(s));
        System.out.println(s.hashCode());
        s.append("b");
        map.put(s,s);
        System.out.println(map.size());
        System.out.println(map.get(s));
        System.out.println(s.hashCode());

        String x="abc";
        String t =new String("abc");
        System.out.println(x.hashCode());
        System.out.println(t.hashCode());
        HashMap<String,String> mapp = new HashMap<>();
        mapp.put(x,x);
        mapp.put(t,t);
        System.out.println(x==t);
        System.out.println(mapp.size());


    }

}
