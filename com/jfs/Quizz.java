package com.jfs;

public class Quizz {

        /*public static void main(String[] args)
        {
            Thread thread1 = new Thread("A");

            thread1.start();
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setPriority(8);
            System.out.println(Thread.currentThread().getPriority());
            Thread thread2 = new Thread("B");

            thread2.start();

            System.out.println(thread1.getPriority());

            System.out.println(thread2.getPriority());
        }*/


//        public static void main(String[] args)
//        {
//            String string = "JAVA";
//
//            StringBuffer sbuffer = new StringBuffer(string);
//
//            StringBuilder sBuilder = new StringBuilder(string);
//
//            System.out.println(string.equals(sbuffer));
//
//            System.out.println(string.equals(sBuilder));
//
//            System.out.println(sbuffer.equals(sBuilder));
//        }


        public static void main(String[] args)
        {
            Thread t3 = new Thread()
            {
                @Override
                public void run()
                {
                    System.out.println(3);
                }
            };

            Thread t2 = new Thread()
            {
                @Override
                public void run()
                {
                    try
                    {
                        t3.join();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println(2);
                }
            };

            Thread t1 = new Thread()
            {
                @Override
                public void run()
                {
                    try
                    {
                        t2.join();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println(1);
                }
            };
            t1.start();
            t2.start();
            t3.start();
        }

}
