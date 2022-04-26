public class Animal {

   public void run (int length,String name,int maxrun){
       if(maxrun==200)
       if(length<=maxrun)
            System.out.println(name+" пробежал(а):"+length+" метров.");
       else {
           System.out.println(name+" не смог(ла) пробежать:"+length+" метров и устал(а).");
       }
       if(maxrun==500)
       if(length<=maxrun)
           System.out.println(name+" пробежал(а):"+length+" метров.");
       else {
           System.out.println(name+" не смог(ла) пробежать:"+length+" метров и устал(а).");
       }
    }
    public void swim(int length,String name,int maxswim){
       if(maxswim==10)
           if (length<=maxswim)
        System.out.println(name+" проплыл(а):"+length+" метров");
       else{
            System.out.println(name+" не смог(ла) проплыть:"+length+" метров и устал(а).");
        }
       if(maxswim==0)
           System.out.println(name+" не смог(ла), т.к коты(кошки), не умеют плавать.");
    }

}
