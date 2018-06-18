import java.util.ArrayList;
import java.util.List;

public class demo_2 {

    private List<String> notes = new ArrayList<String>();
    public void add(String note){
        notes.add(note);
    }
    public void add(int location,String note){
        notes.add(location,note);
    }
    public int getSize(){
        int size=notes.size();
        return size;
    }
    public String getNote(int index){
        return notes.get(index);
    }
    public void removeNote(int index){
        notes.remove(index);
    }
    public String[] list(){
        int size=getSize();
        String[] result_set = new String[size];
        notes.toArray(result_set);
        for (int i = 0; i < notes.size(); i++) {
            result_set[i]=notes.get(i);
        }
        return result_set;
    }

    public static void main(String[] args) {

        demo_2 notebook = new demo_2();
        notebook.add("好好学习");
        notebook.add("天天向上");
        notebook.add(2,"走上人生巅峰");
        System.out.println(notebook.getSize());
//        System.out.println(notebook.getNote(0));
//        notebook.removeNote(1);
        String nb[]=notebook.list();
        for (String s:nb) {
            System.out.println(s);
        }
//        for (int i=0; i<nb.length; i++){
//            System.out.println(nb[i]);
//        }
    }
}

