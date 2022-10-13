import java.util.*;

public class ZigZag {

    public static List<List<Integer>> listPermutations(List<Integer> list) {

        if (list.size() == 0) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            result.add(new ArrayList<Integer>());
            return result;
        }
    
        List<List<Integer>> returnMe = new ArrayList<List<Integer>>();
    
        Integer firstElement = list.remove(0);
    
        List<List<Integer>> recursiveReturn = listPermutations(list);

        for (List<Integer> li : recursiveReturn) {
    
            for (int index = 0; index <= li.size(); index++) {
                List<Integer> temp = new ArrayList<Integer>(li);
                temp.add(index, firstElement);
                returnMe.add(temp);
            }
        }
        return returnMe;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> list = new ArrayList<Integer>();
        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            for (int j = 0; j < m; j++) {
                list.add(scanner.nextInt());
            }

            List<List<Integer>> myLists = listPermutations(list);
            List<List<Integer>> subList = new ArrayList<List<Integer>>();


            for (int j = 0; j < myLists.size(); j++) {
                int a =  myLists.get(j).get(0);
                int b =  myLists.get(j).get(1);
                int c =  myLists.get(j).get(2);
                if (!(subList.contains(myLists.get(j).subList(0, 3))) && (a<b && b>c) || (a>b && b<c)) {
                    subList.add(myLists.get(j).subList(0, 3));   
                }else{
                    continue;
                }
            }
            // System.out.println(myLists);
            // System.out.println(subList.size());
            System.out.println(subList);
        }

        scanner.close();
    }
}
