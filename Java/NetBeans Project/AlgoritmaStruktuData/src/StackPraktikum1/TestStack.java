package StackPraktikum1;

/**
 * @author Sultan
 * @see TestStack
 */
public class TestStack {
    public static void main(String[] args) {
        Stack tumpuk = new Stack(5);

        tumpuk.push(20);
        tumpuk.push(21);
        tumpuk.push(12);
        tumpuk.push(19);
        tumpuk.push(11);

        tumpuk.tampilkan();

        tumpuk.pop();
        tumpuk.tampilkan();
    }
}