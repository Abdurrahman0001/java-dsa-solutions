package dsa.oops;

public class Box {
    int value = 20;

    public static void main(String[] args) {
        Box b1 = new Box();  // object in heap
        Box b2 = b1;  // b2 point to the same objects.

        b2.value = 30;  // change via b2
        System.out.println(b1.value);  // change in b1 too,because of b1 and b2 point to the same object.


    }
}
