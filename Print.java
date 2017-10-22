import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Print {
    public static void printList(List<?> list){
        StringBuilder b = new StringBuilder();
        b.append("[");
        for(int i  = 0; i < list.size(); i++){
            b.append(list.get(i).toString());
            if(i != list.size() - 1){
                b.append(", ");
            }
        }
        b.append("]");
        System.out.println(b.toString());
    }
    public static void printList(List<?> list, Function<Object, String> fun){
        StringBuilder b = new StringBuilder();
        b.append("[");
        for(int i  = 0; i < list.size(); i++){
            b.append(fun.apply(list.get(i)));
            if(i != list.size() - 1){
                b.append(", ");
            }
        }
        b.append("]");
        System.out.println(b.toString());
    }
    public static void printSet(Set<?> set){
        StringBuilder b = new StringBuilder();
        b.append("{");
        Iterator<?> i = set.iterator();
        while(i.hasNext()){
            b.append(i.next().toString());
            if(i.hasNext()){
                b.append(", ");
            }
        }
        b.append("}");
        System.out.println(b.toString());
    }
    public static <T>void printSet(Set<T> set, Function<T, String> fun){
        StringBuilder b = new StringBuilder();
        b.append("{");
        Iterator<?> i = set.iterator();
        while(i.hasNext()){
            b.append(fun.apply((T)i.next()));
            if(i.hasNext()){
                b.append(", ");
            }
        }
        b.append("}");
        System.out.println(b.toString());
    }
}
