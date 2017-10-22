import java.util.*;
import java.util.function.Function;

public class Print {

    public static <T>void print(T t){
        System.out.print(t.toString());
    }
    public static <T>void printn(T t){
        System.out.println(t.toString());
    }
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
    public static <T>void printStack(Stack<T> stack){
        StringBuilder b = new StringBuilder();
        b.append("BOTTOM [");
        for(int i = 0; i < stack.size(); i++){
            b.append(stack.get(i));
            if(i != stack.size() - 1){
                b.append(", ");
            }
        }
        b.append("] TOP");
        System.out.println(b.toString());
    }
    public static <T>void printStack(Stack<T> stack, Function<T, String> fun){
        StringBuilder b = new StringBuilder();
        b.append("BOTTOM [");
        for(int i = 0; i < stack.size(); i++){
            b.append(fun.apply(stack.get(i)));
            if(i != stack.size() - 1){
                b.append(", ");
            }
        }
        b.append("] TOP");
        System.out.println(b.toString());
    }
    public static <S, T>void printMap(Map<S, T> map){
        StringBuilder b = new StringBuilder();
        b.append("[");
        for(Map.Entry<S, T> entry : map.entrySet()){
            b.append("{"+entry.getKey().toString()+" : "+entry.getValue().toString()+"}");
            b.append(", ");
        }
        b.deleteCharAt(b.length()-1);
        b.deleteCharAt(b.length()-1);
        b.append("]");
        System.out.println(b.toString());
    }
    public static <S, T>void printMap(Map<S, T> map, Function<S, String> fun1, Function<T, String> fun2){
        StringBuilder b = new StringBuilder();
        b.append("[");
        for(Map.Entry<S, T> entry : map.entrySet()){
            b.append("{"+fun1.apply(entry.getKey())+" : "+fun2.apply(entry.getValue())+"}");
            b.append(", ");
        }
        b.deleteCharAt(b.length()-1);
        b.deleteCharAt(b.length()-1);
        b.append("]");
        System.out.println(b.toString());
    }
}
