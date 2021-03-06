/*
Label example:

 ******* Programowanie *******
 *  obiektowe w języku Java  *
 *       Name Surname        *
 *****************************
 */
public class ArgLabel {
    public static void main(String[] args) {

       String LabelLine1 = "********** Programowanie **********"; //35
       String LabelLine2 = "*    obiektowe w języku Java      *";
       StringBuilder LabelLine3 = new StringBuilder();
       String LabelLine4 = "***********************************";
       String Name = args[0] + " " + args[1];
       int StringLength = LabelLine1.length() - 2 - Name.length();
       if (StringLength > 0) {
            if (StringLength % 2 == 0) {
                for (int i = 0; i < StringLength / 2; i++)
                    LabelLine3.append(" ");
                LabelLine3 = new StringBuilder("*" + LabelLine3 + Name + LabelLine3 + "*");
            } else {
                StringLength--;
                for (int i = 0; i < StringLength / 2; i++)
                    LabelLine3.append(" ");
                LabelLine3 = new StringBuilder("*" + LabelLine3 + Name + LabelLine3 + " *");
            }
        }
        System.out.println(LabelLine1);
        System.out.println(LabelLine2);
        System.out.println(LabelLine3);
        System.out.println(LabelLine4);
    }
}
