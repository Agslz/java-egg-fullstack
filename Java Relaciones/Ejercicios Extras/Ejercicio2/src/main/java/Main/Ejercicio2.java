package Main;

public class Ejercicio2 {

    public static void main(String[] args) {

        String[][] Sala = new String[8][6];
        String[] tipos = {"A", "B", "C", "D", "E", "F"};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i+1));
                Sala[i][j] = tipos[j];
                System.out.print(Sala[i][j]);
                System.out.print("X");
                if (j != Sala[i].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
}
