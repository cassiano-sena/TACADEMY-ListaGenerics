import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("1 - fifo");
        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.addToQueue("first");
        stringQueue.addToQueue("seciond");
        stringQueue.addToQueue("thuird");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.removeFromQueue());
        }

        //2
        System.out.println("\n2 - family");
        Family<String> family = new Family<>();
        family.addMember("joao");
        family.addMember("yasmin");
        family.addMember("jorge");
        family.familyDinner();
        family.familyTravel();
//        for (String member : family.getMembers()) {
//            System.out.println(member);
//        }

        //3
        System.out.println("\n3 - employees");
        Employee<String> employees = new Employee<>();
        employees.addEmployee("ana");
        employees.addEmployee("beto");
        employees.addEmployee("cassiano");
        employees.work();
        employees.receiveSalary();
//        for (String employee : employees.getEmployees()) {
//            System.out.println(employee);
//        }

        //4
        System.out.println("\n4 - network:");
        NetworkSimulator<String> network = new NetworkSimulator<>();
        network.addComponent("Router");
        network.addComponent("Switch");
        network.addComponent("PC");
        network.simulate();

        //5
        System.out.println("\n5 - characters");
        Characters<String> characters = new Characters<>();
        characters.addCharacter("batman");
        characters.addCharacter("spiderman");
        characters.addCharacter("superman");
        for (String character : characters.getCharacters()) {
            System.out.println(character);
        }

        //6
        System.out.println("\n6 - Data Analyzer:");
        DataAnalyzer<String> dataAnalyzer = new DataAnalyzer<>();
        dataAnalyzer.addData("information");
        dataAnalyzer.addData("data");
        dataAnalyzer.addData("2");
        dataAnalyzer.analyze();
//        for (String data : dataAnalyzer.getData()) {
//            System.out.println(data);
//        }
    }
}

class GenericQueue<T> {
    private Queue<T> queue = new LinkedList<>();
    public void addToQueue(T item) {
        queue.add(item);
    }
    public T removeFromQueue() {
        return queue.poll();
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

class Family<T> {
    private List<T> members = new ArrayList<>();
    public void addMember(T member) {
        members.add(member);
    }
    public void removeMember(T member) {
        members.remove(member);
    }
    public List<T> getMembers() {
        return new ArrayList<>(members);
    }
    public void familyDinner() {
        for (T member : members) {
            System.out.println(member + " is having dinner.");
        }
    }
    public void familyTravel() {
        for (T member : members) {
            System.out.println(member + " is traveling.");
        }
    }
}

class Employee<T> {
    private List<T> employees = new ArrayList<>();
    public void addEmployee(T employee) {
        employees.add(employee);
    }
    public void removeEmployee(T employee) {
        employees.remove(employee);
    }
    public List<T> getEmployees() {
        return new ArrayList<>(employees);
    }
    public void receiveSalary() {
        for (T employee : employees) {
            System.out.println(employee + " received salary.");
        }
    }
    public void work() {
        for (T employee : employees) {
            System.out.println(employee + " is working.");
        }
    }
}

class NetworkSimulator<T> {
    private List<T> components = new ArrayList<>();
    public void addComponent(T component) {
        components.add(component);
    }
    public void removeComponent(T component) {
        components.remove(component);
    }
    public List<T> getComponents() {
        return new ArrayList<>(components);
    }

    public void simulate() {
        for (T component : components) {
            System.out.println("simulating "+component);
        }
    }
}

class Characters<T> {
    private List<T> characters = new ArrayList<>();
    public void addCharacter(T character) {
        characters.add(character);
    }
    public void removeCharacter(T character) {
        characters.remove(character);
    }
    public List<T> getCharacters() {
        return new ArrayList<>(characters);
    }
}

class DataAnalyzer<T> {
    private List<T> data = new ArrayList<>();

    public void addData(T dataPiece) {
        data.add(dataPiece);
    }

    public void removeData(T dataPiece) {
        data.remove(dataPiece);
    }

    public List<T> getData() {
        return new ArrayList<>(data);
    }

    public void analyze() {
        for (T information : data) {
            System.out.println("analizing "+information);
        }
    }
}
