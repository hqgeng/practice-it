public class DollarFigure2 {
    public static final int HEIGHT = 5;
    
    public static void main(String[] args) {
        for(int i = 1; i <= HEIGHT; i++) {
            for(int j = 0; j < 2 * i - 2; j++)
                System.out.print("*");
                
            for(int j = 0; j < -i + HEIGHT + 1; j++)
                System.out.print("$");
                
            for(int j = 0; j < -2 * i + 2 * HEIGHT + 2; j++)
                System.out.print("*");
                
            for(int j = 0; j < -i + HEIGHT + 1; j++)
                System.out.print("$");
                
            for(int j = 0; j < 2 * i - 2; j++)
                System.out.print("*");
                
            System.out.println();
        }
    }
}
