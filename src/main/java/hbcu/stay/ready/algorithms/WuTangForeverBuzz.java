package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(){

        String number = "";
        for(int n = 1; n <= 15;n++){
            if ((n%3==0)&&(n%5==0))
                number += ("WuTang Forever");
            //when i had the rest as if's it kept printing out the number and the string instead of replacing
            // so else if IS important fr
            else if (n%3==0)
                number+=("Wu\n");
            else if (n%5==0)
                number+=("Tang\n");
            else
                number+=n+"\n";
        }
        return number;
    }
}
