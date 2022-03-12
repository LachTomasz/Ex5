public class Arguments {
    public static void main(String[] args) {
        int digitArgs = args.length;
        System.out.println("All possible arguments: "+digitArgs);
        //or
        System.out.println("All possible arguments: "+args.length);
        for (int i = 0; i < args.length; i ++){
            System.out.println("Argument # " + i + "\t" + args[i]);
        }
    }
}
