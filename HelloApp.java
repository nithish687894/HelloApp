public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder sb = new StringBuilder();
            sb.append("Hello, ");

            boolean first = true;

            for (String name : args) {
                if (!first) {
                    sb.append(", ");
                }
                sb.append(name);
                first = false;
            }

            sb.append("!");
            System.out.println(sb.toString());
        }
    }
}