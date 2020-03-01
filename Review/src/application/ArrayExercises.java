package application;

public class ArrayExercises {

    static String[] roster;

    public static void main(String[] args) {   
        setupRoster();
        insertAfter(-1, "Yetunde");
        print();
    }

    static void add(String studentName) {
        for(int i = 0; i < roster.length; ++i) {
            if(roster[i] == null) {
                roster[i] = studentName;
                return;
            }
        }
    }

    static void update(int studentIndex, String studentName) {
        roster[studentIndex] = studentName;
    }

    static void remove(int studentIndex) {
        roster[studentIndex] = null;
    }

    static String get(int studentIndex) {
        return roster[studentIndex];
    }

    static void insertAfter(int index, String studentName) {
        int currentIndex = roster.length - 2;
        while(currentIndex > index) {
            roster[currentIndex + 1] = roster[currentIndex];
            currentIndex--;
        }

        roster[index + 1] = studentName;
    }

    static void insertBefore(int index, String studentName) {
        int currentIndex = roster.length - 2;
        while(currentIndex >= index) {
            roster[currentIndex + 1] = roster[currentIndex];
            currentIndex--;
        }

        roster[index] = studentName;
    }

    static void print() {
        for (String name : roster) {
            System.out.println(name);
        }
    }

    static void setupRoster() {
        roster = new String[20];
        roster[0] = "Malik";
        roster[1] = "Jiahua";
        roster[2] = "Joseph";
        roster[3] = "Mahyawi";
        roster[4] = "Celeste";
        roster[5] = "Henry";
        roster[6] = "Erica";
        roster[7] = "Daniel";
        roster[8] = "Stephane";
        roster[9] = "Eric";
        roster[10] = "Alex";
        roster[11] = "Frederick";
        roster[12] = "Rajatvir";
        roster[13] = "Brandon";
        roster[14] = "Cameron";
        roster[15] = "Caleb";
        roster[16] = "Sephen";
    }
}