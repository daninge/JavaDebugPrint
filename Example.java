import java.util.*;

public class Example extends Print{

    static private class jimmy{
        public int x;
        public jimmy(int x){
            this.x = x;
        }
    }
    public static void main(String[] args){
        List<jimmy> list = new ArrayList<jimmy>();
        list.add(new jimmy(4));
        list.add(new jimmy(6));
        print(printList(list, (x) -> { return String.valueOf(((jimmy) x).x);}));

        Set<jimmy> set = new HashSet<>();
        set.add(new jimmy(1));
        set.add(new jimmy(2));
        set.add(new jimmy(4));
        print(printSet(set, (x) -> {return String.valueOf(((jimmy)x).x);}));

        Stack<jimmy> s = new Stack();
        s.push(new jimmy(1));
        s.push(new jimmy(2));
        s.push(new jimmy(4));
        print(printStack(s, (x)->{return String.valueOf(x.x);}));

        Map<String, Integer> map = new HashMap<>();
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        print(printMap(map));

        print("hello world");
        printn(printMap(map));
    }
}
