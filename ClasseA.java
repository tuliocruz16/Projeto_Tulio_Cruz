public class ClasseA {

    ClasseA classeA;
    private int a1;
    private float a2;

    public int getA1() {
        return a1;
    }
    public void setA1(int a1) {
        this.a1 = a1;
    }
    public float getA2() {
        return a2;
    }
    public void setA2(float a2) {
        this.a2 = a2;
    }

    public void mA1(){
        System.out.println("mA1");
    }

    public void mA2(){
        System.out.println("mA2");
    }

    public void mA3(){
        System.out.print("Alteração da classe A a partir do clone");
    }
}