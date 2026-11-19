
public class Soal10 {
    public static void main(String[] args) {
        Object[] data = {19, 0.2, 'C', "Java", true};

        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] = " + data[i]
                    + "  (" + data[i].getClass().getSimpleName() + ")");
        }
    }
}
