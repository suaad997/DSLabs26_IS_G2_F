package Array;

public class Arrayss {
    public void traversal(int []a){
        for(int i=0;i<a.length;i++)
            System.out.println("Index["+i+"]="+a[i]);
    }
    public void reverse_traversal(int []a){
        for(int i=a.length-1;i>=0;i--)
            System.out.println("Index["+i+"]="+a[i]);
    }

}
