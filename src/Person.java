public class Person {
    String name;
    int rank;
    //Person next = null;

    public Person(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    /*public Person(String name, Person next) {
        this.name = name;
       // this.next = next;
    }*/

    public String getName(){
        return name;
    }

    public int getRank() {
        return rank;
    }
}
    /*public Person getNext() {
    return next;
    }*/

