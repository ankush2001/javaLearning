package ankush;

public class printZ {
    public static void main(String[] args) {
        int N=5;

        int index, side_index;
        String Top = "*", Bottom = "*", Diagonal = "*";
        for (index = 0; index < N; index++)
            System.out.print(Top + " ");

        System.out.println();
        for (index = 1; index < N - 1; index++)
        {
            for (side_index = 0;
                 side_index < 2 * (N - index - 1);
                 side_index++)
                System.out.print(" ");
            System.out.print(Diagonal);

            System.out.println();
        }
        for (index = 0; index < N; index++)
            System.out.print(Bottom + " ");
    }
}
