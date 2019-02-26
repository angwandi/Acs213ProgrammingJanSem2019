
class One {
    void print_java() {
        System.out.println("Java");
    }

}

class Two extends One {
    void print_for() {
        System.out.println("for");
    }
}

class Main {
    public static void main(String[] args) {
        Two inno = new Two();
        inno.print_java();
        inno.print_for();
        inno.print_java();

    }
}