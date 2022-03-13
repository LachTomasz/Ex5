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
       String LabelLine3 = "";
       String LabelLine4 = "***********************************";
       String Name = args[0];
       String Surname = args[1];
       int StringLength = Name.length() + Surname.length() - 30;

       //StringLength < 0
        if (StringLength < 0){
            if (StringLength % 2 == 0){
                for(int i = 0; i < StringLength/2; i++){
                    LabelLine3.s
                }

            }
            else {

            }
        }

        LabelLine3 = "* "+ Name + " " + Surname + " *";

        System.out.println(LabelLine1);
        System.out.println(LabelLine2);
        System.out.println(LabelLine3);
        System.out.println(LabelLine4);


    }
}
