import java.util.*;

public class Tarung2 {
    public static void main(String args[])   {

        Scanner scanner = new Scanner (System.in);
        List<Integer> list = new ArrayList<Integer>();
        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // sort value, ignoring neg or pos
        Collections.sort(list.subList(1, list.size()),(o1, o2) -> Integer.compare(Math.abs(o1), Math.abs(o2))); // n=5 3 4 2 -4 1 -> 3 1 2 -4 4

        // selisih p1 dan p2
        int diff = Math.abs(list.get(0) - list.get(1));
        
        // jika p1 < p2
        if(list.get(0) < list.get(1)){
            System.out.println("Kalah");
        } else{
            for (int i = 1; i < n-1; i++) {

                if ((diff < list.get(i+1)))  { // jika selisih Pi < Pi+1
                    if ((i+2)==n) { //jika sudah mencapai perbandingan akhir
                        System.out.println("Kalah");
                        break;
                    } else {
                        Collections.swap(list, i+1, i+2);   // 3 4 2 -4 1 -> 3 1 2 -4 4      
                        diff = Math.abs(diff - list.get(i+1));
                    }

                } else if(diff >= list.get(i+1)){ // jika selisih Pi >= Pi+1
                    if((i+2)==n){ // jika sudah mencapai perbandingan akhir
                        System.out.println("menang");
                        System.out.println(list);
                        break;
                    }else{
                        diff = Math.abs(diff - list.get(i+1));
                    }
                }else {
                    System.out.println(".....");
                }
            }
        }
        scanner.close();
    
    }  
}
