package GY;

public class ThrowOrnek {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bu satıra zorunlu girildi");
        }
    }
}
