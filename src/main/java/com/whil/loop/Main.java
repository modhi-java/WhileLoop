package com.whil.loop;

public class Main {

    public static void main(String[] args) {


        Employaa m1 = new Employaa();
        m1.setId(1);
        m1.setName("محمدأحمد");
        m1.setRateb(5400);


        System.out.println("اسم الموظف;" + m1.getName());
        System.out.println("بدل السكن:" + m1.getSakn());
        System.out.println("بدل النقل:" + m1.getNaql());
        System.out.println("التامينات:" + m1.getTaminat());
        System.out.println("صافي الراتب:" + m1.getsaffi());
        System.out.println("/////////////////////////////////////");


        Employaa m2 = new Employaa();
        m2.setId(2);
        m2.setName("صلاح حسن");
        m2.setRateb(4000);

        System.out.println("اسم الموظف;" + m2.getName());
        System.out.println("بدل السكن:" + m2.getSakn());
        System.out.println("بدل النقل:" + m2.getNaql());
        System.out.println("التامينات:" + m2.getTaminat());
        System.out.println("صافي الراتب:" + m2.getsaffi());
        System.out.println("/////////////////////////////////////");


        Employaa m3 = new Employaa();
        m3.setId(3);
        m3.setName("مصطفى محمود");
        m3.setRateb(3900);

        System.out.println("اسم الموظف;" + m3.getName());
        System.out.println("بدل السكن:" + m3.getSakn());
        System.out.println("بدل النقل:" + m3.getNaql());
        System.out.println("التامينات:" + m3.getTaminat());
        System.out.println("صافي الراتب:" + m3.getsaffi());
        System.out.println("/////////////////////////////////////");


        Employaa m4 = new Employaa();
        m4.setId(4);
        m4.setName("محمد أمين");
        m4.setRateb(3220);

        System.out.println("اسم الموظف;" + m4.getName());
        System.out.println("بدل السكن:" + m4.getSakn());
        System.out.println("بدل النقل:" + m4.getNaql());
        System.out.println("التامينات:" + m4.getTaminat());
        System.out.println("صافي الراتب:" + m4.getsaffi());
        System.out.println("/////////////////////////////////////");


        Employaa m5 = new Employaa();
        m5.setId(5);
        m5.setName("نس محمود ");
        m5.setRateb(2800);

        System.out.println("اسم الموظف;" + m5.getName());
        System.out.println("بدل السكن:" + m5.getSakn());
        System.out.println("بدل النقل:" + m5.getNaql());
        System.out.println("التامينات:" + m5.getTaminat());
        System.out.println("صافي الراتب:" + m5.getsaffi());
        System.out.println("/////////////////////////////////////");


        Employaa m6 = new Employaa();
        m6.setId(6);
        m6.setName("أمين مبارك");
        m6.setRateb(2900);

        System.out.println("اسم الموظف;" + m6.getName());
        System.out.println("بدل السكن:" + m6.getSakn());
        System.out.println("بدل النقل:" + m6.getNaql());
        System.out.println("التامينات:" + m6.getTaminat());
        System.out.println("صافي الراتب:" + m6.getsaffi());
        System.out.println("/////////////////////////////////////");


        Employaa m7 = new Employaa();
        m7.setId(7);
        m7.setName("عماد حمد");
        m7.setRateb(2560);

        System.out.println("اسم الموظف;" + m7.getName());
        System.out.println("بدل السكن:" + m7.getSakn());
        System.out.println("بدل النقل:" + m7.getNaql());
        System.out.println("التامينات:" + m7.getTaminat());
        System.out.println("صافي الراتب:" + m7.getsaffi());
        System.out.println("/////////////////////////////////////");


        Employaa m8 = new Employaa();
        m8.setId(8);
        m8.setName("خالد عبدالله");
        m8.setRateb(2500);

        System.out.println("اسم الموظف;" + m8.getName());
        System.out.println("بدل السكن:" + m8.getSakn());
        System.out.println("بدل النقل:" + m8.getNaql());
        System.out.println("التامينات:" + m8.getTaminat());
        System.out.println("صافي الراتب:" + m8.getsaffi());
        System.out.println("/////////////////////////////////////");


        Employaa m9 = new Employaa();
        m9.setId(9);
        m9.setName("سالم علي");
        m9.setRateb(2330);

        System.out.println("اسم الموظف;" + m9.getName());
        System.out.println("بدل السكن:" + m9.getSakn());
        System.out.println("بدل النقل:" + m9.getNaql());
        System.out.println("التامينات:" + m9.getTaminat());
        System.out.println("صافي الراتب:" + m9.getsaffi());
        System.out.println("/////////////////////////////////////");


        Employaa m10 = new Employaa();
        m10.setId(10);
        m10.setName("صالح الخالدي");
        m10.setRateb(2500);

        System.out.println("اسم الموظف;" + m10.getName());
        System.out.println("بدل السكن:" + m10.getSakn());
        System.out.println("بدل النقل:" + m10.getNaql());
        System.out.println("التامينات:" + m10.getTaminat());
        System.out.println("صافي الراتب:" + m10.getsaffi());
        System.out.println("/////////////////////////////////////");


        double[] intArray;
        intArray = new double[]{m1.getRateb(), m2.getRateb(), m3.getRateb(), m4.getRateb(), m5.getRateb(), m6.getRateb(), m7.getRateb(), m8.getRateb(), m9.getRateb(), m10.getRateb()};

        double sum = 0;
//        int i = 0;
//        while (i < intArray.length) {
//            sum = sum+intArray[i]   ;
//
//            i++;
//        }
//        System.out.println(sum);

        for (int i = 0; i < intArray.length;i++){
            sum = sum+intArray[i]   ;


        }

        //لو كان امر الطباعة داخل القوس سوف يطبع كل مرة
        System.out.println(sum);
    }
}




