import java.util.*;

class Automobile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();

        int tw;
        int fw;
        
        if(w % 2 == 0){
            if(w > 2*v && w < 4*v){
                tw = (4*v-w)/2;
                fw = (w-2*v)/2;
                System.out.print(tw +" " +fw);
                
            }
        }
        else{
            System.out.println(-1);
        }

    }
}