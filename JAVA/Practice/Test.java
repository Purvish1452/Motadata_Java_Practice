
    interface InnerInterface {
        void msg();
    }


class Test implements InnerInterface {

    public void msg()
    {

        System.out.println(
            "Message from Nested Interface Inside an Interface!");
    }

    public static void main(String[] args){
        
        InnerInterface obj = new Test();
        obj.msg();
    }
}