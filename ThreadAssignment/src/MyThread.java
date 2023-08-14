public class MyThread extends Thread{
    boolean isOdd;
    int length;
    MyThread(String name,boolean isOdd,int length){
        super(name);
        this.isOdd=isOdd;
        this.length=length;
    }
    @Override
    public void run(){
        if(isOdd){
            for(int i=1;i<=length;i+=2){
                System.out.println(i);
            }
        }else{
            for(int i=0;i<=length;i+=2){
                System.out.println(i);
            }
            }
        }
        @Override
    public String toString(){
        if(isOdd){
            return "Odd Thread whose length is  " + length;
        }else {
            return "Even Thread whose length is  " + length;
        }
        }
    }

