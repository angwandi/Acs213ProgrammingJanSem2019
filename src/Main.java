
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

class Three extends Two {
    void print_step() {
        System.out.println("steps");
    }
}


class Main {
    public static void main(String[] args) {
        Three inno = new Three();
        inno.print_java();
        inno.print_for();
        inno.print_java();
        inno.print_step();

    }
}