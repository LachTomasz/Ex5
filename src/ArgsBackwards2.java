public class ArgsBackwards2 {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            char[] temp = args[i].toCharArray();
            for (int j = 0 , k = args[i].length()-1; j<k; j++, k --) {
                char tmp = temp[j];
                temp[j] = temp[k];
                temp[k] = tmp;
            }
            System.out.println(temp);
        }
    }
}
