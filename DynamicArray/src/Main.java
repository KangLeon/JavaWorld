

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(99);
        list.add(88);
        list.add(77);
        list.add(66);
        list.add(10);

        for (int i=0; i<30; i++){
            list.add(i);
        }

        System.out.println(list.toString());
    }
}
