import ShapeLinkedListStuff.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        for(int i=1;i<=50;i++){
            if(isPrime(i)){
                l.insertFromStart((double) i);
            }else {
                if(isEven(i)){
                    l.insertFromStart((double) i,(double) i);
                }else {
                    l.insertFromStart((float) i,(float) i);
                }
            }

        }
        for(int i=100;i>=51;i--){
            if(isPrime(i)){
                l.insertFromEnd((double) i);
            }else {
                if(isEven(i)){
                    l.insertFromEnd((double) i,(double) i);
                }else {
                    l.insertFromEnd((float) i,(float) i);
                }
            }

        }
        l.print();
    }
    public static boolean isPrime(int num){
        int p=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                p++;
            }
        }
        if(p==1){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isEven(int num){
        if(num%2==0)
            return true;
        else
            return false;
    }
}