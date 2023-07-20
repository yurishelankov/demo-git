public class DoWhile {
    public static void main(String[] args)
	throws java.io.IOException{
            char ch;
            do{
                System.out.print("нажми нужную клавишу,а затем ENTER:");
                ch = (char)System.in.read();
            }
            while(ch!='q');
        }
}
