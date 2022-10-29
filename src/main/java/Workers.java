public class Workers {
    public static void main(String[]args) {
        int programmer = 4;
        int tester = 2;
        int support = 3;
        int alltesters = tester * programmer;
        int allsupport = support * programmer;
        int allworkers = programmer + alltesters + allsupport;
System.out.print ("Всего людей на проекте: " + allworkers);

    }
}
