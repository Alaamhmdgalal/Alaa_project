package dataStructures;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> arrayOfPerson = new ArrayList<>();

        System.out.println("Enter the data (press 0 if want to stop): ");
        Scanner scan = new Scanner(System.in);

    for(;;){
        String input = scan.next();
        String[] s = input.split(",");
        Person p = new Person();

        for(int i=0; i<s.length-1; i++){
            p.setName(s[i]);
            p.setAge(Integer.parseInt(s[(i+1)]));
            arrayOfPerson.add(p);
        }

        if(s[0].equals("0")|| s[1].equals("0")){
        for(int i=0; i<arrayOfPerson.size();i++){
            System.out.println("Name: " + arrayOfPerson.get(i).getName() + "  Age: " + arrayOfPerson.get(i).getAge());
        }
        break;
        }
    }
    }
}
