package ch6;

public class BlockTest {
    int count = 5;
    static{
        System.out.println("static { }");
    }
    {
        ++count;
        System.out.println("{ }" + count);
    }
    public BlockTest(){
        ++count;
        System.out.println("생성자" + count);
    }
    public static void main(String args[]){
        BlockTest bt = new BlockTest();
        BlockTest bt2 = new BlockTest();
    }
}
