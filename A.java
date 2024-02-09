class X
{
    int m = 1111;

    {
        m = m++; // m = 1111

        System.out.println(m);
    }
}

class Y extends X
{
    {
        System.out.println(methodOfY());
    }

    int methodOfY()
    {
        return m-- + --m;
    }
    // 1111 + 1099   // 1110
}

public class A
{
    public static void main(String[] args)
    {
        Y y = new Y();
    }
}