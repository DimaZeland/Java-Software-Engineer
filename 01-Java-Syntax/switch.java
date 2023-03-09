public class MyClass {

    public static void main(String[] args) {
    }

    public static void switchJava12V1() {
        int count = 2;
        int value = switch (count) {
            case 1 -> 12;
            case 2 -> 32;
            case 3 -> 52;
            default -> 0;
        };
    }

    public static void switchJava12V2() {
        int count = 2;
        int value = switch (count) {
            case 1 -> {
                //деякі обчислювальні операції...
                break 12;
            }
            case 2 -> {
                //деякі обчислювальні операції...
                break 32;
            }
            case 3 -> {
                //деякі обчислювальні операції...
                break 52;
            }
            default -> {
                //деякі обчислювальні операції...
                break 0;
            }
        };
    }

    public static void switchJava12V3() {
        int count = 2;
        int value = switch (count) {
            case 1, 3, 5 -> 12;
            case 2, 4, 6 -> 52;
            default -> 0;
        };
    }

    public static void switchJava13() {
        int count = 2;
        int value = switch (count) {
            case 1:
                yield 12;
            case 2:
                yield 32;
            case 3:
                yield 52;
            default:
                yield 0;
        };
    }
}