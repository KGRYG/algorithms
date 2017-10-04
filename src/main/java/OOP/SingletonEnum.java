package OOP;

public enum SingletonEnum {
    Instance;

    public void greet() {
        System.out.println("Hello");
    }
}


class SystemExit {
    public static void main(String[] args) {
        try {
            System.exit(1);
        } finally {
            System.out.println("Finally");
        }
    }
}
