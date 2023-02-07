package Polymorphism;
//Why Method Overloading is not possible by changing the return type of method only?


class Adderr{

static int add1(int a,int b)

{

return a+b;

}

static double add(int a,int b)

{

return a+b;

}

}



class TestOverloading3

{

public static void main(String[] args)

{

System.out.println(Adderr.add1(11,11));

}

}
