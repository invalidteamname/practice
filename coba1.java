import java.util.*;
public class coba1  
{  
public static void main(String args[])   
{  
    Scanner scanner = new Scanner (System.in);
    List<Integer> list = new ArrayList<Integer>();
    
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
        list.add(scanner.nextInt());
    }

    Collections.sort(list.subList(1, list.size()),(o1, o2) -> Integer.compare(Math.abs(o1), Math.abs(o2)));
    System.out.println("===SEBELUM PROSES LOOPING===");
    System.out.println("sebelum: "+list);

    // selisih p1 dan p2
    int diff = Math.abs(list.get(0) - list.get(1));
    System.out.println("diff: "+diff);
    System.out.println("================================");
    
    // jika p1 < p2
    if(list.get(0) < list.get(1)){
        System.out.println("Kalah");
    } else{
        // ditambahkan 0 di index terakhir untuk pengecekan end dari list
        // list.add(n, 0);

        for (int i = 1; i < n-1; i++) {
            System.out.println("=====LOOP KE-"+i+"=====");
            System.out.println("DIFF LOOP KE-"+i+": "+diff);
            // jika selisih Pi < Pi+1
            if ((diff < list.get(i+1)) && ((i+2) !=n))  { // if a
                System.out.println("===== IF A =====");
                System.out.println("i+1="+(i+1)+" n="+n);
                System.out.println("if diff["+diff+"] < get i+1["+list.get(i+1)+"]");
                // j digunakan untuk proses swap value
                int j = i+1;
                System.out.println("Collections.swap(List:"+list+", j:"+j+", j+1:"+(j+1)+")");
                Collections.swap(list, j, j+1);
                
                System.out.println("hasil swap: "+list);
                // hitung lagi selisih setelah swap
                System.out.println("Math.abs(diff["+diff+"]"+"- get i+1["+list.get(i+1)+"])");
                diff = Math.abs(diff - list.get(i+1));
                System.out.println("Hasil diff: "+diff);
                System.out.println("i++ di if a menjadi: "+i);
                
            } else if(diff >= list.get(i+1)){ //B
                System.out.println("===== IF B =====");
                System.out.println("i+1="+(i+1));
                System.out.println("Math.abs(diff["+diff+"]"+"- geti+1["+list.get(i+1)+"])");
                diff = Math.abs(diff - list.get(i+1));
                System.out.println("Hasil diff: "+diff);
                if((i+2)==n){
                    System.out.println("menang");
                    System.out.println(list);
                }
            }else if (diff < list.get(i+1) && (i+2)==n) { //C
                System.out.println("===== IF C =====");
                System.out.println("diff["+diff+"] < get(i+1)["+list.get(i+1));
                System.out.println("Kalah");
                break;
            }else{
                System.out.println("menang");
                System.out.println(list);
            }

            //tempat di luar if else
        }
    }
    
        // for (int i = 1; i < list.size()-1; i++){
        //     if(list.get(i) < 0){
        //         list.add(i, list.get(i));
        //         int 
        //     }
        //     list.set(i, Math.abs(list.get(i)));
        //     i++;
        // }
        // Collections.sort(list.subList(1, list.size()));  

        // if (list.get(j) < list.get(j+1)){
        //     System.out.println("kalah");
        // }else{
        //     System.out.println("menang");
        //     System.out.println("setelah sort: " + list);
        // }
    scanner.close();
}  


}  