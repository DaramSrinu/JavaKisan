package TypeCasting;

public class WrapperClass {
    void meth1(){
        System.out.println("Implementing Auto - Boxing");
        int i = 10;
        Integer ival1 = Integer.valueOf(i);
        Integer ival2 = Integer.valueOf(100);
        Integer ival3 = Integer.valueOf("99");

        System.out.println("int PDT value : " + i);
        System.out.println("Integer WCO value :  " + ival1);
        System.out.println("Integer WCO value :  " + ival2);
        System.out.println("Integer WCO value :  " + ival3);

        System.out.println("---------------------------");

        byte b = 50;
        Byte bval1 = Byte.valueOf(b);
        Byte bval2 = Byte.valueOf((byte)i);

        System.out.println("byte PDT value :  " + b);
        System.out.println("byte WCO value :  " + bval1);
        System.out.println("byte WCO value :  " + bval2);

        System.out.println("---------------------------");

        char c = 'A';
        Character cval1 = Character.valueOf(c);
        //Character cval2 = Character.valueOf("Z"); // C.E because it will accepts only char PDT

        System.out.println("char PDT value : " + c);
        System.out.println("Character WCO value :" + cval1);
       // System.out.println("Character WCO value :" + cval2);

        // Boolean booleanval = new Boolean(true);
        // The above construcotr Boolean(boolean) is deprecated since version 9
    }

    void meth2(){
        //Integer iva1 = new Integer(10);
        Integer iva2 = Integer.valueOf(100);
        Integer iva3 = Integer.valueOf(500);

        int i1 = iva2;
        int i2 = iva3.intValue();

        System.out.println("Integer WCO: " + iva2);
        System.out.println("Integer WCO: " + iva3);
        System.out.println();

        System.out.println("int PDT : " + i1);
        System.out.println("int PDT : " + i2);
        System.out.println("-------------------------");

        Boolean bva1 = Boolean.valueOf(true);
        Boolean bva2 = Boolean.valueOf("fLAse");
        Boolean bva3 = Boolean.valueOf("java is awesome");

        boolean b = bva1.booleanValue();

        System.out.println("Boolean WCO: " + bva1);
        System.out.println("Boolean WCO: " + bva2);
        System.out.println("Boolean WCO: " + bva3);

        System.out.println("boolean PDT: " + b);

    }
    public static void main(String[] args){
        WrapperClass wc = new WrapperClass();
        wc.meth1();
        wc.meth2();
    }
}
