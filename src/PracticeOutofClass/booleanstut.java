package PracticeOutofClass;

public class booleanstut {
    public static void main(String[] args) {

//        int a = 0;
//        boolean b = (a == 0);
        boolean passedDoor = true;
        boolean missedDoor = false;
        boolean passedAllDoors = false;
        int doorCount = 0;

        if (passedDoor) {
            System.out.println("We passed the first door!");
            doorCount = doorCount + 1;
            if (passedDoor) {
                System.out.println("We passed the second door!");
                doorCount = doorCount + 1;
                if (passedDoor) {
                    System.out.println("We passed the third door!");
                    doorCount = doorCount + 1;

                    if (doorCount == 3){
                        passedAllDoors = true;

                        if(passedAllDoors){
                            System.out.println("Congratulations you won the door program!");
                        }
                    }
                }
            }
        }
    }
}
//        System.out.println(b);
